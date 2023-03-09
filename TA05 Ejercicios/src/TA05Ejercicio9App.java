
public class TA05Ejercicio9App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de las variables
		int Num = 1;
		
		//Bucle del 1 a al 100;
		while (Num <= 100) {
			Num++;
			//If para imprimir solo los divisibles por 2 y 3
			if (Num % 2 == 0 || Num % 3 == 0) {	
				System.out.println(Num);
			}
		}
	}
}
