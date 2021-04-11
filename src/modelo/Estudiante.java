package modelo;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String codigo;
	private String programa;
	private int semestre;
	private double promedio_acumulado;
	private String estado_academico;
	private int creditos_totales;
	private ArrayList<Pensum> pensum;
	private ArrayList<Semestre> semestres_pasados;
	private Semestre semestre_actual;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public double getPromedio_acumulado() {
		return promedio_acumulado;
	}
	public void setPromedio_acumulado(double promedio_acumulado) {
		this.promedio_acumulado = promedio_acumulado;
	}
	public String getEstado_academico() {
		return estado_academico;
	}
	public void setEstado_academico(String estado_academico) {
		this.estado_academico = estado_academico;
	}
	public int getCreditos_totales() {
		return creditos_totales;
	}
	public void setCreditos_totales(int creditos_totales) {
		this.creditos_totales = creditos_totales;
	}
	public ArrayList<Pensum> getPensum() {
		return pensum;
	}
	public void setPensum(ArrayList<Pensum> pensum) {
		this.pensum = pensum;
	}
	public ArrayList<Semestre> getSemestres_pasados() {
		return semestres_pasados;
	}
	public void setSemestres_pasados(ArrayList<Semestre> semestres_pasados) {
		this.semestres_pasados = semestres_pasados;
	}
	public Semestre getSemestre_actual() {
		return semestre_actual;
	}
	public void setSemestre_actual(Semestre semestre_actual) {
		this.semestre_actual = semestre_actual;
	}
	
	


}
