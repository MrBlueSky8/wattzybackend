package pe.edu.upc.wattzybackend.dtos;
import pe.edu.upc.wattzybackend.entities.Usuarios;

public class Establecimiento_X_UsuarioDTO {
    private int id_establecimiento_x_usuario;
    private EstablecimientoDTO establecimiento;
    private Usuarios usuarios;

    public int getId_establecimiento_x_usuario() {
        return id_establecimiento_x_usuario;
    }

    public void setId_establecimiento_x_usuario(int id_establecimiento_x_usuario) {
        this.id_establecimiento_x_usuario = id_establecimiento_x_usuario;
    }

    public EstablecimientoDTO getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(EstablecimientoDTO establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}
