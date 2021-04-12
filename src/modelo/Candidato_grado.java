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
					String a = 	"Se ha visto la materia CBCC-1177";
					String a1 = "1";
				}
			if (sec.getCodigo() == "DERE-1300")
				{
					String e = 	"Se ha visto la materia DERE-1300";
					String e1 = "1";
				}
			if (sec.getCodigo() == "LENG-1511" || sec.getCodigo() == "LITE-1621")
				{
					String c = 	"Se ha visto Escritura Universitaria 1";
					String c1 = "1";
				}
			if (sec.getCodigo() == "LENG-1512" || sec.getCodigo() == "LITE-1622")
				{
					String d = 	"Se ha visto Escritura Universitaria 2";
					String d1 = "1";
				}
			if (sec.getCodigo() == "IDIOMA")
			{
				String d = "Se ha visto Requisito de idiomas";
				String d1 = "1";				
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		if ((a1 + b1 + c1 + d1 + e1) == ("1"+"1"+"1"+"1"+"1"))
			return true;
		else
			return false;
		
	}
	
	public void cand_grad(Estudiante elEst)
	{
		System.out.println("Informe de grado: ");
		ArrayList<Seccion> materias = ver_materias_vistas(elEst);
		boolean a = materias_especificas(materias);
	}

}
