package entecsur.chiki.com.asistencia.bean;

public class Evento_Participante {

	private String idEvento;
	private String idParticipante;
	private String asistencia;
	private String horaInicio;
	private String horaSalida;

	public Evento_Participante(String idEvento, String idParticipante, String asistencia,
							   String horaInicio, String horaSalida){
		this.idEvento		= idEvento;
		this.idParticipante	= idParticipante;
		this.asistencia		= asistencia;
		this.horaInicio		= horaInicio;
		this.horaSalida		= horaSalida;
	}

	public String getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(String idEvento) {
		this.idEvento = idEvento;
	}

	public String getIdParticipante() {
		return idParticipante;
	}

	public void setIdParticipante(String idParticipante) {
		this.idParticipante = idParticipante;
	}

	public String getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(String asistencia) {
		this.asistencia = asistencia;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}



}
