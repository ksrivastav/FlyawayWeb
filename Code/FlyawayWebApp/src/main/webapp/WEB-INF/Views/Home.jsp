<!DOCTYPE html>
<html>
<head>

    <title>FlyAway</title>
    <link rel = "shortcut icon" type = "image/png" href = "img/favicon.png" >
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/global.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
        body, html {
            height: 100%;
            line-height: 1.8;
        }
        .bgimg-1 {
            background-position: center;
            background-size: cover;
            background-image: url("https://images.pexels.com/photos/731217/pexels-photo-731217.jpeg?cs=srgb&dl=pexels-sheila-731217.jpg&fm=jpg&_gl=1*1s1jzd8*_ga*MTExNTg1MTEzLjE2NjYxMjE4NDg.*_ga_8JE65Q40S6*MTY2NjEyMTg0OC4xLjEuMTY2NjEyMjYxNi4wLjAuMA..");
            min-height: 100%;
        }
        .w3-bar .w3-button {
            padding: 16px;
        }

        .footer {
            position: fixed;
            left: 0;
            bottom: 0;
            width: 100%;
            background-color: #f5f5f5;
            color: #3b3b3b;
            text-align: center;
        }
    </style>
</head>

<body >
    <div class="w3-top">
        <div class="w3-bar w3-white w3-card" id="myNavbar">
            <a href="/FlyawayWebApp/" class="w3-bar-item w3-button w3-wide"><img src="../img/favicon.png" class="img-fluid" alt="image" width="18%">  High FlyAway</a>
            <div class="w3-right w3-hide-small">
                <a href="/FlyawayWebApp/adminPortal" class="w3-bar-item w3-button"><i class="fa fa-gear"></i> Admin portal</a>
            </div>
        </div>
    </div>
    <header class="bgimg-1 w3-display-container w3-grayscale-min" id="home">
        <br>
        <div class="w3-display-centre w3-text-white" style="padding:48px">
            <span class="w3-jumbo w3-hide-small">Are You Ready to FlyAway?</span><br>
            <span class="w3-large">Book Domestic Flight Tickets at best prices</span>
        </div>
        <div class="w3-display-left w3-text-white" style="padding:48px">
            <p><br><br><br><br><br><br><br><br><br><br><a href="/FlyawayWebApp/bookFlightPage" class="w3-button w3-white w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-on"><i class="fa fa-fighter-jet"></i>  Book Flights</a></p>
            <p><a href="/FlyawayWebApp/adminPortal" class="w3-button w3-white w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-on"><i class="fa fa-gear"></i>   Admin Login</a></p>
        </div>
    </header>
    <div class="footer">
       FlyAway by Kartikaya Srivastav
    </div>
</body>
</html>