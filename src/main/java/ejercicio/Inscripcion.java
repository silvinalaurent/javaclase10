package ejercicio;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Inscripcion {

		private Alumno alumno;
		private Materia materia;
		private Date fecha;
		
		public Inscripcion(Alumno alumno, Materia materia, Date fecha) {
			this.alumno = alumno;
			this.materia = materia;
			this.fecha = fecha;
		}
		
		public boolean aprobada()
		{
			//recorrer correlativas
			//chequear que cada una se encuentre dentro de materias aprobadas
			//si todas estan aprobadas devuelve true
		boolean resultado;
		resultado=this.materia.puedeCursar(alumno);
		return resultado;
	}	
}
