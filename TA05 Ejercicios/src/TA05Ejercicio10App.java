import javax.swing.JOptionPane;

public class TA05Ejercicio10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de las variables
		String TextoNumVentas;
		int NumVentas;
		String TextoVenta;
		int Venta;
		int TotalVentas = 0;
		
		//Mostramos una ventana para introducir el número de ventas
		TextoNumVentas = JOptionPane.showInputDialog("Introduce el número de ventas");
		/*Pasamos el texto a int */ NumVentas = Integer.parseInt(TextoNumVentas);
		
		//Bucle por el número de ventas introducidas
		for (int i=1; i <= NumVentas; i++) {
			TextoVenta = JOptionPane.showInputDialog("Venta número " + i);
			/*Pasamos el texto a int */ Venta = Integer.parseInt(TextoVenta);
			
			//Sumamos todas la ventas 
			TotalVentas = TotalVentas+Venta;
		}
		//Mostramos una ventana con el total de las ventas 
		JOptionPane.showMessageDialog(null, "El total de las ventas es de " + TotalVentas);
	}
}
