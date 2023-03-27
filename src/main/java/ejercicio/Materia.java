package ejercicio;
import java.util.List;
import java.util.ArrayList;

public class Materia {
	final String nombre;
	final ArrayList<String> correlativas=new ArrayList<String>();
	
	public Materia(String n, ArrayList c) 
	{
		this.nombre = n;
		ArrayList<String> correlativas = (ArrayList) c.clone();
	
		
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		nombre = nombre;
	}

	public List getCorrelativas() {
		return correlativas;
	}

	public void setCorrelativas(ArrayList corre) {
		ArrayList<String> correlativas = (ArrayList) corre.clone();
	}
	
	public boolean puedeCursar(Alumno alumno) {
		//recorrer correlativas
		//chequear que cada una se encuentre dentro de materias aprobadas
		//si todas estan aprobadas devuelve true
		boolean resultado=false;
		
		int contador_correlativas_aprobadas=0;
		int contador_correlativas=0;
		
		for(String correlativa:this.correlativas) {
			//para cada materia en la que se quiere inscribir
			for (String aprobada:alumno.materias_aprobadas)
			{
				contador_correlativas++;
				if (this.correlativas.indexOf(aprobada)>=0)
				{
					//hay que seguir chequeando las demas
					contador_correlativas_aprobadas++;
				}
				
				
			}
			if (contador_correlativas==contador_correlativas_aprobadas)
			{
				resultado=true;
			}
		}
		return resultado;
	}
}