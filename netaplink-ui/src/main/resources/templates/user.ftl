<#import "/spring.ftl" as spring/>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Users</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>

<body>
<h1>Portfolio</h1>

<#if user?? >
    Name: ${user.name}<br>
    Surname: ${user.surname}<br>
    Login: ${user.login}<br>
<#else>
    <div>User not found.</div>
</#if>

</body>

</html>