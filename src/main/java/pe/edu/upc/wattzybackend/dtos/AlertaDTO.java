package pe.edu.upc.wattzybackend.dtos;

public class AlertaDTO {
    private int id_alerta;
    private Integer porcentaje_consumo;
    private EstablecimientoDTO establecimiento;
    private Plan_AccionDTO plan_accion;

    public int getId_alerta() {
        return id_alerta;
    }

    public void setId_alerta(int id_alerta) {
        this.id_alerta = id_alerta;
    }

    public Integer getPorcentaje_consumo() {
        return porcentaje_consumo;
    }

    public void setPorcentaje_consumo(Integer porcentaje_consumo) {
        this.porcentaje_consumo = porcentaje_consumo;
    }

    public EstablecimientoDTO getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(EstablecimientoDTO establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Plan_AccionDTO getPlan_accion() {
        return plan_accion;
    }

    public void setPlan_accion(Plan_AccionDTO plan_accion) {
        this.plan_accion = plan_accion;
    }
}
