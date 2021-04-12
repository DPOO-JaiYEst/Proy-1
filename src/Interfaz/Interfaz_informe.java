package Interfaz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import modelo.Candidato_grado;
import modelo.Inscribir_clase;

import javax.swing.JOptionPane;

public class Interfaz_informe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner usuario = new Scanner(System.in);
		System.out.println("Tipo de usuario: ");
		
		String utilizador = usuario.nextLine();
		System.out.println(utilizador);
		
		String codigo = "20211032";
		String nombre = "Jaime";
		String edad = "22";
		String filetextpath = "C:\\Users\\esteb\\Desktop\\prueba_proyecto1.txt";
		
		saveRecord(codigo,nombre,edad,filetextpath);
		
		String path = "C:\\Users\\esteb\\Desktop\\Proy-1\\data\\curso.csv";
		String line = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine()) !=	null) {
				String[] values = line.split(",");
				System.out.println(values[0]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
		public static void saveRecord(String codigo, String nombre, String edad, String filetextpath)
		{
			 try
			 {
				 FileWriter fw = new FileWriter(filetextpath,true);
				 BufferedWriter bw = new BufferedWriter(fw);
				 PrintWriter pw = new PrintWriter(bw);
				 
				 pw.println(codigo + ", " + nombre + ", " + edad + ".");
				 pw.flush();
				 pw.close();
				 
				 System.out.println("Registro guardado");
				 
			 }
			 catch(Exception E)
			 {
				 System.out.println("Registro no guardado");
			 }
		}

	}


