import javax.swing.JOptionPane;

public class TA05Ejercicio12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de las variables
		String Contraseña;
		String IntroduccionDeContraseña;
		int NumIntentos = 3;
		
		//Mostramos una ventana para crear la contraseña
		Contraseña = JOptionPane.showInputDialog("Introduce el una contraseña");
		
		//Bucle por el número de ventas introducidas
		while(NumIntentos > 0) {
			IntroduccionDeContraseña = JOptionPane.showInputDialog("Introduce de nuevo la contraseña (" + NumIntentos-- + " intentos)");
			
			if(IntroduccionDeContraseña.equals(Contraseña)) {
				JOptionPane.showMessageDialog(null, "CONTRASEÑA CORRECTA");
				NumIntentos = 0;
			} else {
				JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA");
			}
		}
	}
}
