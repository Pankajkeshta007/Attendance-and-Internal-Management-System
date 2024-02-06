<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        #navbar {
            background-color: #333;
            color: #fff;
            padding: 15px;
            text-align: center;
        }

        #sidebar {
            background-color: #555;
            color: #fff;
            width: 200px;
            padding: 20px;
            position: fixed;
            height: 100%;
            box-shadow: 2px 0 5px rgba(0, 0, 0, 0.1);
        }

        #content {
            margin-left: 250px;
            padding: 20px;
        }

        #admin-info {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 20px;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        #admin-info img {
            width: 50px;
            height: 50px;
            border-radius: 50%;
            margin-right: 10px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
            overflow: hidden;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            background-color: #fff;
            border-radius: 8px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 12px;
            text-align: left;
        }

        th {
            background-color: #333;
            color: #fff;
            width: 30%;
        }

        td {
            width: 30%;
        }

        ul {
            list-style-type: none;
            padding: 0;
            margin: 0;
            display: flex;
            justify-content: space-around;
            background-color: #333;
            border-bottom: 2px solid #555;
        }

        li {
            padding: 15px;
        }

        a {
            text-decoration: none;
            color: #fff;
        }

        a:hover {
            color: #ffd700;
        }
    </style>
</head>
<body>

    <div id="navbar">
        <h1>Admin Dashboard</h1>
        <ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">Student Section</a></li>
            <li><a href="#">Faculty Section</a></li>
            <li><a href="#">Branch Section</a></li>
            <li><a href="#">Subject Section</a></li>
        </ul>
    </div>

    <div id="sidebar">
        <div id="admin-info">
            <img src="admin-image.jpg" alt="Admin Image">
            <div>
                <p>Name: John Doe</p>
                <p>Role: Administrator</p>
            </div>
        </div>
    </div>

    <div id="content">
        <h2>Admin Information</h2>
        <table>
            <tr>
                <th>Name</th>
                <td>John Doe</td>
            </tr>
            <tr>
                <th>Role</th>
                <td>Administrator</td>
            </tr>
            <tr>
                <th>Username</th>
                <td>john_doe</td>
            </tr>
            <tr>
                <th>Password</th>
                <td>*********</td>
            </tr>
            <tr>
                <th>Email</th>
                <td>john.doe@example.com</td>
            </tr>
        </table>
    </div>

</body>
</html>
