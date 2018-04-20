<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
	<h1>Registration Form</h1>
    <form action="Registration" method="post">
        <table style="width: 50%">
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address"/></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><input type="number" name="age"/></td>
            </tr>
            <tr>
                <td>Qualification</td>
                <td><input type="text" name="qual"/></td>
            </tr>
            <tr>
                <td>Percentage</td>
                <td><input type="number" name="percent" step="0.01"/></td>
            </tr>
            <tr>
                <td>Year of Passing</td>
                <td><input type="number" name="year"/></td>
            </tr>
        </table>
        <input type="submit" value="Submit"/>
    </form>
</body>
</html>