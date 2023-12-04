// Usuario.java
package registro.modelos;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name="usuarios")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "password")
    private String password;
    @Column (name = "email")
    private String email;
    @Column (name = "rol")
    private String rol = "User";
   
}
