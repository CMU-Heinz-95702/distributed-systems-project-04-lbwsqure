<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Fish Logs Dashboard</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<h1>Fish Logs Dashboard</h1>
<table>
    <thead>
    <tr>
        <th>Fish Name</th>
        <th>Status</th>
        <th>Message</th>
        <th>Response Code</th>
        <th>Timestamp</th>
        <th>Start Time</th>
        <th>End Time</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="log" items="${logs}">
        <tr>
            <td>${log.fishName}</td>
            <td>${log.status}</td>
            <td>${log.message}</td>
            <td>${log.responseCode}</td>
            <td>${log.timestamp}</td>
            <td>${log.startTime}</td>
            <td>${log.endTime}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
