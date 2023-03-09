import javax.swing.JOptionPane;

public class TA05Ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaración de las variables
		String TextoRadio;
		double Radio;
		double RadioAlCuadrado;
		double AreaCirculo;
		
		//Mostramos una ventana para introducir el radio
		TextoRadio = JOptionPane.showInputDialog("Introduce el radio");
		/*Pasamos el texto a double */ Radio = Double.parseDouble(TextoRadio);
		
		//Calculamos el radio al cuadarado y lo multiplicamos por PI
		RadioAlCuadrado = Math.pow(Radio, 2);
		AreaCirculo = Math.PI*RadioAlCuadrado;
		
		//Mostramos una ventana con el resultado
		JOptionPane.showMessageDialog(null, "El area del circulo es " + AreaCirculo);
	}
}
