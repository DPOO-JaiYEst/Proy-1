package modelo;

import java.util.ArrayList;

public abstract class Curso 
{
	//atributos
	
	private String nombre;
	
	private String codigo;
	
	private int creditos;
	
	private int duracion;
	
	private String programa;
	
	private ArrayList<String> atributos;

	private ArrayList<Nota> notas;
	
	private String tipo_calificacion;
	
	private ArrayList<Curso> correquisitos;
	
	private ArrayList<Prerequisito> prerequisitos;
	
	private double nota_final;
	
	private String periodo;
	
	private ArrayList<Seccion> seccion;
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
	public ArrayList<Nota> getNotas() 
	{
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) 
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
	public ArrayList<Curso> getCorrequisitos() 
	{
		return correquisitos;
	}
	public void setCorrequisitos(ArrayList<Curso> correquisitos) 
	{
		this.correquisitos = correquisitos;
	}
	public ArrayList<Prerequisito> getPrerequisitos() 
	{
		return prerequisitos;
	}
	public void setPrerequisitos(ArrayList<Prerequisito> prerequisitos) 
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
	public ArrayList<String> getAtributos() 
	{
		return atributos;
	}
	public void setAtributos(ArrayList<String> atributos) 
	{
		this.atributos = atributos;
	}
	public ArrayList<Seccion> getSeccion() 
	{
		return seccion;
	}
	public void setSeccion(ArrayList<Seccion> seccion) 
	{
		this.seccion = seccion;
	}


	
	//añadir valores
	public void AddNota(Nota nota) 
	{
		notas.add(nota);
	}
	public void AddPrerrequisito(Prerequisito prerequisito)
	{
		prerequisitos.add(prerequisito);
	}
	public void AddCorrequisito(Curso correquisito)
	{
		correquisitos.add(correquisito);
	}
	//constructor
	public Curso(String elNombre, String elCodigo, int losCreditos, String elPrograma, 
			ArrayList<Nota> lasNotas, String elTCal, ArrayList<Curso> losCorreq, 
			ArrayList<Prerequisito> losPrereq, double laNota, String elPeriodo)
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