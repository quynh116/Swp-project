<%-- 
    Document   : AddAccount
    Created on : Feb 14, 2023, 2:39:19 PM
    Author     : quynh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css" integrity="sha384-HzLeBuhoNPvSl5KYnjx0BT+WB0QEEqLprO+NBkkk5gbc67FTaL7XIGa2w1L0Xbgc" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Menu.jsp"></jsp:include>
        <link href="css/logincss.css" rel="stylesheet" type="text/css"/>
        <section>
            <div class="container-login">

                <div class="form-login">
                    <form id="signup" action="mainController" method="post">
                        <div><i class="fa fa-solid fa-chevrons-left"></i></div>
                    <div class="header">
                        <h3 style="text-align: center;">Đăng ký</h3>
                    </div>
                    <div class="sep"></div>
                    <div class="inputs">
                        <br/><input type="text" name="txtemail" placeholder="Tên" required=""/>
                        <br/><input type="text" name="txtemail" placeholder="Phone" required=""/>
                        <br/><input type="text" name="txtemail" placeholder="Email" required=""/>
                        <br/><input type="password" name="txtpassword" placeholder="password" required=""/>
                        
                        <br/><input type="submit" value="Tạo tài khoản" name="action"/>
                        <div><a href="Login1.jsp" ><i class="fa fa-solid fa-chevrons-left"></i> back</a></div>
                    </div>
                    
                </form>
                    
                </div>
                
            </div>
        </section>
        
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
