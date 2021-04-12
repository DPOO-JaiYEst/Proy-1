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

public class Interfaz_informe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan_codigo = new Scanner(System.in);
		System.out.println("Ingrese su codigo: ");
		String codigo_estudiante = scan_codigo.nextLine ();
		
		Scanner scan_nombre = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		String nombre_estudiante = scan_nombre.nextLine ();
		
		Scanner scan_path_archivo = new Scanner(System.in);
		System.out.println("Ingrese la ruta del archivo donde quiere guardar la información: ");
		String filetextpath = scan_path_archivo.nextLine ();
		
//		Scanner scan_path_archivo = new Scanner(System.in);
//		System.out.println("Ingrese la ruta del archivo donde quiere guardar la información: ");
//		String filetextpath = scan_path_archivo.nextLine ();
		
		
		int lenght;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cantidad de materias que ha aprobado: ");
		lenght = input.nextInt();
		
		String[] codes = new String[lenght];
		
		for(int counter = 0; counter < lenght; counter++)
		{
			System.out.println("Cantidad de materias ingresadas (" + (counter+1) + "), Ingrese el código de las materias que ha aprobado");
			codes[counter] = input.next();
		}
		
		input.close();
		
		System.out.println("Sus materias aprobadas son: ");
		for(int counter = 0; counter < lenght; counter++)
		{
			System.out.println(codes[counter]);
			
		}
		
		saveRecord(codigo_estudiante,nombre_estudiante,filetextpath);
		
		String path = "C:\\Users\\esteb\\Desktop\\Proy-1\\data\\curso.csv";
		String line = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine()) !=	null) {
				String[] values = line.split(",");
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
		public static void saveRecord(String codigo_estudiante, String nombre_estudiante, String filetextpath)
		{
			 try
			 {
				 FileWriter fw = new FileWriter(filetextpath,true);
				 BufferedWriter bw = new BufferedWriter(fw);
				 PrintWriter pw = new PrintWriter(bw);
				 
				 pw.println("código: " + codigo_estudiante + " nombre: " + nombre_estudiante);
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


