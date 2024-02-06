<%@ page import="java.sql.*" import="jakarta.servlet.http.HttpSession" import="java.util.*" import="java.text.SimpleDateFormat"  %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success Dialog</title>
    <link rel="stylesheet" href="styles.css">
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f5f5f5;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .dialog-container {
        background-color: rgba(0, 0, 0, 0.5);
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        display: flex;
        justify-content: center;
        align-items: center;
        z-index: 1;
    }

    .dialog-box {
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        text-align: center;
    }

    button {
        background-color: #007BFF;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 3px;
        cursor: pointer;
        margin-top: 15px;
    }

    button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<%
String studId=session.getAttribute("sid").toString();
String idStr=session.getAttribute("idValue").toString();
String subIdStr=session.getAttribute("subIdVal").toString();
String AYIdStr=session.getAttribute("academicYearValue").toString();
String sessionIdStr=session.getAttribute("sessionValue").toString();
String dateStr=session.getAttribute("dateValue").toString();
String periodIdStr=session.getAttribute("timeperiodValue").toString();
String semesterStr=session.getAttribute("semesterValue").toString();
String branchStr=session.getAttribute("branchValue").toString();

try
{
int branch=Integer.parseInt(branchStr);
Class.forName("com.mysql.cj.jdbc.Driver");
 System.out.println("Class for name executed");
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims", "root", "12345");
 System.out.println("Connection object created");
PreparedStatement stmtTwo=conn.prepareStatement("Select subject_id from subject WHERE subject_name='"+subIdStr+"'");
ResultSet rs=stmtTwo.executeQuery();
String originalSubId="";
while(rs.next())
{
originalSubId=rs.getString(1);
}
long stdId=Long.parseLong(idStr);
System.out.println("A");
System.out.println("B");
int sem=Integer.parseInt(semesterStr);
System.out.println("C");
int AYValue=Integer.parseInt(AYIdStr);
System.out.println("D");
SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
System.out.println("E");
java.util.Date utildate=dateFormat.parse(dateStr);
System.out.println("F");
java.sql.Date sqlDate=new java.sql.Date(utildate.getTime());;

 PreparedStatement stmtOne = conn.prepareStatement("Insert into attandance Values(?,?,?,?,?,?,?,?,?)");
 System.out.println("Prepared statement executed");
 PreparedStatement stmt = conn.prepareStatement("Select * from student WHERE Semester=" + sem);
 ResultSet resultSet = stmt.executeQuery();

     while (resultSet.next()) {
     String attStrOne=request.getParameter("status_"+String.valueOf(resultSet.getLong("StudentId")));
         String id = String.valueOf(resultSet.getLong("studentId"));
         String attValue = request.getParameter("status_" + id);
 stmtOne.setLong(1,Long.parseLong(id));
System.out.println("1 executed");
             stmtOne.setString(2, AYIdStr);
             System.out.println("2 executed");
             stmtOne.setString(3,sessionIdStr);
             System.out.println("3 executed");
             stmtOne.setDate(4,sqlDate);
             System.out.println("4 executed");
             stmtOne.setString(5,periodIdStr);
             System.out.println("5 executed");
             stmtOne.setString(6,attStrOne);
             System.out.println("6 executed");
             stmtOne.setInt(7,sem);
             System.out.println("7 executed");
             stmtOne.setString(8,originalSubId);
             System.out.println("Before exact query execution");
             stmtOne.setInt(9,branch);
            int y=stmtOne.executeUpdate();
            System.out.println("Query executed successfully");
}
conn.close();
stmtOne.close();
}
catch(Exception e)
{
}
%>
    <div class="dialog-container">
        <div class="dialog-box">
            <h2>Success!</h2>
            <p>Attandance Submitted Successfully</p>
            <button type="button" onclick="window.location.href='MarkAttandancePageOne.jsp'">Close</button>
        </div>
    </div>
</body>
</html>
