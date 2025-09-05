package pe.edu.upc.wattzybackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Dispositivo_X_Establecimiento")
public class Dispositivo_X_Establecimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_dispositivo_x_establecimiento;
    @Column(name = "limite_porcentual",nullable = false)
    private Float limite_porcentual;
    @Column(name = "prioritario",nullable = false)
    private Boolean prioritario;


    @ManyToOne
    @JoinColumn(name = "dispositivo_id")
    private Dispositivo dispositivo;

    @ManyToOne
    @JoinColumn(name = "establecimiento_id")
    private Establecimiento establecimiento;

    public Dispositivo_X_Establecimiento() {
    }

    public Dispositivo_X_Establecimiento(int id_dispositivo_x_establecimiento, Float limite_porcentual, Boolean prioritario, Dispositivo dispositivo, Establecimiento establecimiento) {
        this.id_dispositivo_x_establecimiento = id_dispositivo_x_establecimiento;
        this.limite_porcentual = limite_porcentual;
        this.prioritario = prioritario;
        this.dispositivo = dispositivo;
        this.establecimiento = establecimiento;
    }

    public int getId_dispositivo_x_establecimiento() {
        return id_dispositivo_x_establecimiento;
    }

    public void setId_dispositivo_x_establecimiento(int id_dispositivo_x_establecimiento) {
        this.id_dispositivo_x_establecimiento = id_dispositivo_x_establecimiento;
    }

    public Float getLimite_porcentual() {
        return limite_porcentual;
    }

    public void setLimite_porcentual(Float limite_porcentual) {
        this.limite_porcentual = limite_porcentual;
    }

    public Boolean getPrioritario() {
        return prioritario;
    }

    public void setPrioritario(Boolean prioritario) {
        this.prioritario = prioritario;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }
}
