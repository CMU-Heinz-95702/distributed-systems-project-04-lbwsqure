# Project 4: FishFetcher

This project is designed to fetch and display fish distribution data using both a dashboard and a dynamic API endpoint. It integrates Java servlets, MongoDB, and an Android application for interactive visualization.

---

## Project Structure

- **`./dashboard`**  
  Displays a login information dashboard that retrieves log data stored in a MongoDB database. Logs are dynamically fetched using Java servlets and shown in a web-based interface.  
  **Example:**  
  Access the dashboard at: `http://localhost:8080/dashboard`

- **`./fishSelector/fishName`**  
  Provides a JSON response for the fish distribution data fetched from the external GBIF API. This endpoint processes the fish name provided in the URL and returns distribution points and map HTML.  
  **Example:**  
  Access the API at: `http://localhost:8080/fishSelector/Micropterus%20salmoides`

---

## How It Works

### Dashboard (`/dashboard`)
- Retrieves log data from MongoDB.
- Displays logs such as fish names, timestamps, and statuses in a web-based table.

### API Endpoint (`/fishSelector/{fishName}`)
- Accepts a fish's scientific name as a path parameter.
- Fetches the corresponding taxon key and distribution data from the GBIF API.
- Logs the operation in MongoDB and returns:
  - **`distributionData`**: A JSON array of distribution points.
  - **`mapHtml`**: A dynamic HTML snippet for a Leaflet.js map.

---

## Features
- **Interactive Map:**  
  Displays fish distribution data using Leaflet.js in the Android WebView.

- **Database Integration:**  
  MongoDB is used for logging and data tracking.

- **Responsive API:**  
  Fetches real-time data from the GBIF API.

---

## Message to Grader

I talked to **Shuzhenghe** yesterday and showed her my progress on this project. Can you please apply **only one late day** to this submission?  
If this cannot be arranged, kindly email me at [zhiyang](mailto:zhiyang3@andrew.cmu.edu).

Thank you!  
**Zhiyang Zhang**


[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/JRWw4q8L)
