<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%!int day=2; %>
<%!int fontsize; %>
<%!int fontSize=1; %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>if else/switch/do-while/while</title>
</head>
<body>
<!-- is else -->
<%if (day==1 || day==7) { %>
<p> Today is weekend </p>
<%} else { %>
<p> today is not weekend </p>
<%} %>

<!-- switch -->
<% 
 switch(day){
case 1:
	out.println("today is sunday");
	break;
case 2:
	out.println("today is mondy");
	break;
case 3:
	out.println("today is tuesday");
	break;
case 4:
	out.println("today is wednesday");
	break;
case 5:
	out.println("today is thursday");
	break;
case 6:
	out.println("today is friday");
	break;
case 7:
	out.println("today is saturday");
	break;

}%>
</br>
</br>
<!-- do while -->
<%--jsp coment --%>

<%for(fontsize =1;fontsize <=3;fontsize++){	%>
<font color ="red" size ="<%=fontsize%>">
Preeti Verma 
</font></br>

<%} %>

<%--while loop --%>
<%while ( fontSize <= 3){ %>
         <font color = "green" size = "<%= fontSize %>">
           Nihira Namdeo
         </font><br />
         <%fontSize++;%>
      <%}%>
</body>
</html>