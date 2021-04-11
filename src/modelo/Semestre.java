package modelo;

import java.util.ArrayList;

public class Semestre 
{

	private String periodo;
	private ArrayList<Seccion> cursos;
	private int creditos_logrados;
	private int creditos_intentados;
	private int creditos_maximos;
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) 
	{
		this.periodo = periodo;
	}
	public ArrayList<Seccion> getCursos() 
	{
		return cursos;
	}
	public void setCursos(ArrayList<Seccion> cursos) 
	{
		this.cursos = cursos;
	}
	public int getCreditos_logrados() 
	{
		return creditos_logrados;
	}
	public void setCreditos_logrados(int creditos_logrados) 
	{
		this.creditos_logrados = creditos_logrados;
	}
	public int getCreditos_intentados() 
	{
		return creditos_intentados;
	}
	public void setCreditos_intentados(int creditos_intentados) 
	{
		this.creditos_intentados = creditos_intentados;
	}
	public int getCreditos_maximos() 
	{
		return creditos_maximos;
	}
	public void setCreditos_maximos(int creditos_maximos) 
	{
		this.creditos_maximos = creditos_maximos;
	}
	
	public Semestre(String periodo, ArrayList<Seccion> cursos, int creditos_logrados, int creditos_intentados,
			int creditos_maximos) 
	{
		super();
		this.periodo = periodo;
		this.cursos = cursos;
		this.creditos_logrados = creditos_logrados;
		this.creditos_intentados = creditos_intentados;
		this.creditos_maximos = creditos_maximos;
	}	

}
