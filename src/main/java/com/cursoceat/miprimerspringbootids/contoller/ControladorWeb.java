package com.cursoceat.miprimerspringbootids.contoller;

import com.cursoceat.miprimerspringbootids.modell.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class ControladorWeb {

    //Para llamar y conoertar una vusta (HTML) con el controlador hay dos maneras
    //1. Declarar una funcion con @Getmapping ("/Indico como se llama en el navegador"
    //2. Declarar una funcion con @PostMappin ("/Indico como se llama en el navegador")-> para leer datos desde el html al controlador...

   @GetMapping("/inicio")
    public String llamarIndex(){
        return "index"; //La llamada al archivo html... se debe obligatoriamente llamar igual al archivo
    }

    @GetMapping("/alta")
  public String llamarAlta(Model model){
       //Modelo, se trata de leer/capturar datos, mostrar datos.
        // Modelo-> model... metodos....
        model.addAttribute("usuario", new Usuario());
        ArrayList<String>provincias = new ArrayList<>();
        provincias.add(" ");
        provincias.add("Albacete");
        provincias.add("Ciudad Real");
        provincias.add("Cuenca");
        provincias.add("Guadalajara");
        provincias.add("Toledo");
        model.addAttribute("provincias", provincias);
        model.addAttribute("usuario", new Usuario());
       return "alta";
  }
//Creamos un arrayList global que guarde todos los usuarios que se den de alta.
    ArrayList<Usuario> usuariosAlta = new ArrayList<>();
  @PostMapping("/confirmacion")
  public String altaUsuario(Model model, @ModelAttribute Usuario usuario){
//      usuariosAlta.add(usuario);
//      System.out.println(usuario.toString());
        return "confirmacion";
  }









}
