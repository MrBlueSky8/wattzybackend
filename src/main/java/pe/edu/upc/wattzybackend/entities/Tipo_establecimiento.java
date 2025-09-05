package pe.edu.upc.wattzybackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tipo_establecimiento")
public class Tipo_establecimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo_establecimiento;
    @Column(name = "nombre",nullable = false, length = 150)
    private String nombre;

    public Tipo_establecimiento() {
    }

    public Tipo_establecimiento(int id_tipo_establecimiento, String nombre) {
        this.id_tipo_establecimiento = id_tipo_establecimiento;
        this.nombre = nombre;
    }

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
