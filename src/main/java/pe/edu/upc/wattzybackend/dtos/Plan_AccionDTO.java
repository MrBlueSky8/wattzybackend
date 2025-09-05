package pe.edu.upc.wattzybackend.dtos;

public class Plan_AccionDTO {
    private int id_plan_accion;
    private String accion;

    public int getId_plan_accion() {
        return id_plan_accion;
    }

    public void setId_plan_accion(int id_plan_accion) {
        this.id_plan_accion = id_plan_accion;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }
}
