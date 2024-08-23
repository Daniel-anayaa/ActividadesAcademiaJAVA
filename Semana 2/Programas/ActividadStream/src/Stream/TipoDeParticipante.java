package Stream;

//Hacemos una clase abstracta para generar los participantes en los dos casinos
public abstract class TipoDeParticipante {
	
	//Encapsulación de datos
	private String nombre;
	private int puntos;
	private int id;
	
	//Constructor de los participantes
		TipoDeParticipante(String nombre, int puntos, int id){
		this.nombre = nombre;
		this.puntos = puntos;
		this.id = id;
		
	}
		//Generar string
		@Override
		public String toString() {
			return this.getClass().getSimpleName() + " [id=" + id + ", nombre=" + nombre + ", puntos=" + puntos + "]";
		}
		
		//Getters y Setters de cada elemento
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getPuntos() {
			return puntos;
		}
		public void setPuntos(int puntos) {
			this.puntos = puntos;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	
	
}
