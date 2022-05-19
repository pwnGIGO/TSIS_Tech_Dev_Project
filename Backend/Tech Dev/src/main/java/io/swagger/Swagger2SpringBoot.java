package io.swagger;

import io.swagger.configuration.LocalDateConverter;
import io.swagger.configuration.LocalDateTimeConverter;
import io.swagger.datos.HospedajeRepository;
import io.swagger.datos.LugarRepository;
import io.swagger.negocio.modelo.Comentario;
import io.swagger.negocio.modelo.Hospedaje;
import io.swagger.negocio.modelo.Lugar;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.oas.annotations.EnableOpenApi;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
@EnableOpenApi
@ComponentScan(basePackages = { "io.swagger", "io.swagger.api" , "io.swagger.configuration"})
public class Swagger2SpringBoot implements CommandLineRunner {

	private static LugarRepository lugarRepository;
	private static HospedajeRepository hospedajeRepository;
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");
            }
        };
    }
	
	public Swagger2SpringBoot(LugarRepository lugarRepository, HospedajeRepository hospedajeRepository) {
        Swagger2SpringBoot.lugarRepository = lugarRepository;
        Swagger2SpringBoot.hospedajeRepository = hospedajeRepository;
    }
    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
        
        List<Comentario> com1 = new ArrayList<Comentario>();
        List<Comentario> com2 = new ArrayList<Comentario>();
        List<Comentario> com3 = new ArrayList<Comentario>();
        List<Comentario> com4 = new ArrayList<Comentario>();
        List<Comentario> com5 = new ArrayList<Comentario>();
        
        Lugar l1 = new Lugar();
        Lugar l2 = new Lugar();
        Lugar l3 = new Lugar();
        Lugar l4 = new Lugar();
        Lugar l5 = new Lugar();
        
        Comentario l1_c1 = new Comentario();
        Comentario l1_c2 = new Comentario();
        Comentario l1_c3 = new Comentario();
        
        Comentario l2_c1 = new Comentario();
        Comentario l2_c2 = new Comentario();
        Comentario l2_c3 = new Comentario();
        Comentario l2_c4 = new Comentario();
        
        Comentario l3_c1 = new Comentario();
        Comentario l3_c2 = new Comentario();
        Comentario l3_c3 = new Comentario();
        Comentario l3_c4 = new Comentario();
        
        Comentario l4_c1 = new Comentario();
        Comentario l4_c2 = new Comentario();
        Comentario l4_c3 = new Comentario();
        
        Comentario l5_c1 = new Comentario();
        Comentario l5_c2 = new Comentario();
        Comentario l5_c3 = new Comentario();
        
        // ===== LUGAR 1 =====
        
        l1_c1.setDescripcion("Estoy muy feliz de haber podido conocer este lugar, es impresionante la cantidad de belleza que existe en un sitio como este!!");
        l1_c1.setFecha("20/04/2018");
        l1_c1.setLugar(l1);
        l1_c1.setUsuario("Rodrigo");
        
        
        l1_c2.setDescripcion("Nice!");
        l1_c2.setFecha("23/04/2022");
        l1_c2.setLugar(l1);
        l1_c2.setUsuario("DanoPrz");
        
        l1_c3.setDescripcion("Desfile por la paz, hoy en el momento a la revolución!");
        l1_c3.setFecha("01/02/2017");
        l1_c3.setLugar(l1);
        l1_c3.setUsuario("ZzzzJoelB");
        
        com1.add(l1_c1);
        com1.add(l1_c2);
        com1.add(l1_c3);
        
        l1.setId("1");
        l1.setNombre("Revolucion");
        l1.setPrecio(30);
        l1.setFoto("https://www.hotelgeneve.com.mx/cache/10/a7/10a77a35aa4305cd51e3dea78d20456f.jpg");
        l1.setTipo("Monumento");
        l1.setDescripcion("El Monumento a la Revolución es una obra arquitectónica y un mausoleo dedicado a la conmemoración de la Revolución mexicana.");
        l1.setEstado("CDMX");
        l1.setHorarios("De 9 a 5 pm");
        l1.setLatitud("19.43685279216889");
        l1.setLongitud("-99.15453619908936");
        l1.setMunicipio("Cuauhtemoc");
        l1.setComentario(com1);
       
        
        // ===== LUGAR 2 =====
        
        l2_c1.setDescripcion("Estoy muy feliz de haber podido conocer este lugar!!");
        l2_c1.setFecha("20/04/2018");
        l2_c1.setLugar(l2);
        l2_c1.setUsuario("Rodrigo");
        
        
        l2_c2.setDescripcion("Nice!");
        l2_c2.setFecha("23/04/2022");
        l2_c2.setLugar(l2);
        l2_c2.setUsuario("DanoPrz");
        
        l2_c3.setDescripcion("Good!!");
        l2_c3.setFecha("01/01/2020");
        l2_c3.setLugar(l2);
        l2_c3.setUsuario("JosueRamoz");
        
        l2_c4.setDescripcion("Increible!");
        l2_c4.setFecha("01/02/2017");
        l2_c4.setLugar(l2);
        l2_c4.setUsuario("ZzzzJoelB");
        
        com2.add(l2_c1);
        com2.add(l2_c2);
        com2.add(l2_c3);
        com2.add(l2_c4);
        
        l2.setId("2");
        l2.setNombre("Templo Mayor");
        l2.setPrecio(10);
        l2.setFoto("https://barriozona.com/wp-content/uploads/2016/11/templo_mayor_ruinas_ciudad_mexico_tenochtitlan_mdm.jpg");
        l2.setTipo("Museo");
        l2.setDescripcion("El Templo Mayor o Gran Templo de México es un recinto que comprende una serie de construcciones, edificios, "
        		+ "torres y un patio, el espacio físico donde se ubicaban las mismas.​");
        l2.setEstado("CDMX");
        l2.setHorarios("De 9 a 5 pm");
        l2.setLatitud("19.43501858682322");
        l2.setLongitud("-99.13140892246234");
        l2.setMunicipio("Cuauhtemoc");
        l2.setComentario(com2);
        
        // ===== LUGAR 3 =====
        
        l3_c1.setDescripcion("Estoy muy feliz de haber podido conocer este lugar!!");
        l3_c1.setFecha("20/04/2018");
        l3_c1.setLugar(l3);
        l3_c1.setUsuario("Rodrigo");
        
        
        l3_c2.setDescripcion("Nice!");
        l3_c2.setFecha("23/04/2022");
        l3_c2.setLugar(l3);
        l3_c2.setUsuario("DanoPrz");
        
        l3_c3.setDescripcion("Es impresionante la cantidad de belleza que existe en un sitio como este!!");
        l3_c3.setFecha("01/01/2020");
        l3_c3.setLugar(l3);
        l3_c3.setUsuario("JosueRamoz");
        
        l3_c4.setDescripcion("Increible!");
        l3_c4.setFecha("01/02/2017");
        l3_c4.setLugar(l3);
        l3_c4.setUsuario("ZzzzJoelB");
        
        com3.add(l3_c1);
        com3.add(l3_c2);
        com3.add(l3_c3);
        com3.add(l3_c4);
        
        l3.setId("3");
        l3.setNombre("Tajín");
        l3.setPrecio(25);
        l3.setFoto("https://www.mexicodesconocido.com.mx/wp-content/uploads/2010/05/el-tajin-veracruz-flickr-luis-c.jpg");
        l3.setTipo("Zona Arqueológica");
        l3.setDescripcion("El Tajín es una zona arqueológica precolombina de origen totonaca que se encuentra cerca de la ciudad de Papantla, Veracruz, México.​");
        l3.setEstado("Verzacruz");
        l3.setHorarios("De 9 a 5 pm");
        l3.setLatitud("20.4303411");
        l3.setLongitud("-97.3865513");
        l3.setMunicipio("Papantla");
        l3.setComentario(com3);
        
        // ===== LUGAR 4 =====
        
        l4_c1.setDescripcion("Los arrecifes de coral, complejos turísticos, restaurantes y las playas atraen a los visitantes a esta isla.!");
        l4_c1.setFecha("20/04/2018");
        l4_c1.setLugar(l4);
        l4_c1.setUsuario("Rodrigo");
        
        
        l4_c2.setDescripcion("Nice!");
        l4_c2.setFecha("23/04/2022");
        l4_c2.setLugar(l4);
        l4_c2.setUsuario("DanoPrz");
        
        l4_c3.setDescripcion("Es impresionante la cantidad de belleza que existe en un sitio como este!!");
        l4_c3.setFecha("01/01/2020");
        l4_c3.setLugar(l4);
        l4_c3.setUsuario("JosueRamoz");
        
        
        com4.add(l4_c1);
        com4.add(l4_c2);
        com4.add(l4_c3);
        
        l4.setId("4");
        l4.setNombre("Isla Mujeres");
        l4.setPrecio(43);
        l4.setFoto("https://www.mexperience.com/wp-content/uploads/Isla-Mujeres-North-Beach-Aerial-NBS.jpg");
        l4.setTipo("Playa");
        l4.setDescripcion("La Isla Mujeres es una isla mexicana en el mar Caribe, a 13 km de la costa de Cancún. Es un "
        		+ "destino vacacional conocido por sus playas, como la Playa Norte, complejos turísticos y también por el"
        		+ " esnórquel.");
        l4.setEstado("Quintana Roo");
        l4.setHorarios("De 5 am a 11 pm");
        l4.setLatitud("21.232453268289458");
        l4.setLongitud("-86.73395005678351");
        l4.setMunicipio("Isla Mujeres");
        l4.setComentario(com4);
        
        
        // ===== LUGAR 5 =====
        
        l5_c1.setDescripcion("Nice!");
        l5_c1.setFecha("20/04/2018");
        l5_c1.setLugar(l5);
        l5_c1.setUsuario("Rodrigo");
        
        l5_c2.setDescripcion("La zona minera está padre!!");
        l5_c2.setFecha("23/04/2022");
        l5_c2.setLugar(l5);
        l5_c2.setUsuario("DanoPrz");
        
        l5_c3.setDescripcion("Es impresionante la cantidad de belleza que existe en un sitio como este!!");
        l5_c3.setFecha("01/01/2020");
        l5_c3.setLugar(l5);
        l5_c3.setUsuario("JosueRamoz");
        
        com5.add(l5_c1);
        com5.add(l5_c2);
        com5.add(l5_c3);
        
        l5.setId("5");
        l5.setNombre("Real del Monte");
        l5.setPrecio(35);
        l5.setFoto("https://www.gob.mx/cms/uploads/article/main_image/83035/Panoramica-Real-del-Monte-web.jpg");
        l5.setTipo("Pueblo Mágico");
        l5.setDescripcion("Mineral del Monte es una ciudad montañosa del estado de Hidalgo, en el centro de Mexico."
        		+ " También recibe el nombre de Real del Monte y es conocida por su rica historia minera.");
        l5.setEstado("Hidalgo");
        l5.setHorarios("De 5 am a 11 pm");
        l5.setLatitud("20.142677546173367");
        l5.setLongitud("-98.67609189454211");
        l5.setMunicipio("Mineral del Monte");
        l5.setComentario(com5);
        
        
        lugarRepository.save(l1);
        lugarRepository.save(l2);
        lugarRepository.save(l3);
        lugarRepository.save(l4);
        lugarRepository.save(l5);
        
        
        // ==== HOSPEDAJE === BD
       
        Hospedaje h1 = new Hospedaje();
        
        h1.setId("1");
        h1.setNombre("Hotel Finisterr");
        h1.setTelefono("8837283728");
        h1.setDescripcion("Derivado de la creciente demanda de hospedaje de alta calidad al sur de la Ciudad de "
        		+ "México, Hotel Finisterre se inaugura en junio de 1991");
        h1.setFoto("https://fastly.4sqi.net/img/general/200x200/22656298_hGfu8Q8E1bOGOcVNg44Um0e1tWiqTgr0nHKo3liiMKs.jpg");
        h1.setLatitud("");
        h1.setLongitud("");
        h1.setPrecio(1200);
        
        // HOTEL 2
        Hospedaje h2 = new Hospedaje();
        
        h2.setId("2");
        h2.setNombre("Hotel Real del Monte");
        h2.setTelefono("7712736473");
        h2.setDescripcion("El Hotel Real del Monte localizado a sólo hora y media de la Ciudad de México, se encuentra en el Centro Histórico de Real del Monte; Hidalgo.");
        h2.setFoto("https://dynamic-media-cdn.tripadvisor.com/media/photo-o/22/9e/9f/70/caption.jpg?w=1100&h=-1&s=1");
        h2.setLatitud("");
        h2.setLongitud("");
        h2.setPrecio(750);
        
        // HOTEL 3
        Hospedaje h3 = new Hospedaje();
        
        h3.setId("3");
        h3.setNombre("Hotel Real del Monte");
        h3.setTelefono("9914523902");
        h3.setDescripcion("HOTEL TAJÍN se encuentra ubicado en Papantla, Veracruz, una ciudad que envuelve a una atmósfera llena de tradición y cultura. ");
        h3.setFoto("https://media-cdn.tripadvisor.com/media/photo-s/0c/cf/70/c7/hotel-tajin.jpg");
        h3.setLatitud("");
        h3.setLongitud("");
        h3.setPrecio(1050);
        
        // HOTEL 4
        Hospedaje h4 = new Hospedaje();
        
        h4.setId("4");
        h4.setNombre("Hotel Plaza Almendros");
        h4.setTelefono("6618309253");
        h4.setDescripcion("Hotel Plaza almendros, hospedaje en Isla Mujeres, Quintana Roo, México. \"Con nosotros siéntase como en casa\"");
        h4.setFoto("https://cdn.precioyviajes.com/02/09/28/02092852_gp.jpg");
        h4.setLatitud("");
        h4.setLongitud("");
        h4.setPrecio(1050);
        
        
        hospedajeRepository.save(h1);
        hospedajeRepository.save(h2);
        hospedajeRepository.save(h3);
        hospedajeRepository.save(h4); 

    }

    public static void main(String[] args) throws Exception {
        new SpringApplication(Swagger2SpringBoot.class).run(args);
        
    }

    @Configuration
    static class CustomDateConfig extends WebMvcConfigurerAdapter {
        @Override
        public void addFormatters(FormatterRegistry registry) {
            registry.addConverter(new LocalDateConverter("yyyy-MM-dd"));
            registry.addConverter(new LocalDateTimeConverter("yyyy-MM-dd'T'HH:mm:ss.SSS"));
        }
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }
    
}
