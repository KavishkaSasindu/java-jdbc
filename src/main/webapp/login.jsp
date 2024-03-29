<%--
  Created by IntelliJ IDEA.
  User: sasin
  Date: 3/29/2024
  Time: 9:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container-fluid ">
        <div class="container border">
             <div>
                 <form action="login" method="post" class="row">
                     <div>
                         <div>
                             <label for="email">Email :</label>
                         </div>
                         <div>
                             <input type="email" name="email" id="email" class="p-1 w-50">
                         </div>
                     </div>
                     <div>
                         <div>
                             <label for="password">Password :</label>
                         </div>
                         <div>
                             <input type="password" name="password" id="password" class="p-1 w-50">
                         </div>
                     </div>
                     <div>
                         <button type="submit" class="btn btn-primary">Log in</button>
                     </div>
                 </form>
             </div>
        </div>
    </div>
</body>
</html>
