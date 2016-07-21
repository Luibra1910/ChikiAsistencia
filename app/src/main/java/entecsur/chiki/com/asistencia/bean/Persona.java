package entecsur.chiki.com.asistencia.bean;

public class Persona {

    private String idPersona;
    private String nombre;
    private String apePater;
    private String apeMater;
    private String dni;
    private String fec_nac;
    private String telefono;
    private String correo;
    private String distrito;
    private String procedencia;
    private String sexo;

    public Persona(String idPersona, String nombre, String apePater, String apeMater,
                   String dni, String fec_nac, String telefono, String correo, String distrito,
                   String procedencia, String sexo){
        this.idPersona      = idPersona;
        this.nombre         = nombre;
        this.apePater       = apePater;
        this.apeMater       = apeMater;
        this.dni            = dni;
        this.fec_nac        = fec_nac;
        this.telefono       = telefono;
        this.correo         = correo;
        this.distrito       = distrito;
        this.procedencia    = procedencia;
        this.sexo           = sexo;

    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePater() {
        return apePater;
    }

    public void setApePater(String apePater) {
        this.apePater = apePater;
    }

    public String getApeMater() {
        return apeMater;
    }

    public void setApeMater(String apeMater) {
        this.apeMater = apeMater;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(String fec_nac) {
        this.fec_nac = fec_nac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}