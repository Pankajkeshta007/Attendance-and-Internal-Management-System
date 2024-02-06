<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<%
    // Retrieve parameters from the form
    String attendancePercentageStr = request.getParameter("attendancePercentage");
    String mst1MarksStr = request.getParameter("mst1Marks");
    String mst2MarksStr = request.getParameter("mst2Marks");
    String quizMarksStr = request.getParameter("quizMarks");
    String assignmentMarksStr = request.getParameter("assignmentMarks");

    // Convert String parameters to double
    double attendancePercentage = Double.parseDouble(attendancePercentageStr);
    double mst1Marks = Double.parseDouble(mst1MarksStr);
    double mst2Marks = Double.parseDouble(mst2MarksStr);
    double quizMarks = Double.parseDouble(quizMarksStr);
    double assignmentMarks = Double.parseDouble(assignmentMarksStr);

    // Calculate attendance marks based on the given conditions
    int attendanceMarks = 0;
    if (attendancePercentage >= 75 && attendancePercentage < 80) {
        attendanceMarks = 1;
    } else if (attendancePercentage >= 80 && attendancePercentage < 85) {
        attendanceMarks = 2;
    } else if (attendancePercentage >= 85 && attendancePercentage < 90) {
        attendanceMarks = 3;
    } else if (attendancePercentage >= 90) {
        attendanceMarks = 4;
    }

    // Calculate MST 1 and MST 2 marks
    double mst1InternalMarks = mst1Marks / 3;
    double mst2InternalMarks = mst2Marks / 3;

    // Calculate total internal marks
    double totalInternalMarks = attendanceMarks + mst1InternalMarks + mst2InternalMarks + quizMarks + assignmentMarks;
%>

<h2>Internal Assessment Calculator</h2>
<form method="post" action=" ">
    Attendance Percentage: <input type="text" name="attendancePercentage" required><br>
    MST 1 Marks (out of 30): <input type="text" name="mst1Marks" required><br>
    MST 2 Marks (out of 30): <input type="text" name="mst2Marks" required><br>
    Quiz Marks: <input type="text" name="quizMarks" required><br>
    Assignment Marks: <input type="text" name="assignmentMarks" required><br>
    <input type="submit" value="Calculate">
</form>

<h3>Internal Assessment Result:</h3>
<p>Attendance Marks: <%= attendanceMarks %></p>
<p>MST 1 Internal Marks: <%= mst1InternalMarks %></p>
<p>MST 2 Internal Marks: <%= mst2InternalMarks %></p>
<p>Quiz Marks: <%= quizMarks %></p>
<p>Assignment Marks: <%= assignmentMarks %></p>
<p>Total Internal Marks: <%= totalInternalMarks %></p>



</body>
</html>