package modelo;

public class corequisito 
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
	
	public corequisito(String elNombre, String elTipo)
	{
		nombre = elNombre;
		tipo = elTipo;
	}

}
