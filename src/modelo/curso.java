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
	
	public String darNombre()
	{
		return nombre;
	}
	
	public String darCodigo()
	{
		return codigo;
	}
	
	public int darCreditos()
	{
		return creditos;
	}
	
	public int darDuracion()
	{
		return duracion;
	}
	public String darPrograma()
	{
		return programa;
	}
	public ArrayList<nota> darNotas()
	{
		return notas;
	}
	public String darTipoCalificacion()
	{
		return tipo_calificacion;
	}
	public ArrayList<curso> darCorrequisitos()
	{
		return correquisitos;
	}
	public ArrayList<prerequisito> darPrerequisitos()
	{
		return prerequisitos;
	}
	public double darNFinal()
	{
		return nota_final;
	}
	public String darPeriodo()
	{
		return periodo;
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
