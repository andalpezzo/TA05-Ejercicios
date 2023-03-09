import javax.swing.JOptionPane;

public class TA05Ejercicio6App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaración de las variables
		final double IVA = 0.21;
		String TextoPrecio;
		double Precio;
		double PrecioConIva;
		
		//Mostramos una ventana para introducir el precio del producto
		TextoPrecio = JOptionPane.showInputDialog("Introduce el precio del producto");
		/*Pasamos el texto a double */ Precio = Double.parseDouble(TextoPrecio);
		
		//Calculamos el precio con IVA
		PrecioConIva = (IVA * Precio) + Precio;
		
		//Mostramos una ventana el precio con el iva 
		JOptionPane.showMessageDialog(null, "El precio con IVA es " + PrecioConIva);
	}
}
