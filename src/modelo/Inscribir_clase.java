package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Inscribir_clase 
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
	
	private ArrayList<Seccion> ver_materias_actuales (Estudiante elEst)
	{
		ArrayList<Seccion> owo = null;
		Semestre sems_visto = elEst.getSemestre_actual();
		owo.addAll(sems_visto.getCursos());	
		
		return owo;
	}
	
	private boolean revisar_prereq (ArrayList<String> Prerequisitos, ArrayList<Seccion> mat)
	{
		ArrayList<String> pre = Prerequisitos;
		for (Seccion sec: mat)
		{
			Iterator x = pre.iterator();
			while (x.hasNext());
			if (x.equals(sec.getCodigo()))
			{
				x.remove();
			}	
		}
		
		if (pre.isEmpty())
		{
			System.out.println("Todos los Prerequisitos cumplidos ");
			return true;
		}
		else
		{
			System.out.println("Faltan los siguientes elementos: ");
			for (String x: pre)
			{
				System.out.println(x);
			}
			return false;
		}
	}
	
	private boolean revisar_coreq (ArrayList<String> core, ArrayList<Seccion> mat)
	{
		ArrayList<String> pre = core;
		for (Seccion sec: mat)
		{
			Iterator x = pre.iterator();
			while (x.hasNext());
			if (x.equals(sec.getCodigo()))
			{
				x.remove();
			}	
		}
		
		if (pre.isEmpty())
		{
			System.out.println("Todos los Corequisitos cumplidos ");
			return true;
		}
		else
		{
			System.out.println("Faltan los siguientes elementos: ");
			for (String x: pre)
			{
				System.out.println(x);
			}
			return false;
		}
	}
	
	public void Insc_clase(Estudiante elEst, Seccion laMat)
	{
		System.out.println("Inscripción de clase: ");
		ArrayList<Seccion> mat = ver_materias_vistas(elEst); 
		ArrayList<Seccion> matact = ver_materias_actuales(elEst);
		ArrayList<String> prere = (ArrayList<String>) laMat.getPrerequisitos().clone();
		ArrayList<String> core = (ArrayList<String>) laMat.getCorrequisitos().clone();
		boolean owo = revisar_prereq(prere, mat);
		boolean uwu = revisar_coreq(core, matact);
		if (owo == true && uwu == true && ((elEst.getSemestre_actual().getCreditos_intentados() + laMat.getCreditos()) < elEst.getSemestre_actual().getCreditos_maximos()))
		{
			elEst.getSemestre_actual().anadir_curso(laMat);
		}
	}

}
