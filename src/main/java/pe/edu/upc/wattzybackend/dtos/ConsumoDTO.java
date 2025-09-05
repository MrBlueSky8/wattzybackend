package pe.edu.upc.wattzybackend.dtos;

public class ConsumoDTO {
    private int id_consumo;
    private Float potencia_kw;
    private Float tiempo_uso;
    private Float costo_acumulado;
    private Dispositivo_X_EstablecimientoDTO dispositivo_x_establecimiento;

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

    public Dispositivo_X_EstablecimientoDTO getDispositivo_x_establecimiento() {
        return dispositivo_x_establecimiento;
    }

    public void setDispositivo_x_establecimiento(Dispositivo_X_EstablecimientoDTO dispositivo_x_establecimiento) {
        this.dispositivo_x_establecimiento = dispositivo_x_establecimiento;
    }
}
