package pe.edu.upc.wattzybackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Alerta")
public class Alerta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_alerta;
    @Column(name = "porcentaje_consumo",nullable = false)
    private Integer porcentaje_consumo;

    @ManyToOne
    @JoinColumn(name = "establecimiento_id")
    private Establecimiento establecimiento;

    @ManyToOne
    @JoinColumn(name = "plan_accion_id")
    private Plan_Accion plan_accion;

    public Alerta() {
    }

    public Alerta(int id_alerta, Integer porcentaje_consumo, Establecimiento establecimiento, Plan_Accion plan_accion) {
        this.id_alerta = id_alerta;
        this.porcentaje_consumo = porcentaje_consumo;
        this.establecimiento = establecimiento;
        this.plan_accion = plan_accion;
    }

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

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Plan_Accion getPlan_accion() {
        return plan_accion;
    }

    public void setPlan_accion(Plan_Accion plan_accion) {
        this.plan_accion = plan_accion;
    }
}
