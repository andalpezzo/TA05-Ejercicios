import javax.swing.JOptionPane;

public class TA05Ejercicio13App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de las variables
		String TextoNum1;
		Double Num1;
		String TextoNum2;
		Double Num2 = 0.0;
		String TipoOperacion;
		boolean OperadorCorrecto = false;
		Double Operacion = 0.0;
		
		//Mostramos una ventana para introducir el dia de la semana
		TextoNum1 = JOptionPane.showInputDialog("Primer número");
		/*Pasamos el texto a double */ Num1 = Double.parseDouble(TextoNum1); 
		
		//Mostramos una ventana para pedir el tipo de operador 
		TipoOperacion = JOptionPane.showInputDialog("Tipo de operación [ + | - | * | / | ^ | % ]");
		
		//Hacemos un for para que si entras mal el operador, te lo vuelva a pedir hasta que lo pongas bien 
		for (int i=0; OperadorCorrecto !=true; i++) {
			//Si el operador es correcto simplemente te mostrara la ventana para escribir el siguiente número 
			if (TipoOperacion.equals("+") 
					|| TipoOperacion.equals("-") 
					|| TipoOperacion.equals("*") 
					|| TipoOperacion.equals("/") 
					|| TipoOperacion.equals("^")
					|| TipoOperacion.equals("%")) {
				TextoNum2 = JOptionPane.showInputDialog("Segundo número");
				/*Pasamos el texto a double */ Num2 = Double.parseDouble(TextoNum2);
				
				OperadorCorrecto = true;
			} else {
				//Si no el operador sera incorrecto y lo seguira pidiendo
				JOptionPane.showMessageDialog(null, "Operador incorrecto");
				TipoOperacion = JOptionPane.showInputDialog("Tipo de operación [ + | - | * | / | ^ | % ]");
				OperadorCorrecto = false;
			}
		}
			
		//Switch de las operaciones a realizar
		switch (TipoOperacion) {
			case "+":
				Operacion = Num1 + Num2 ;
				break;
			case "-":
				Operacion = Num1 - Num2;
				break;
			case "*":
				Operacion = Num1 * Num2;
				break;
			case "/":
				Operacion = Num1 / Num2;
				break;
			case "^":
				Operacion = Math.pow(Num1, Num2);
				break;
			case "%":
				Operacion = Num1 % Num2;
				break;
		}
		
		//Mostramos una ventana con el resultado de la operación
		JOptionPane.showMessageDialog(null, "El resultado es " + Operacion);
	}
}
