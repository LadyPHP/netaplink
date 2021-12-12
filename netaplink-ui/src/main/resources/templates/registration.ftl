<#import "/spring.ftl" as spring/>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Registration for new user</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>

<body>
<h1>Registration form</h1>

<#if user?? >
    Your submitted data<br>
    Name: ${user.name}<br>
    Surname: ${user.surname}<br>
    Login: ${user.login}<br>
<#else>
    <form action="/users/registration" method="post">
        <div>Name:</div>
        <input type="text" name="name"/>
        <br/><br/>
        <div>Surname:</div>
        <input type="text" name="surname">
        <br/><br/>
        <div>Login:</div>
        <input type="text" name="login">
        <br/><br/>
        <div>Password:</div>
        <input type="password" name="password">
        <br/><br/>
        <input type="submit" value="Submit"/>
        <input type="reset" value="Reset"/>
    </form>
</#if>

</body>

</html>