package entecsur.chiki.com.asistencia.bean;

public class Evento_Participante {

	private String idEvento;
	private String idParticipante;
	private String asistencia;
	//private String horaInicio;
	//private String horaSalida;

	public Evento_Participante(String idEvento, String idParticipante, String asistencia){
		this.idEvento		= idEvento;
		this.idParticipante	= idParticipante;
		this.asistencia		= asistencia;
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
}
