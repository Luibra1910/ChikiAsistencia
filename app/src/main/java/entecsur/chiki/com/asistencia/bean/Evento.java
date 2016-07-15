package entecsur.chiki.com.asistencia.bean;

public class Evento {

    private String idEvento;
    private String nombreEvento;
    private String precioEvento;
    private String inicioEvento;
    private String ambiente;
    private String tipoEvento;

    public Evento(String idEvento, String nombreEvento, String precioEvento, String inicioEvento, String ambiente, String tipoEvento){
        this.idEvento       = idEvento;
        this.nombreEvento   = nombreEvento;
        this.precioEvento   = precioEvento;
        this.inicioEvento   = inicioEvento;
        this.idEvento       = ambiente;
        this.idEvento       = tipoEvento;
    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getPrecioEvento() {
        return precioEvento;
    }

    public void setPrecioEvento(String precioEvento) {
        this.precioEvento = precioEvento;
    }

    public String getInicioEvento() {
        return inicioEvento;
    }

    public void setInicioEvento(String inicioEvento) {
        this.inicioEvento = inicioEvento;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
}
