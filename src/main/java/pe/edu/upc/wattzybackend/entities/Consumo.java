package pe.edu.upc.wattzybackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Consumo")
public class Consumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_consumo;
    @Column(name = "potencia_kw",nullable = false)
    private Float potencia_kw;
    @Column(name = "tiempo_uso",nullable = false)
    private Float tiempo_uso;
    @Column(name = "costo_acumulado",nullable = false)
    private Float costo_acumulado;

    @ManyToOne
    @JoinColumn(name = "dispositivo_x_establecimiento_id")
    private Dispositivo_X_Establecimiento dispositivo_x_establecimiento;

    public Consumo() {
    }

    public Consumo(int id_consumo, Float potencia_kw, Float tiempo_uso, Float costo_acumulado, Dispositivo_X_Establecimiento dispositivo_x_establecimiento) {
        this.id_consumo = id_consumo;
        this.potencia_kw = potencia_kw;
        this.tiempo_uso = tiempo_uso;
        this.costo_acumulado = costo_acumulado;
        this.dispositivo_x_establecimiento = dispositivo_x_establecimiento;
    }

    public int getId_consumo() {
        return id_consumo;
    }

    public void setId_consumo(int id_consumo) {
        this.id_consumo = id_consumo;
    }

    public Float getPotencia_kw() {
        return potencia_kw;
    }

    public void setPotencia_kw(Float potencia_kw) {
        this.potencia_kw = potencia_kw;
    }

    public Float getTiempo_uso() {
        return tiempo_uso;
    }

    public void setTiempo_uso(Float tiempo_uso) {
        this.tiempo_uso = tiempo_uso;
    }

    public Float getCosto_acumulado() {
        return costo_acumulado;
    }

    public void setCosto_acumulado(Float costo_acumulado) {
        this.costo_acumulado = costo_acumulado;
    }

    public Dispositivo_X_Establecimiento getDispositivo_x_establecimiento() {
        return dispositivo_x_establecimiento;
    }

    public void setDispositivo_x_establecimiento(Dispositivo_X_Establecimiento dispositivo_x_establecimiento) {
        this.dispositivo_x_establecimiento = dispositivo_x_establecimiento;
    }
}
