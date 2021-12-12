<#import "/spring.ftl" as spring/>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Welcome</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>

<body>
<h1>First page</h1>

<#if message?? >
    Massage: ${message}
<#else>
    <div>Not message.</div>
</#if>

</body>

</html>