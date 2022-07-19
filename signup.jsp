<%@ taglib prefix="s" uri="/struts-tags" %>

<html>

<head>
<title>Applicaton</title>
</head>

<body>

<%
    if((session.getAttribute("login") == "true")) {
        response.sendRedirect("success.jsp");
    }
%>
<center>
<h1> Signup </h1>

<s:form action="signup">  
<s:textfield name="username" label="username "></s:textfield>  
<s:textfield name="password" label="password "></s:textfield> 
<s:submit value="signup"></s:submit>  
</s:form>    

</center>

</body>
</html>