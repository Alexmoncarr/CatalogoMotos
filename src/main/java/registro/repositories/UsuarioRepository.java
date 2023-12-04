/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package registro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import registro.modelos.Usuario;

/**
 *
 * @author aleja
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Usuario findByEmail(String email);
}
