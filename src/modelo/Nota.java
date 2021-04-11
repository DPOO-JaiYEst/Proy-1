package modelo;

public class Nota 
{
	//valores
	private double valor;
	
	private double porcentaje;
	
	private Curso curso; 
	
	//retorno valores
	public double darValorPonderado()
	{
		return (valor*porcentaje);
	}
	public double darValor()
	{
		return valor;
	}
	public double darPorcentaje()
	{
		return porcentaje;
	}

	public Curso darCurso()
	{
		return curso;
	}
	//constructor
	
	public Nota(double elValor, double elPorcentaje, Curso elCurso)
	{
		valor = elValor;
		porcentaje = elPorcentaje;
		curso = elCurso;
		curso.AddNota(this);
		
	}
	
	@Override
	public String toString()
	{
		return("valor: "+ valor + "porcentaje: "+ porcentaje);
	}
	
}
