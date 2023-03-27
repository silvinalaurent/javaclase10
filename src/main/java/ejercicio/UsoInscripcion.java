package ejercicio;
import java.util.ArrayList;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsoInscripcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//carga de materias
		
		ArrayList<String> correlativasM1 = new ArrayList<String>();
		correlativasM1.add(null);
		Materia m1=new Materia("Matematica I",correlativasM1);
		//System.out.println(m1.nombre+" "+m1.correlativas);
		//System.out.println(correlativasM1);
		
		ArrayList<String> correlativasM2 = new ArrayList<String>();
		correlativasM2.add(null);
		Materia m2=new Materia("Algoritmos y Estructuras",correlativasM2);
		//System.out.println(m2.nombre+" "+m2.correlativas);
		//System.out.println(correlativasM2);
		
		ArrayList<String> correlativasM3 = new ArrayList<String>();
		correlativasM3.add("Matematica I");
		Materia m3=new Materia("Matematica II",correlativasM3);
		//System.out.println(m3.nombre+" "+m3.getCorrelativas());
		//System.out.println(correlativasM3);
		
	
		
		ArrayList<String> correlativasM4 = new ArrayList<String>();
		correlativasM4.add("Algoritmos y Estructuras");
		Materia m4=new Materia("Paradigmas de Programacion", correlativasM4);
		//System.out.println(m4.nombre+ " "+m4.correlativas);
		//System.out.println(correlativasM4);
		
	
		ArrayList<Materia> materias=new ArrayList<Materia>();
		materias.add(m1);
		materias.add(m2);
		materias.add(m3);
		materias.add(m4);
		for(Materia m:materias)
		{
			System.out.println("Materia "+m.nombre);
			System.out.println("Correlativas "+m.getCorrelativas());
			
		}
		
		//carga de alumnos
		
		ArrayList<String> aprobadasA1 = new ArrayList<String>();
		aprobadasA1.add("Algoritmos y Estructuras");
		aprobadasA1.add("Matematica I");
	
		Alumno a1=new Alumno("Case Lucia","A23453", aprobadasA1);

		ArrayList<String> aprobadasA2 = new ArrayList<String>();
		aprobadasA2.add("Matematica I");
	
		Alumno a2=new Alumno("Rey Pedro","B332988",aprobadasA2);
		
		ArrayList<String> aprobadasA3 = new ArrayList<String>();
		Alumno a3=new Alumno("Perez Eric","B332987",aprobadasA3);
		
		ArrayList<String> aprobadasA4 = new ArrayList<String>();
		Alumno a4=new Alumno("Silva Juan","B332986",aprobadasA4);
		
		ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
		alumnos.add(a1);
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		
		for(Alumno a:alumnos)
		{
			System.out.println("Alumno "+a.nombre+" Materias aprobadas ");
			System.out.println(a.materias_aprobadas);
		
		}
		

		
		try
		{
			Path arch = Paths.get("C:\\Users\\Silvina Laurent\\eclipse-workspace\\ejercicio\\inscripciones.csv");
			System.out.println(Files.size(arch));
			int c=0;
								
			for (String linea : Files.readAllLines(arch))
			{
				if (c>0)
				{
				//saltear primera linea
					String alumno=linea.split(",")[0];
					String materia=linea.split(",")[1];
					
				//	System.out.println("Alumno "+ alumno);
				//	System.out.println("Materia "+ materia);
					//buscar al alumno en los alumnos cargados, obtener sus aprobadas
					//luego chequear si puede cursar o no
					Alumno x;
					Materia y;
					
 					for(Alumno a:alumnos)
					{
						if (a.nombre.equals(alumno))
						{
							x=new Alumno(a.nombre,a.legajo,a.materias_aprobadas);
							System.out.println("Alumno "+x.getNombre());
							
							for(Materia m:materias)
							{
								if (m.nombre.equals(materia))
								{
									y=new Materia(m.nombre,m.correlativas);
									System.out.println("Materia a inscribir "+y.getNombre());
									if (y.puedeCursar(x))
									{
										System.out.println(alumno+"   "+materia+"    aprobado");
									}
							else
									{
										System.out.println(alumno+"   "+materia+"    aprobado");
									}
							
								}
								
							}
						}
						
					}
 					
 					
					
 						
				}
				c++;
				
			}
			
		
			
		}
		catch (IOException e) {
            System.err.println(e);
        }
	
	}

}
