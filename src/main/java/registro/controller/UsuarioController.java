/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import registro.modelos.Moto;
import registro.modelos.Usuario;
import registro.service.UsuarioService;

/**
 *
 * @author aleja
 */
@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/registro")
    public String mostrarFormularioRegistro() {
        return "registro";
    }

    @PostMapping("/registro")
    public String procesarFormularioRegistro(Usuario usuario) {
        usuario.setContraseña(passwordEncoder().encode(usuario.getPassword()));
        usuarioService.guardarUsuario(usuario);
        return "redirect:/login";
    }

    @GetMapping("/")
    public String listarUsuarios(Model modelo) {
        List<Usuario> usuarios = usuarioService.obtenerTodosLosUsuarios();
        modelo.addAttribute("usuarios", usuarios);
        return "usuarios"; // Nombre de la vista de usuarios
    }

    @GetMapping("/catalogo")
    public String mostrarCatalogo(Model modelo) {
        List<Moto> listaMotos = obtenerListaMotos();
        modelo.addAttribute("motos", listaMotos);
        return "catalogo";
    }

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "login";
    }

    private List<Moto> obtenerListaMotos() {
        List<Moto> lista = new ArrayList<>();
        lista.add(new Moto(1L, "Moto 1", "Breve descripción de la Moto 1."));
        lista.add(new Moto(2L, "Moto 2", "Breve descripción de la Moto 2."));
        // Agrega más motos según sea necesario
        return lista;
    }
}
