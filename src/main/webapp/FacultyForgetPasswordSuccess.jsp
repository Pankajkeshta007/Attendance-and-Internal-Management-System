<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success Message</title>
    
    <style>
        /* Style for the message box container */
        .message-container {
            display: flex;
            justify-content: center;
            align-items: center;
            position: fixed;
            z-index: 1;
            left: 0;
            top: 0;
            width: 100%;
            height: 100%;
            background-color: rgba(0, 0, 0, 0.5); /* Semi-transparent background for blur effect */
        }

        .message-box {
            background-color: #fefefe;
            padding: 20px;
            border: 1px solid #888;
            width: 300px;
            text-align: center;
        }

        /* Style for the close button */
        .close-button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<!-- Message box container -->
<div id="messageContainer" class="message-container" style="display: none;">
    <div class="message-box">
        <p> Password updated successfully!!!</p>
        <button class="close-button" onclick="navigateToAnotherPage()">OK</button>
    </div>
</div>

<script type="text/javascript">
    // Function to open the message box
    function openMessage() {
        var messageContainer = document.getElementById('messageContainer');
        messageContainer.style.display = 'flex';
    }

    // Function to close the message box
    function closeMessage() {
        var messageContainer = document.getElementById('messageContainer');
        messageContainer.style.display = 'none';
    }

    // Function to navigate to another JSP file
    function navigateToAnotherPage() {
        window.location.href = 'FacultyLogin.jsp'; // Replace 'anotherPage.jsp' with the actual page you want to navigate to
    }
</script>

<!-- Trigger the message box on page load -->
<script type="text/javascript">
    window.onload = function () {
        openMessage();
    };
</script>

</body>
</html>
