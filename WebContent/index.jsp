<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="br.usp.easytrip.jpa.dao.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Easy Trip</title>
	</head>
	
	<body>
	<form method="GET">
		<input type="number" name="zipCode">
		<input type="submit">
	</form><%  
			String zipCode = "98926";
			if(request.getParameter("zipCode")!=null){
				zipCode = request.getParameter("zipCode");
			}
			
			ChamadasAPISOAP api = new ChamadasAPISOAP();
			String temperaturaZipCode = api.getTemperaturaZipCode(zipCode);
			double temperaturaCelsius = api.fahrenheitToCelsius(temperaturaZipCode);
			
			UsuarioDAO user = new UsuarioDAO();
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			int id = user.getIdUsuario(email, senha);
		%>
		<h1>
			<%  out.println("Graus fahrenheit: "+temperaturaZipCode); %>
		</h1>
		<h1>
			<% out.println("Graus celsius:" +temperaturaCelsius); %>
		</h1>
		<h1>
			<% out.println("id do "+email+" : " +id); %>
		</h1>
	</body>
</html>