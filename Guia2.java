package javaapplication1;

import java.util.Scanner;
import java.util.Random;
public class Guia2 {

 
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
                        CalculadoraMatricial objeto= new CalculadoraMatricial();
                        Ordenamiento arreglo= new Ordenamiento();
                        
	    int opc1;
			
			do{
	System.out.println("Ingrese la opcion a realizar");
	System.out.println("1. Matricez");
	System.out.println("2. Metodos Ordenamiento");
	System.out.println("3. Salir");
	opc1 = sc.nextInt();
	switch(opc1){
            case 1:
		int opc2;
		do{
		System.out.println("\n--- Operaciones con Matrices ---");
		System.out.println();
		System.out.println("1. Suma de matricez.");
		System.out.println("2. Producto entre matricez.");
		System.out.println("3. Inversa de una matriz.");
		System.out.println("4. Producto de una matriz por un vector.");
		System.out.println("5. Salir.");
		opc2 = sc.nextInt();
		switch(opc2){
                    case 1:
                        System.out.println("\nHas selecionado suma de matricez");
                        objeto.sumar_matriz();
                        break;
                    case 2:
                        System.out.println("\nHas seleccionado producto entre matricez");
                        objeto.producto_matriz();
                        break;
                    case 3:
                        System.out.println("\nHas seleccionado inversa de una matriz");
			objeto.inversa_matriz();
			break;
                    case 4:
			System.out.println("\nHas seleccionado producto de una matriz por un vector");
			objeto.producto_vector();
			break;
                    case 5:
			System.out.println("");
			System.out.println("¡Hasta Luego!");
			break;
                    default:
			System.out.println("");
			System.out.println("¡Opcion no valida! intente nuevamente. ");
                }
                }while(opc2 != 5);
                break;
            case 2:
                int opc3;
                do{
		System.out.println("\n--- Métodos de Ordenamiento ---");
		System.out.println();
		System.out.println("Seleccione el metodo de ordenamiento");
		System.out.println("1. Metodo Burbuja");
		System.out.println("2. Metodo Selección");
		System.out.println("3. Metodo Inserción");
		System.out.println("4. Metodo Merge Sort");
		System.out.println("5. Salir");
		opc3 = sc.nextInt();
                switch(opc3){
		case 1:
                    System.out.println("\nHas seleccionado Metodo Burbuja");
                    arreglo.Metodo_burbuja();
                    break;
                case 2:
                    System.out.println("\nHas seleccionado Metodo Selección");
                    arreglo.Metodo_seleccion();
                    break;
                case 3:
                    System.out.println("\nHas seleccionado Metodo Inserción");
                    arreglo.Metodo_insercion();
                    break;
		case 4:
                    System.out.println("\nHas seleccionado Metodo Merge Sort");
                    Random random = new Random();
                    System.out.println("Ingrese el numero de elementos del array");
                    int num = sc.nextInt();
                    int [] numeros = new int[num];
                    System.out.println("Numeros desorganizados");
                    for(int i=0;i<num;i++){
                        numeros[i] = random.nextInt(num)+1;
                        System.out.println(numeros[i]);
			}
			mergeSort(numeros, 0, num - 1);
                        System.out.println("\n\nNúmeros ordenados:");
                        for (int i = 0; i < num; i++) {
                            System.out.print(numeros[i] + " ");
                        }
                        break;
		case 5:
                    System.out.println("");
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("");
                    System.out.println("¡Opción no válida! Intente nuevamente");
		}
                }while(opc3 != 5);
		case 3:
                    System.out.println("");
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("");
                    System.out.println("¡Opción no válida! Intente nuevamente");
                
    }
    }while(opc1 != 4); 
    }
}