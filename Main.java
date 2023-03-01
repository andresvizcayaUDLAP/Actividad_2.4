package Ejercicio_4;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio = new Random();
		String[] nombres = {"Zenón de Citio", "Critón", "Séneca", "Epicteto", "Marco Aurelio", "Paco", "Felipe", "Carlos", "María", "Luisa"};
		int esAdulto = 0;
		int esCasado = 0;
		int esEstudiante = 0;
		int tieneHijos = 0;
		
		
		
		boolean[] booleanos = {false, true};
		
		for(int i=0; i<nombres.length; i++) {
			int verdaderos = 0;
			
			int numAleatorio1 = aleatorio.nextInt(2);
			if(verdaderos == 3) {
				numAleatorio1 = 0;
			} else if (verdaderos == 0){
				numAleatorio1 = 1;
			}
			if(numAleatorio1 == 1) {
				esAdulto++;
				verdaderos++;
			}
			
			int numAleatorio2 = aleatorio.nextInt(2);
			if(verdaderos == 3) {
				numAleatorio2 = 0;
			} else if (verdaderos == 0){
				numAleatorio2 = 1;
			}
			if(numAleatorio2 == 1) {
				esEstudiante++;
				verdaderos++;
			}
			
			int numAleatorio3 = aleatorio.nextInt(2);
			if(verdaderos == 3) {
				numAleatorio3 = 0;
			} else if (verdaderos == 0){
				numAleatorio3 = 1;
			}
			if(numAleatorio3 == 1) {
				esCasado++;
				verdaderos++;
			}
			
			int numAleatorio4 = aleatorio.nextInt(2);
			if(verdaderos == 3) {
				numAleatorio4 = 0;
			} else if (verdaderos == 0){
				numAleatorio4 = 1;
			}
			if(numAleatorio4 == 1) {
				tieneHijos++;
				verdaderos++;
			}
			
			if(esAdulto < 2) continue;
			if(esEstudiante < 2) continue;
			if(esCasado < 2) continue;
			if(tieneHijos < 2) continue;

			
			Cliente persona = new Cliente(nombres[i], booleanos[numAleatorio1], booleanos[numAleatorio2], booleanos[numAleatorio3], booleanos[numAleatorio4]);
			String info = persona.getInfo();
			System.out.println(info);
			
		}
		
		System.out.println("Adultos: " + esAdulto);
		System.out.println("Estudiantes: " + esEstudiante);
		System.out.println("Casados: "+ esCasado);
		System.out.println("Con hijos: " + tieneHijos);
	}
}