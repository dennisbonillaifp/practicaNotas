
package practica1;
import java.util.Scanner;


/**
 * @author dboni Dennis Bonilla Carreño.
 * Clase que permite la gestión de notas de un estudiante.
 **/public class notas {

/**
* Declaracion de variables que almacenaran los datos.
**/
	//declaramos la variables que nos hacen falta
	double Unidad1, uf2, uf3;
	double acu1, acu2, acu3, def;
	
/**
* Scanner para que el usuario introduzca los datos. 
**/	
	//utilizames ecaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
/**
* Método para ingresar las notas del estudiante.
**/	
	///vamos ca crear un metodo para ingresar 
	public void IngresaNotas() {
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("INGRESE LA NOTA DEL ESTUDIANTE");
		System.out.print("ingrese nota 1: ");
		Unidad1= entrada.nextDouble();
		System.out.print("ingrese nota 2: ");
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		uf3= entrada.nextDouble();
	}

/**
* Método para comprobar que las notas no sean menores que 0.
**/	
	// metodo para comprobar bien entroduccion de notas
	public void comprobarcion(){
		if (Unidad1>10) {
			System.out.println(" nota1 mal introducida");
		}else {
			System.out.println(" nota1 correcta");
		}
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
		}else {
			System.out.println(" nota3 correcta");
		}	
	}
	
/**
* Método para calcular la nota
**/	
	// metodo para calcular nota
	public void Calculonotas() {
		acu1= Unidad1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;	
		def = acu1 + acu2+ acu3;

/**
* Método para mostrar las notas introducidas y la nota def calculada
**/		
		//hasta aqui la tenemos calculada peor no la mostramos
	}
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + Unidad1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		System.out.println(" nota definitiva es = "+ def);	
	}

/**
* Método para comprobar si el estudiante ha aprobado o suspendido
**/	
	public void aprobado() {		
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
/**
 * Método principal que ejecuta todas las funciones 
 **/		
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();	
		fc.IngresaNotas();
		fc.comprobarcion();
		fc.Calculonotas();
		fc.Mostrar();
		fc.aprobado();
	}
}
