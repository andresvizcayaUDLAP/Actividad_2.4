package Ejercicio_4;

public abstract class Persona {
	private String nombre;
	private boolean adulto;
	private boolean casado;
	private boolean estudiante;
	private boolean hijos;
	
	public Persona(String nombre, boolean adulto, boolean casado, boolean estudiante, boolean hijos) {
		this.nombre = nombre;
		this.adulto = adulto;
		this.casado = casado;
		this.estudiante = estudiante;
		this.hijos = hijos;
	}
	
	public String getInfo() {
		return nombre + ": " + adulto + ", " + casado + ", " + estudiante + ", " + hijos;
	}
}