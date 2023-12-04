/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro.modelos;

import lombok.Data;


@Data
public class Moto {
    private Long id;
    private String nombre;
    private String descripcion;

    // Constructores, getters y setters

    // Puedes agregar más atributos según sea necesario

    public Moto(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters y Setters (omitiéndolos para brevedad)
}
