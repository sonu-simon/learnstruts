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
<h1> Login </h1>

<s:form action="login">  
<s:textfield name="username" label="username "></s:textfield>  
<s:textfield name="password" label="password " type="password"></s:textfield> 
<s:submit value="login"></s:submit>  
</s:form>    
<a href="signup.jsp">Sign up</a>

</center>

</body>
</html>