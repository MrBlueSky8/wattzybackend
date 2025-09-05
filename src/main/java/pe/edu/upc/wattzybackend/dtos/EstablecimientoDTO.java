package pe.edu.upc.wattzybackend.dtos;

public class EstablecimientoDTO {
    private int id_establecimiento;
    private String nombre;
    private String direccion;
    private Integer tarifa;
    private Float limite_consumo;
    private Tipo_establecimientoDTO tipo_establecimiento;
    private DistritoDTO distrito;

    public int getId_establecimiento() {
        return id_establecimiento;
    }

    public void setId_establecimiento(int id_establecimiento) {
        this.id_establecimiento = id_establecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTarifa() {
        return tarifa;
    }

    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }

    public Float getLimite_consumo() {
        return limite_consumo;
    }

    public void setLimite_consumo(Float limite_consumo) {
        this.limite_consumo = limite_consumo;
    }

    public Tipo_establecimientoDTO getTipo_establecimiento() {
        return tipo_establecimiento;
    }

    public void setTipo_establecimiento(Tipo_establecimientoDTO tipo_establecimiento) {
        this.tipo_establecimiento = tipo_establecimiento;
    }

    public DistritoDTO getDistrito() {
        return distrito;
    }

    public void setDistrito(DistritoDTO distrito) {
        this.distrito = distrito;
    }
}
