package modelo;

import java.util.ArrayList;

public abstract class curso 
{
	//atributos
	
	private String nombre;
	
	private String codigo;
	
	private int creditos;
	
	private int duracion;
	
	private String programa;

	private ArrayList<nota> notas;
	
	private String tipo_calificacion;
	
	private ArrayList<curso> correquisitos;
	
	private ArrayList<prerequisito> prerequisitos;
	
	private double nota_final;
	
	private String periodo;
	
	//retornar atributos
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public String getCodigo() 
	{
		return codigo;
	}
	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}
	public int getCreditos() 
	{
		return creditos;
	}
	public void setCreditos(int creditos) 
	{
		this.creditos = creditos;
	}
	public int getDuracion() 
	{
		return duracion;
	}
	public void setDuracion(int duracion) 
	{
		this.duracion = duracion;
	}
	public String getPrograma() 
	{
		return programa;
	}
	public void setPrograma(String programa) 
	{
		this.programa = programa;
	}
	public ArrayList<nota> getNotas() 
	{
		return notas;
	}
	public void setNotas(ArrayList<nota> notas) 
	{
		this.notas = notas;
	}
	public String getTipo_calificacion() 
	{
		return tipo_calificacion;
	}
	public void setTipo_calificacion(String tipo_calificacion) 
	{
		this.tipo_calificacion = tipo_calificacion;
	}
	public ArrayList<curso> getCorrequisitos() 
	{
		return correquisitos;
	}
	public void setCorrequisitos(ArrayList<curso> correquisitos) 
	{
		this.correquisitos = correquisitos;
	}
	public ArrayList<prerequisito> getPrerequisitos() 
	{
		return prerequisitos;
	}
	public void setPrerequisitos(ArrayList<prerequisito> prerequisitos) 
	{
		this.prerequisitos = prerequisitos;
	}
	public double getNota_final() 
	{
		return nota_final;
	}
	public void setNota_final(double nota_final) 
	{
		this.nota_final = nota_final;
	}
	public String getPeriodo() 
	{
		return periodo;
	}
	public void setPeriodo(String periodo) 
	{
		this.periodo = periodo;
	}



	
	//añadir valores
	public void AddNota(nota nota) 
	{
		notas.add(nota);
	}
	public void AddPrerrequisito(prerequisito prerequisito)
	{
		prerequisitos.add(prerequisito);
	}
	public void AddCorrequisito(curso correquisito)
	{
		correquisitos.add(correquisito);
	}
	//constructor
	public curso(String elNombre, String elCodigo, int losCreditos, String elPrograma, 
			ArrayList<nota> lasNotas, String elTCal, ArrayList<curso> losCorreq, 
			ArrayList<prerequisito> losPrereq, double laNota, String elPeriodo)
	{
		nombre = elNombre;
		codigo = elCodigo;
		creditos = losCreditos;
		programa = elPrograma;
		notas = lasNotas;
		tipo_calificacion = elTCal;
		correquisitos = losCorreq;
		prerequisitos = losPrereq;
		nota_final = laNota;
		periodo = elPeriodo;
		
	}
}	