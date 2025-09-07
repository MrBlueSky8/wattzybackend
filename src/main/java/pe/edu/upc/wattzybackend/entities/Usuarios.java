package pe.edu.upc.wattzybackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    @Column(name = "dni",nullable = false, length = 8)
    private String dni;
    @Column(name = "nombres",nullable = false, length = 150)
    private String nombres;
    @Column(name = "apellidos",nullable = false, length = 150)
    private String apellidos;
    @Column(name = "username",nullable = false, length = 150)
    private String username;
    @Column(name = "correo",nullable = false, length = 150)
    private String correo;
    @Column(name = "password",nullable = false, length = 150)
    private String password;
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol roles;
    @Column(name = "estado",nullable = false)
    private boolean estado;

    public Usuarios() {
    }

    public Usuarios(int id_usuario, String dni, String nombres, String apellidos, String username, String correo, String password, Rol roles, boolean estado) {
        this.id_usuario = id_usuario;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.username = username;
        this.correo = correo;
        this.password = password;
        this.roles = roles;
        this.estado = estado;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRoles() {
        return roles;
    }

    public void setRoles(Rol roles) {
        this.roles = roles;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
