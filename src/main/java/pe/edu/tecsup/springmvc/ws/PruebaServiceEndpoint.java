package pe.edu.tecsup.springmvc.ws;

import java.util.Arrays;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.stereotype.Component;

@Component
@WebService(serviceName = "prueba")
public class PruebaServiceEndpoint {

    @WebMethod
    public String descripcion() {
        return "Web Service de Prueba Utilizando JAX-WS";
    }

    @WebMethod
    public List<String> listHeros() {
        return Arrays.asList("Batman", "Iron Man", "Spiderman", "Thor");
    }

}
