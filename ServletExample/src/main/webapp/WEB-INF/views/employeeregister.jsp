<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html>
  <html>
    <head>
      <meta charset="ISO-8859-1">
        <title>Insert title here</title>
      </head>
      <body>
        <form action="<%= request.getContextPath() %>/register" method="post">
        <p>
          First Name:
        </p>
        <input type ="text" name="first_name"/>
        <p>
          Last Name:
        </p>
        <input type ="text" name="last_name"/>
        <p>
          Email:
        </p>
        <input type ="text" name="email"/>
      </form>
      </body>
    </html>
