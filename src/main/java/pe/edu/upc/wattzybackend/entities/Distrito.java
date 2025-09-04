package pe.edu.upc.wattzybackend.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Distrito")
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_distrito;
    @Column(name = "distrito",nullable = false)
    private Integer distrito;

    public Distrito() {
    }

    public Distrito(int id_distrito, Integer distrito) {
        this.id_distrito = id_distrito;
        this.distrito = distrito;
    }

    public int getId_distrito() {
        return id_distrito;
    }

    public void setId_distrito(int id_distrito) {
        this.id_distrito = id_distrito;
    }

    public Integer getDistrito() {
        return distrito;
    }

    public void setDistrito(Integer distrito) {
        this.distrito = distrito;
    }
}
