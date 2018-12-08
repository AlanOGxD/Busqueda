import java.util.Scanner;

class BusquedaSecuencial {
	public void BusquedaSecuencial(int []numeros) {
		Scanner sc = new Scanner(System.in);
		boolean existe = false;
		
		System.out.println("Ingrese el numero a buscar: ");
		int numBuscado = sc.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]==numBuscado) {
				System.out.println("El numero existe, en la posicion "+(i+1));
				break;
			}else {
				existe=false;
			}
		}
		if (existe==false) {
			System.out.println("El numero no existe");
		}
		
	}
}

class BusquedaBinaria{
	public int busquedaBinaria(int numeros[], int elemento) {
		int centro, primero=0, valorCentro, ultimo=numeros.length-1;
		while (primero<=ultimo) {
			centro=(primero+ultimo)/2;
			valorCentro=numeros[centro];
			System.out.println("Comparando "+elemento+" con "+numeros[centro]);//opcional
			
			if (elemento == valorCentro) {
				return centro;
			}
			else if (elemento<valorCentro) {
				ultimo=centro-1;
			}else {
				primero=centro+1;
			}
		}
		
		return -1;
	}
}
public class Prueba {
public static void main(String[] args) {
	int a[]= {1,3,6,8,7,24,53};
	
	BusquedaSecuencial bs = new BusquedaSecuencial();
	bs.BusquedaSecuencial(a);
	
	BusquedaBinaria bb = new BusquedaBinaria();
	bb.busquedaBinaria(a, 6);
}
}
