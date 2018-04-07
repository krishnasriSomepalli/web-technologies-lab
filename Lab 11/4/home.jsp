<!DOCTYPE html>
<html>
<head>
    <title>Details</title>
</head>
<body>  
    <% String name =  request.getParameter("name");
        String address = request.getParameter("address");
        String age = request.getParameter("age");
        String qual = request.getParameter("qual");
        String percent = request.getParameter("percent");
        String year = request.getParameter("year"); %>
    <h1>Your Details</h1>
    <table width="40%">
        <tr>
            <td>Full Name</td>
            <td><%= name %></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><%= address %></td>
        </tr>
        <tr>
            <td>Age</td>
            <td><%= age %></td>
        </tr>
        <tr>
            <td>Qualification</td>
            <td><%= qual %></td>
        </tr>
        <tr>
            <td>Percentage</td>
            <td><%= percent %></td>
        </tr>
        <tr>
            <td>Year of Passout</td>
            <td><%= year %></td>
        </tr>
    </table>
</body>
</html>