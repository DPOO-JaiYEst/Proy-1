package modelo;

public class nota 
{
	//valores
	private double valor;
	
	private double porcentaje;
	
	private curso curso; 
	
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

	public curso darCurso()
	{
		return curso;
	}
	//constructor
	
	public nota(double elValor, double elPorcentaje, curso elCurso)
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
