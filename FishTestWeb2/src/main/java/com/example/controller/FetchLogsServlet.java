package com.example.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FetchLogsServlet is a Java servlet that retrieves log data from a MongoDB
 * database and forwards it to a JSP page for display.
 *
 * @author Zhiyang Zhang
 * andrewid zhiyang3
 */
@WebServlet("/dashboard")
public class FetchLogsServlet extends HttpServlet {

    private static final String MONGO_URI = "mongodb+srv://zy:zzyzz@fishlogdatabase.ej4ok.mongodb.net/?retryWrites=true&w=majority&appName=FishLogDataBase";
    private static final String DATABASE_NAME = "FishAnalytics";
    private static final String COLLECTION_NAME = "Logs";
    /**
     * Handles GET requests to fetch logs from the MongoDB database and forwards
     * the data to the index.jsp page.
     *
     * @param request  The HttpServletRequest object that contains the request the
     *                 client made to the servlet.
     * @param response The HttpServletResponse object that contains the response
     *                 the servlet returns to the client.
     * @throws IOException      If an input or output error is detected when the
     *                          servlet handles the GET request.
     * @throws ServletException If the request could not be handled.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Document> logsList = new ArrayList<>();

        try (MongoClient mongoClient = MongoClients.create(MONGO_URI)) {
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(COLLECTION_NAME);

            // Fetch all logs from MongoDB
            for (Document log : collection.find()) {
                logsList.add(log);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Pass logs to the JSP page
        request.setAttribute("logs", logsList);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
