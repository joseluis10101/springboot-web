package pe.edu.tecsup.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class WSConfig {

    @Bean
    public SimpleJaxWsServiceExporter jaxWS() {

        SimpleJaxWsServiceExporter sjwse =
                new SimpleJaxWsServiceExporter();
       
        sjwse.setBaseAddress("http://localhost:8081/");
        return sjwse;
    }

}
