package pe.edu.upc.wattzybackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Dispositivo")
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_dispositivo;
    @Column(name = "nombre",nullable = false, length = 150)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Dispositivo() {
    }

    public Dispositivo(int id_dispositivo, String nombre, Categoria categoria) {
        this.id_dispositivo = id_dispositivo;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public int getId_dispositivo() {
        return id_dispositivo;
    }

    public void setId_dispositivo(int id_dispositivo) {
        this.id_dispositivo = id_dispositivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
