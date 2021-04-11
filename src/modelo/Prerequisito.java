package modelo;

public class Prerequisito 
{
	
	private String nombre;
	
	private String tipo;
	
	public String darNombre()
	{
		return nombre;
	}
	
	public String tipo()
	{
		return tipo;
	}
	
	//constructor
	public Prerequisito(String elNombre, String elTipo)
	{
		nombre = elNombre;
		tipo = elTipo;
	}
	
}
