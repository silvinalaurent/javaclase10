package ejercicio;
import java.util.ArrayList;
import java.util.List;

public class Alumno {
	final String nombre;
	final String legajo;
	final List<String> materias_aprobadas=new ArrayList<String>();
	
	public Alumno(String nombre, String legajo, List materias_aprobadas)
	{
		this.nombre=nombre;
		this.legajo=legajo;
		materias_aprobadas=materias_aprobadas;
				
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		nombre = nombre;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		legajo = legajo;
	}

	public List getMaterias_aprobadas() {
		return materias_aprobadas;
	}

	public void setMaterias_aprobadas(List materias_aprobadas) {
		materias_aprobadas = materias_aprobadas;
	}
	
}
