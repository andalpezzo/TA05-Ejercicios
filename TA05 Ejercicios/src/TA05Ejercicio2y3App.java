import javax.swing.JOptionPane;

class TA05Ejercicio2y3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de las variables
		String Nombre = "Andrea";
		String NombrePorTeclado;
		
		
		System.out.println("Ejercicio 2");
		System.out.println("Bienvenido " + Nombre);
		System.out.println();
		
		System.out.println("Ejercicio 3");
		NombrePorTeclado = JOptionPane.showInputDialog("Introduce tu nombre");
		System.out.println("Bienvenido " + NombrePorTeclado);
	}
}
