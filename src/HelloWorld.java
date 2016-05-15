import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;



import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdyne.ws.WeatherWS.WeatherSoapProxy;
import NET.webserviceX.www.*;
import br.usp.easytripdatabase.UsuariosProxy;
import model.Usuario;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/Hello")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@javax.ejb.EJB
	private br.usp.easytrip.bean.HelloBean bean;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Client client = Client.create();
    	String apiCall = null;
    	apiCall = "http://www.omdbapi.com/?s=Titanic";
    	WebResource webResource = client.resource(apiCall);
    	String outputString = webResource.get(String.class);
    	

    	
    	response.setContentType("text/html");
        PrintWriter printWriter  = response.getWriter();
        printWriter.println("<html>");
    	printWriter.println("<head>");
		printWriter.println("<body>");
		printWriter.println(outputString);
		printWriter.println("<h1>Hello World!</h1>");
        printWriter.print("<h1>Hello "+bean.from()+"!</h1>");
        
        //UsuariosProxy us = new UsuariosProxy();
        //Usuario a = us.getUsuarios().getUsuario("lucas@localhost.com", "lucas");
        //printWriter.println("<h1>a</h1>");
        
        printWriter.print("<h1>");
        //wsdl: http://wsf.cdyne.com/WeatherWS/Weather.asmx?wsdl
        WeatherSoapProxy wc = new WeatherSoapProxy();
        String temperaturaZipCode = wc.getCityForecastByZIP("98926").getForecastResult()[0].getTemperatures().getMorningLow();
        printWriter.println("graus Fahrenheit: "+temperaturaZipCode);
        
        //http://www.webservicex.net/ConvertTemperature.asmx?WSDL
        ConvertTemperatureSoapProxy cc = new ConvertTemperatureSoapProxy();
        double fahrenheit = Double.parseDouble(temperaturaZipCode);
        double temperaturaCelsius = cc.convertTemp(fahrenheit,"degreeFahrenheit" , "degreeCelsius");
        printWriter.println("graus Celsius:" +temperaturaCelsius);
        
        
       
        
        printWriter.print("</h1>");
        
        
        printWriter.println("</body>");
        printWriter.println("</head>");
        printWriter.println("</html>");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
