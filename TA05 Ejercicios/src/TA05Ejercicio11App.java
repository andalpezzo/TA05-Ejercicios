
import javax.swing.JOptionPane;

public class TA05Ejercicio11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración de las variables
		String DiaSemana;
		String EsLaboral ="";
		
		//Mostramos una ventana para introducir el dia de la semana
		DiaSemana = JOptionPane.showInputDialog("Introduce el dia de la semana");
		
		//Switch de los dias de la semana
		switch (DiaSemana) {
			case "Lunes":
				EsLaboral = "SI";
				break;
			case "Martes":
				EsLaboral = "SI";
				break;
			case "Miercoles":
				EsLaboral = "SI";
				break;
			case "Jueves":
				EsLaboral = "SI";
				break;
			case "Viernes":
				EsLaboral = "SI";
				break;
			case "Sabado":
				EsLaboral = "SI";
				break;
			case "Domingo":
				EsLaboral = "NO";
				break;
		}
		
		//Mostramos una ventana con el total de las ventas 
		JOptionPane.showMessageDialog(null, "El " + DiaSemana + " " + EsLaboral + " es un dia laboral");
	}
}
