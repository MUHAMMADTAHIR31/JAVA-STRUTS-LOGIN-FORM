<%-- 
    Document   : login
    Created on : Nov 9, 2021, 7:24:45 PM
    Author     : Dell
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>Struts 2 Login Application!</title>
        <link href=""<s:url value="/css/main.css"/>" rel="stylesheet" type="text/css"/>
    </head>
    
    <body>
        <s:form action="doLogin" method="POST">
            
            <tr>
                <td colspan="2">Login</td>
            </tr>

            <tr>
                <td colspan="2">
                    <s:actionerror />
                    <s:fielderror />
                </td>
            </tr>
            
            <s:textfield name="username" label="Login name"/>
            <s:password name="password" label="Password"/>
            <s:submit value="Login" align="center"/>
        </s:form>
            
        <p>Enter User name: Admin  and Password: Admin for checking the login success!!</p>
    </body>

</html>