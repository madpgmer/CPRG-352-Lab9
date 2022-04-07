<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Notes</title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col">
                <h1>Notes App</h1>
                <h2>Login</h2>
                <form action="login" method="post">
                        <div class="mb-3">
                            <label for="email" class="form-label">Email:</label>
                            <input type="email" class="form-control" name="email" value="${email}" id="email" required>
                        </div>
                        <div class="mb-3">
                            <label for="password" class="form-label">Password: </label>
                            <input type="password" class="form-control" name="password" id="password" required>
                        </div>
                        <button type="submit" value="Signin" class="btn btn-primary">Submit</button>
                </form>
                <span><a href="forgot"> Forgot password?</a></span>
                
                </div>
            </div>
        </div>
    </body>
</html>
