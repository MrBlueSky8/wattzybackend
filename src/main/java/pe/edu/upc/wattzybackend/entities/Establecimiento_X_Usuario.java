package pe.edu.upc.wattzybackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Establecimiento_X_Usuario")
public class Establecimiento_X_Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_establecimiento_x_usuario;

    @ManyToOne
    @JoinColumn(name = "establecimiento_id")
    private Establecimiento establecimiento;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuarios;

    public Establecimiento_X_Usuario() {
    }

    public Establecimiento_X_Usuario(int id_establecimiento_x_usuario, Establecimiento establecimiento, Usuarios usuarios) {
        this.id_establecimiento_x_usuario = id_establecimiento_x_usuario;
        this.establecimiento = establecimiento;
        this.usuarios = usuarios;
    }

    public int getId_establecimiento_x_usuario() {
        return id_establecimiento_x_usuario;
    }

    public void setId_establecimiento_x_usuario(int id_establecimiento_x_usuario) {
        this.id_establecimiento_x_usuario = id_establecimiento_x_usuario;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}
