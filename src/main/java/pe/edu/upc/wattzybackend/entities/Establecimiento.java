package pe.edu.upc.wattzybackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Establecimiento")
public class Establecimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_establecimiento;
    @Column(name = "nombre",nullable = false, length = 150)
    private String nombre;
    @Column(name = "direccion",nullable = false, length = 150)
    private String direccion;
    @Column(name = "tarifa",nullable = false)
    private Integer tarifa;
    @Column(name = "limite_consumo",nullable = false)
    private Float limite_consumo;

    @ManyToOne
    @JoinColumn(name = "tipo_establecimiento_id")
    private Tipo_establecimiento tipo_establecimiento;

    @ManyToOne
    @JoinColumn(name = "distrito_id")
    private Distrito distrito;

    public Establecimiento() {
    }

    public Establecimiento(int id_establecimiento, String nombre, String direccion, Integer tarifa, Float limite_consumo, Tipo_establecimiento tipo_establecimiento, Distrito distrito) {
        this.id_establecimiento = id_establecimiento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarifa = tarifa;
        this.limite_consumo = limite_consumo;
        this.tipo_establecimiento = tipo_establecimiento;
        this.distrito = distrito;
    }

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

    public Tipo_establecimiento getTipo_establecimiento() {
        return tipo_establecimiento;
    }

    public void setTipo_establecimiento(Tipo_establecimiento tipo_establecimiento) {
        this.tipo_establecimiento = tipo_establecimiento;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
}
