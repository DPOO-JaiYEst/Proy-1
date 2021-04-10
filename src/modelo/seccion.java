package modelo;

import java.util.ArrayList;

public class seccion extends curso
{
	private String profesor;
	private String codigo_sec;
	private ArrayList<estudiante> estudiantes;
	private String salon;
	private int numero;

	public seccion(String elNombre, String elCodigo, int losCreditos, String elPrograma, ArrayList<nota> lasNotas,
			String elTCal, ArrayList<curso> losCorreq, ArrayList<prerequisito> losPrereq, double laNota,
			String elPeriodo, String elProfe, String OtroCodigo, Arraylist<> losStudents, String elSalon,
			int elNumero) 
	{
		super(elNombre, elCodigo, losCreditos, elPrograma, lasNotas, elTCal, losCorreq, losPrereq, 
				laNota, elPeriodo);
		profesor = elProfe;
		codigo_sec = OtroCodigo;
		estudiantes = losStudents;
		salon = elSalon;
		numero = elNumero;
		
		// TODO Auto-generated constructor stub
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public String getCodigo_sec() {
		return codigo_sec;
	}

	public void setCodigo_sec(String codigo_sec) {
		this.codigo_sec = codigo_sec;
	}

	public ArrayList<estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
