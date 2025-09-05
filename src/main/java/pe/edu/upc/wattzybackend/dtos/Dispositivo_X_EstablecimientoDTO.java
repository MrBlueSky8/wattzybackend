package pe.edu.upc.wattzybackend.dtos;

public class Dispositivo_X_EstablecimientoDTO {
    private int id_dispositivo_x_establecimiento;
    private Boolean prioritario;
    private DispositivoDTO dispositivo;
    private EstablecimientoDTO establecimiento;

    public int getId_dispositivo_x_establecimiento() {
        return id_dispositivo_x_establecimiento;
    }

    public void setId_dispositivo_x_establecimiento(int id_dispositivo_x_establecimiento) {
        this.id_dispositivo_x_establecimiento = id_dispositivo_x_establecimiento;
    }

    public Boolean getPrioritario() {
        return prioritario;
    }

    public void setPrioritario(Boolean prioritario) {
        this.prioritario = prioritario;
    }

    public DispositivoDTO getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(DispositivoDTO dispositivo) {
        this.dispositivo = dispositivo;
    }

    public EstablecimientoDTO getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(EstablecimientoDTO establecimiento) {
        this.establecimiento = establecimiento;
    }
}
