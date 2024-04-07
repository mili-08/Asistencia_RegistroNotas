package ar.edu.unju.fi.main;


import java.util.Scanner;
import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {
	
	//PARA EL ALUMNO ARIEL VEGA SE DENE REGISTRAR LAS NOTAS FINALES DE 4 MATERIAS
	
	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
	    Alumno alumno = cargarAlumno();
	    cargarRegistro(alumno);    
        sc.close();
	}
	
	public static Alumno cargarAlumno () {
		Scanner sc = new  Scanner(System.in);
		Alumno alumno = new Alumno();
		System.out.println("Ingrese el legajo: ");
		Integer legajo = sc.nextInt();
		alumno.setLegajo(legajo);
		System.out.println("Ingrese el apellido: ");
		String apellido = sc.next();
		alumno.setApellido(apellido);
		System.out.println("Ingrese el nombre: ");
		String nombre = sc.next();
		alumno.setNombre(nombre);
        return alumno;
	}
	
	public static Materia cargarMateria () {
		Scanner sc = new  Scanner(System.in);
		System.out.println("\nIngrese el codigo de la materia: ");
     	String codigoMateria = sc.next();
     	System.out.println("Ingrese el nombre de la materia: ");
     	String nombreMateria = sc.next();
     	Materia materia = new Materia(codigoMateria, nombreMateria);
		return materia;
	}
	
	public static void cargarRegistro (Alumno alumno) {
		int cantidadMaterias=1;
		Scanner sc = new  Scanner(System.in);
        while(cantidadMaterias<=4)
        {
           
            Materia materia = cargarMateria();
        	System.out.println("\nIngrese el codigo de registro: ");
        	String codigoRegistro = sc.next();
			System.out.println("Ingrese la nota final: ");
			Float nota = sc.nextFloat();
			
			RegistroNota registro = new RegistroNota(codigoRegistro, alumno, materia, nota);			
		    System.out.println(registro.toString());
			cantidadMaterias++;
       }
	}

}
