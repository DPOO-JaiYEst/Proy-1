package modelo;

public class prerequisito 
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
	public prerequisito(String elNombre, String elTipo)
	{
		nombre = elNombre;
		tipo = elTipo;
		
	}
	
}
