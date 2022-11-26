package com.example.pkmail.controller;
import com.example.pkmail.entities.*;
import com.example.pkmail.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@RestController
public class PakmailRestController {

    @Autowired
    private pakmailService service;


    @Autowired
    private Mensajeria2Service serviceMensajeria2;


    @Autowired
    private Cliente2Service serviceCliente2;

    @Autowired
    private Tservicio2Service serviceTservicio2;

    @Autowired
    private FcontactoSucursal2Service serviceFcontactoSucursal2;


    @Autowired
    private FileServiceImpl fileUploadService;


    /* DASHBOARD*/
    // PAGINA HTML
    @GetMapping("/dashboard")
    public ModelAndView index(){
        ModelAndView modelandview = new ModelAndView();
        modelandview.setViewName("Dashboard.html");
        return modelandview;
    }

    // RESPUESTA CON GET
    @GetMapping("/envios/{mensajeria}")
    public List<pakmail> enviosxMensageriaget(@PathVariable String mensajeria){
        mensajeria = mensajeria.toUpperCase();
        System.out.println("la mensajeria obtuvo valor de: "+mensajeria);
        return service.findAllByMensajeriaEquals(mensajeria);
    }

    @PostMapping("/enviostest")
    public List<pakmail> enviosxMensageriaTest(@RequestBody String mensajeria){
        mensajeria = mensajeria.toUpperCase();
        return service.findAllByMensajeriaEquals(mensajeria);
    }
    /*----- DASHBOARD FIN ----- */



    @PostMapping("/envios_cliente_test")
    public List<pakmail> enviosxclienteTest(@RequestBody String cliente){
        cliente = cliente.toUpperCase();
        return service.findAllByClienteEquals(cliente);
    }

    @PostMapping("/envios_fcontacto_sucursal_test")
    public List<pakmail> enviosxFcontactoSucursalTest(@RequestParam String fcontacto,String sucursal){
        fcontacto = fcontacto.toUpperCase();
        System.out.println("fcontacto: "+fcontacto+" Sucursal: "+sucursal);
        return service.findAllByForma_de_contactoAndSucursalEquals(fcontacto,sucursal);
    }


    /* MENSAJERIA */
    // PAGINA HTML
    @GetMapping("/enviosxmensajeria")
    public ModelAndView envioshtml(){
        ModelAndView modelandview = new ModelAndView();
        modelandview.setViewName("enviosxmensajeria.html");
        return modelandview;
    }

    /* MENSAJERIA FIN*/


    /* CLIENTE */
    // PAGINA HTML
    @GetMapping("/enviosxcliente")
    public ModelAndView envioshtmlcliente(){
        ModelAndView modelandview = new ModelAndView();
        modelandview.setViewName("enviosxcliente.html");
        return modelandview;
    }

    /* cliente FIN*/

    /* FORMA DE Y CONTACTO SUCURSAL */
    // PAGINA HTML
    @GetMapping("/enviosxfcontactosucursal")
    public ModelAndView envioshtmlfcontactosucursal(){
        ModelAndView modelandview = new ModelAndView();
        modelandview.setViewName("enviosxfcontactosucursal.html");
        return modelandview;
    }


    /* FORMA DE Y CONTACTO SUCURSAL  FIN*/


    /* DROPZONE */
    // PAGINA HTML
    @GetMapping("/dropzone")
    public ModelAndView dropzonehtml(){
        ModelAndView modelandview = new ModelAndView();
        modelandview.setViewName("dropzone.html");
        return modelandview;
    }

    @PostMapping("/actualizar")
    public void uploadExcel(@RequestParam("file") MultipartFile file) throws IOException {
        fileUploadService.uploadFile(file);

    }

    /* DROPZONE FIN*/


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /* CLIENTE 2*/
    @GetMapping("/enviosporcliente2")
    public List<Cliente2> enviosxCliente2(){
        return serviceCliente2.enviosxcliente2();
    }
    /* CLIENTE FIN*/


    /* MENSAJERIA 2*/
    @GetMapping("/enviospormensajeria2")
    public List<Mensajeria2> enviosxMensajeria2(){
        return serviceMensajeria2.enviosxmensajeria2();
    }
    /* MENSAJERIA FIN*/

    /* TIPO DE SERVICIO 2*/
    //PAGINA HTML
    @GetMapping("/enviosxtservicio")
    public ModelAndView enviosxTservicio2html(){
        ModelAndView modelandview = new ModelAndView();
        modelandview.setViewName("enviosxtservicio.html");
        return modelandview;
    }

    @GetMapping("/enviosportservicio2")
    public List<Tservicio2> enviosxTservicio2(){
        return serviceTservicio2.enviosxtservicio2();
    }
    /* MENSAJERIA FIN*/


    /* TIPO DE FCONTACTOSUCURSAL 2*/
    //PAGINA HTML
    @GetMapping("/enviosfcontactosucursal")
    public ModelAndView enviosxfcontactosucursalhtml(){
        ModelAndView modelandview = new ModelAndView();
        modelandview.setViewName("enviosxfcontactosucursal.html");
        return modelandview;
    }

    @GetMapping("/enviosporfcontactosucursal2")
    public List<FcontactoSucursal2> enviosxFcontactoSucursal2(){
        return serviceFcontactoSucursal2.enviosxfcontactosucursal2();
    }
    /* FCONTACTOSUCURSAL FIN*/


}
