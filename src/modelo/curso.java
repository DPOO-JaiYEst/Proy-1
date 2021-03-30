package modelo;

import java.util.ArrayList;

public abstract class curso 
{
	//atributos
	
	private String nombre;
	
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
		return nombre;
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
}
