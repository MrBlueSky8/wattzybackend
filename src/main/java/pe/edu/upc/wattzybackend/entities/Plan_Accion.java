package pe.edu.upc.wattzybackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Plan_Accion")
public class Plan_Accion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_plan_accion;
    @Column(name = "accion",nullable = false, length = 150)
    private String accion;

    public Plan_Accion() {
    }

    public Plan_Accion(int id_plan_accion, String accion) {
        this.id_plan_accion = id_plan_accion;
        this.accion = accion;
    }

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
