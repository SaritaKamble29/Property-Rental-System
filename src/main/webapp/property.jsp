<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <style>
            body { 
                background: url(/image/bg.jpg) no-repeat center center fixed; 
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
            }
            .container{
	max-width:400px;
	margin:50px auto;
	padding:20px;
	background-color:#fff;
	border-radius:5px;
	box-shadow:0 0 10px rgba(0,0,0,0.1);
}

h2{
	text-align:center;
	color:#333;
}

.form-group{
	margin-bottom:20px;
}
label{
	display:block;
	margin-bottom:5px;
	color:#666;
}
input[type="text"],
input[type="email"],
input[type="password"] {
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 3px;
}

button {
    width: 100%;
    padding: 10px;
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 3px;
    cursor: pointer;
}
 </style>
 <meta charset="ISO-8859-1">
<title>Property Page</title>
        </head>
<body>
  <nav class="navbar navbar-expand-sm navbar-light" style="background-color: #e3f2fd;">
                <img src="/image/logo.jpg" height="50" width="50" style="border-radius: 50%;">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav ml-auto" style="margin-right: 80px;">
                        <li class="nav-item dropdown">
                        <a href="home.jsp">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="about.jsp">About</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="property.jsp">Rental Property</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="contact.jsp">Contact us</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="register.jsp">Register</a>
                            
                           
                        </li>
                    </div>
                </div>
            </nav>

            <div class="box">
               <marquee> <h1 style="font-weight:bold;font-size: 50px; line-height: 1.5;font-family: 'Algerian', Times, serif;">
                    OceanHome-Rentals
                </h1></marquee>
            </div>

 <!-- Optional JavaScript -->
            <!-- jQuery first, then Popper.js, then Bootstrap JS -->
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
       
<center>
<h1>OceanHome Properties</h1>

<table border=2>
<tr><td><img src="/image/property1.jpg" height="250" width="250"></td>
<td><img src="/image/property2.jpg"height="250" width="250"></td>
<td><img src="/image/property3.jpg"height="250" width="250"></td>
</tr>
<tr><td><img src="/image/property4.jpg"height="250" width="250"></td>
<td><img src="/image/property5.jpg"height="250" width="250"></td>
<td><img src="/image/property6.jpg"height="250" width="250"></td>
</tr>
<tr><td><img src="/image/property7.jpg"height="250" width="250"></td>
<td><img src="/image/property8.jpg"height="250" width="250"></td>
<td><img src="/image/property9.jpg"height="250" width="250"></td>
</tr>

</table>
</center>
</body>
</html>