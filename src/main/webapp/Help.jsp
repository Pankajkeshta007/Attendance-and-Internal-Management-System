<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
p {
text-size:20px;
color: Yellow;

}
body
{
margin: 0;
padding:0;
background:#ele8e3;
font-family:sans-serif; 
  background: -webkit-linear-gradient(to right, #155799, #159957);  
  background: linear-gradient(to right, #155799, #159957); 
  color:whitesmoke;
}
  .container {
            max-width:580px;
            margin: 59 auto;
            padding: 20px;
            background-color: light pink;
            color:whitesmoke;
           backdrop-filter: blur(16px) saturate(180%);
          -webkit-backdrop-filter: blur(16px) saturate(180%);
           background-color: rgba(11, 15, 13, 0.582);
             border-radius: 12px;
            border: 1px solid rgba(255, 255, 255, 0.125);
             padding: 20px 25px;
        }

      

 .button-container {
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 32px;
        }

.ftr {
height:52;
background-color:black;
font-size:20px;
text-align:center;
margin-top:280px;
padding-top:18px;
}
body 
{
  font-family:sans-serif; 
  background: -webkit-linear-gradient(to right, #155799, #159957);  
  background: linear-gradient(to right, #155799, #159957); 
  color:whitesmoke;
}



button {
    background-color: #030804;
    color: white;
    padding: 14px 20px;
    border-radius: 5px;
    margin: 7px 0;
    width: 35%;
    font-size: 18px;
  }

button:hover {
    opacity: 0.6;
    cursor: pointer;
}

.headingsContainer{
    text-align: center;
}

.headingsContainer p{
    color: gray;
}
.mainContainer{
    padding: 16px;
}


.subcontainer{
    display: flex;
    flex-direction: row;
    align-items: center;
    justify-content: space-between;
}

  


  /* Media queries for the responsiveness of the page */
  @media screen and (max-width: 600px) {
    form{
      width: 25rem;
    }
  }
  
  @media screen and (max-width: 400px) {
    form{
      width: 20rem;
    }
  }

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> For any query please contact to Admin</p>
<p>Contact No.01783-253919 , 01783-253918  </p>
<form>
<div class="mainContainer">
            <!-- Username -->
           
            <button type="submit" value="Back" formaction="Home.jsp">Back</button>

            
        </div>
</form>

</body>
</html>