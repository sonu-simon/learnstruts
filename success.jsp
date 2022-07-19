<%@ taglib uri="/struts-tags" prefix="s"%>

<%
    response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires", "0");

    if((session.getAttribute("login") == "false") || session.getAttribute("login") == null) {
    response.sendRedirect("login.jsp");
    }

%>
  
username : <s:property value="#session.username"/><br/>  
password  : <s:property value="#session.login"/><br/>  
<br />
<br />

<s:form action="logout">
<s:submit type="button" value="Logout"></s:submit>
</s:form>