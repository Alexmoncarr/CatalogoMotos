/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package registro.service;

import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;
import registro.modelos.Usuario;

/**
 *
 * @author aleja
 */
public interface UsuarioService extends UserDetailsService {
    
    List<Usuario> obtenerTodosLosUsuarios();

    
    Usuario findByEmail(String email);
    void guardarUsuario(Usuario usuario);
}
