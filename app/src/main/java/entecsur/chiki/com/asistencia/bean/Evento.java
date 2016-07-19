package entecsur.chiki.com.asistencia.bean;

public class Evento {

    private String idEvento;
    private String horaEvento;
    private String fechaEvento;
    private String precioEvento;
    private String categoriaEvento;
    private String nombreEvento;
    private String ambienteEvento;

    public Evento(String idEvento, String horaEvento, String fechaEvento, String precioEvento,
                  String categoriaEvento, String nombreEvento, String ambienteEvento){
        this.idEvento           = idEvento;
        this.horaEvento         = horaEvento;
        this.fechaEvento        = fechaEvento;
        this.precioEvento       = precioEvento;
        this.categoriaEvento    = categoriaEvento;
        this.nombreEvento       = nombreEvento;
        this.ambienteEvento     = ambienteEvento;

    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getPrecioEvento() {
        return precioEvento;
    }

    public void setPrecioEvento(String precioEvento) {
        this.precioEvento = precioEvento;
    }

    public String getCategoriaEvento() {
        return categoriaEvento;
    }

    public void setCategoriaEvento(String categoriaEvento) {
        this.categoriaEvento = categoriaEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getAmbienteEvento() {
        return ambienteEvento;
    }

    public void setAmbienteEvento(String ambienteEvento) {
        this.ambienteEvento = ambienteEvento;
    }
}
