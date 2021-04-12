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
	private void materias_especificas (ArrayList<Seccion> materias)
	{
		ArrayList<String> reqs = null;
	}
	
	public void cand_grad(Estudiante elEst)
	{
		System.out.println("Informe de grado: ");
		ArrayList<Seccion> materias = ver_materias_vistas(elEst);
	}

}
