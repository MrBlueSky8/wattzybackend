package pe.edu.upc.wattzybackend.dtos;

public class Tipo_establecimientoDTO {
    private int id_tipo_establecimiento;
    private String nombre;

    public int getId_tipo_establecimiento() {
        return id_tipo_establecimiento;
    }

    public void setId_tipo_establecimiento(int id_tipo_establecimiento) {
        this.id_tipo_establecimiento = id_tipo_establecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
