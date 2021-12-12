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

<#if users?? >
    <#list users as user>
        <div style="margin-bottom: 30px;">
            <p>Name: ${user.name}</p>
            <p>Surname: ${user.surname}</p>
            <p>Login: ${user.login}</p>
        </div>
    </#list>
<#else>
    <div>Active users not found.</div>
</#if>

</body>

</html>