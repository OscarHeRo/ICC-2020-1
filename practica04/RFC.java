import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nombreCompleto;
		String fecha;


		System.out.println("Introduce tu nombre completo :");
		 nombreCompleto = entrada.nextLine(); 

	    	System.out.println("Introduce tu fecha de nacimiento en formato dd/mma/aaaa :");
		fecha = entrada.nextLine();

		int ultimoEspacio = nombreCompleto.lastIndexOf(' ');
		String apellidoMaterno = nombreCompleto.substring(ultimoEspacio + 1, ultimoEspacio + 2);
		int primerEspacio = nombreCompleto.lastIndexOf(' ',ultimoEspacio - 1);
		String apellidoPaterno = nombreCompleto.substring(primerEspacio + 1, primerEspacio + 3);
		String nombre = nombreCompleto.substring(0,1);
		String dia = fecha.substring(0,2);
		String mes = fecha.substring(3,5);
		String año = fecha.substring(8,10);
		String rfc = apellidoPaterno + apellidoMaterno + nombre + año + mes + dia;
		
		System.out.println(rfc.toUpperCase());
		

	       		    
	}

}
