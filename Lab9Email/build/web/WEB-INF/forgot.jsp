<%-- 
    Document   : forgot
    Created on : Apr 6, 2022, 4:14:45 PM
    Author     : Madhu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col">
                <h1>Forgot Password</h1>
                <form action="forgot" method="post">
                        <div class="mb-3">
                            <label for="email" class="form-label">Email:</label>
                            <input type="email" class="form-control" name="email" id="email" placeholder="name@example.com" required>
                        </div>
                        <button type="submit" value="Signin" class="btn btn-primary">Submit</button>
                </form>
                </div>
            </div>
        </div>
        
    </body>
</html>
