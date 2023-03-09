import javax.swing.JOptionPane;

public class TA05Ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de las variables
		String TextoNum;
		int Num;
		String EsDivisible; 
		
		//Mostramos una ventana para introducir el radio
		TextoNum = JOptionPane.showInputDialog("Introduce un numero");
		/*Pasamos el texto a int */ Num = Integer.parseInt(TextoNum);
		
		//Comprobamos si es divisible o no
		if (Num % 2 == 0) {	
			EsDivisible = "SI";
			
		} else {
			EsDivisible = "NO";
		}
		
		//Mostramos una ventana si el número es divisible 
		JOptionPane.showMessageDialog(null, "El número " + Num + " " + EsDivisible + " es divisible de 2" );
	}
}
