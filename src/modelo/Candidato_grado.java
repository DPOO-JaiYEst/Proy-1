package modelo;

import java.util.ArrayList;

public class Candidato_grado 
{
	private ArrayList<Seccion> ver_materias_vistas (Estudiante elEst)
	{
		ArrayList<Seccion> owo = null;
		ArrayList<Semestre> sems_vistos = elEst.getSemestres_pasados();
		for (Semestre sem: sems_vistos)
		{
			ArrayList<Seccion> uwu = sem.getCursos();
			owo.addAll(uwu);
		}
		return owo;
	}
	/**
	 * 
	 */
	private boolean materias_especificas (ArrayList<Seccion> materias)
	{
		String a = "No se ha visto la materia CBCC-1177";
		String a1 = "0";
		String b = "No se ha visto Escritura Universitaria 1";
		String b1 = "0";
		String c = "No se ha visto Escritura Universitaria 2";
		String c1 = "0";
		String d = "No se ha visto Requisito de idiomas";
		String d1 = "0";
		String e = 	"No se ha visto la materia DERE-1300";
		String e1 = "0";
		
		for (Seccion sec: materias)
		{
			if (sec.getCodigo() == "CBCC-1177")
				{
					a = 	"Se ha visto la materia CBCC-1177";
					a1 = "1";
				}
			if (sec.getCodigo() == "DERE-1300")
				{
					e = 	"Se ha visto la materia DERE-1300";
					e1 = "1";
				}
			if (sec.getCodigo() == "LENG-1511" || sec.getCodigo() == "LITE-1621")
				{
					b = 	"Se ha visto Escritura Universitaria 1";
					b1 = "1";
				}
			if (sec.getCodigo() == "LENG-1512" || sec.getCodigo() == "LITE-1622")
				{
					c = 	"Se ha visto Escritura Universitaria 2";
					c1 = "1";
				}
			if (sec.getCodigo() == "IDIOMA")
			{
				d = "Se ha visto Requisito de idiomas";
				d1 = "1";				
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		if ((a1 + b1 + c1 + d1 + e1) == ("1"+"1"+"1"+"1"+"1"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	private boolean creditos_vistos (Estudiante elEst)
	{
		if (elEst.getCreditos_totales() > 137)
		{
			System.out.println("se han visto suficientes creditos");
			return true;
		}
		else
		{
			System.out.println("no se han visto suficientes creditos");
			return false;
		}
	}
	
	private boolean CBU_E_Epsilon (ArrayList<Seccion> materias)
	{
		boolean ret = true;
		int count_cbu = 0;
		int count_cbuciencia = 0;
		int count_cbuarte = 0;
		int count_cbucolombia = 0;
		int count_cle = 0;
		int count_epsilon = 0;
		int count_tipo_e = 0;
		
		for (Seccion sec: materias)
		{
			if (sec.getAtributos().contains("CBU"))
			{
				count_cbu = count_cbu +1;
			}
			if (sec.getAtributos().contains("CBU_CIENCIA"))
			{
				count_cbuciencia = count_cbuciencia +1;
			}
			if (sec.getAtributos().contains("CBU_ARTE"))
			{
				count_cbuarte = count_cbuarte +1;
			}
			if (sec.getAtributos().contains("CBU_COLOMBIA"))
			{
				count_cbucolombia = count_cbucolombia +1;
			}
			if (sec.getAtributos().contains("CLE"))
			{
				count_cle = count_cle + sec.getCreditos();
			}
			if (sec.getAtributos().contains("EPSILON"))
			{
				count_epsilon = count_epsilon + sec.getCreditos();
			}
			if (sec.getAtributos().contains("TIPO_E"))
			{
				count_tipo_e = count_tipo_e +1;
			}
		}
		if (count_cbu < 7)
		{
			ret = false;
			System.out.println("no se han visto los suficientes CBUs");
		}
		else
		{
			System.out.println("cantidad de CBUs igual o mayor a 7");
		}
		
		if (count_cbuciencia < 1)
		{
			ret = false;
			System.out.println("no se han visto los suficientes CBUs de Ciencia");
		}
		else
		{
			System.out.println("cantidad de CBUs Ciencia igual o mayor a 1");
		}
		if (count_cbuarte < 1)
		{
			ret = false;
			System.out.println("no se han visto los suficientes CBUs de Arte");
		}
		else
		{
			System.out.println("cantidad de CBUs Arte igual o mayor a 1");
		}
		if (count_cbucolombia < 1)
		{
			ret = false;
			System.out.println("no se han visto los suficientes CBUs de tipo Colombia");
		}
		else
		{
			System.out.println("cantidad de CBUs tipo Colombia igual o mayor a 1");
		}
		if (count_cle < 6)
		{
			ret = false;
			System.out.println("no se han visto los suficientes CLE");
		}
		else
		{
			System.out.println("creditos CLE mayores a 6");
		}
		
		if (count_epsilon < 2)
		{
			ret = false;
			System.out.println("no se han visto los suficientes creditos Epsilon");
		}
		else
		{
			System.out.println("creditos Epsilon mayores a 2");
		}
		
		if (count_tipo_e < 2)
		{
			ret = false;
			System.out.println("no se han visto los suficientes Tipo E");
		}
		else
		{
			System.out.println("cursos Tipo E mayores a 2");
		}
				
		return ret;
	}
	
	public void cand_grad(Estudiante elEst)
	{
		System.out.println("Informe de grado: ");
		ArrayList<Seccion> materias = ver_materias_vistas(elEst);
		boolean a = materias_especificas(materias);
		boolean b = creditos_vistos(elEst);
		boolean c = CBU_E_Epsilon(materias);
		if ((a == true) && (b == true) && (c == true))
		{
			System.out.println("El estudiante es candidato a grado");
		}
		else
		{
			System.out.println("El estudiante no es candidato a grado");
		}
	}

}
