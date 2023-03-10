<%-- 
    Document   : Menu
    Created on : Feb 14, 2023, 9:02:13 AM
    Author     : quynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/menucss.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="home">BookOln</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
                    <ul  class="navbar-nav m-auto">
                        <li class="nav-item">
                            <a style="margin-left: -150px;color: white;" class="nav-link" href="#">Kết Nối</a>
                            
                        </li>
                        <li style="margin-left: -90px;" class="nav-item "><a class="nav-link" href="#"> <i class="fa fa-brands fa-facebook"></i></a> 
                        </li>
                        <li style="margin-left: -10px;" class="nav-item ">
                            <a class="nav-link" href="#"><i class = "fa fa-brands fa-instagram"></i></a>
                        </li>
                    </ul>

                    <form action="search" method="post" class="form-inline my-2 my-lg-0">
                        <div style="margin-right: 25px;" class="input-group input-group-sm">
                            <input style="width: 500px; margin-left: -300px;" name="txt" type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                            <div class="input-group-append">
                                <button type="submit" class="btn btn-secondary btn-number">
                                    <i  class="fa fa-search"></i>
                                </button>
                            </div>
                        </div>
                        
                        <div class="header_Login-img"><img  src="images/icon_login.png" alt="login"/>
                            <div class="header-Login header_Login-ht">
                                <p style="margin-top: 5px;" class="header-Login-p"><a  href="#profile" >Tài khoản của tôi</a></p>
                                <p class="header-Login-p"><a  href="#" >Địa chỉ của tôi</a></p>
                                <p style="" class="header-Login-p"><a  href="Login1.jsp">Đăng Nhập</a></p>
                                       
                            </div>
                        </div>
                        <div class="header_Login-name " style=""> Huynh pham</div>
                        
                        
                        <a class="btn btn-success btn-sm ml-3" href="show">
                            <i class="fa fa-shopping-cart"></i> Cart
                            <span class="badge badge-light">3</span>
                        </a>
                    </form>
                </div>
            </div>
        </nav>
        <section class="text-center">
            <div style="margin-bottom: 40px; " class="image-container">
                <img style="width: 1536px;"  src="images/Rectangle.png" alt="container-img"/>
            </div>
        </section>
        
        
    </body>
</html>
