/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ZAIDA GUZMAN
 */
public class Ordenamiento {
     public static void Metodo_burbuja(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese la cantidad de numeros");
			int num = sc.nextInt();
			int [] numeros = new int[num];
			System.out.println("Numeros desorganizados");
			for(int i=0;i<num;i++){
                            numeros[i] = (int)(Math.random()*10+1);
                            System.out.println(numeros[i]);
			}
			System.out.println("Numeros Ordenados");
			int aux=0;
			for(int i=0;i<num-1;i++){
                            for(int j=0;j<num-1;j++){
                                if(numeros[j]>numeros[j+1]){
                                    aux = numeros[j];
                                    numeros[j] = numeros [j+1];
                                    numeros[j+1] = aux;
                                }
			}
			}
                        for(int i=0;i<num;i++){
                            System.out.println(numeros[i]);
			}
	}
	public static void Metodo_seleccion(){
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			System.out.println("Ingrese el numero de elementos del array");
			int num = sc.nextInt();
			int [] numeros = new int[num];
			System.out.println("Numeros desorganizados");
			for(int i=0;i<num;i++){
			numeros[i] = random.nextInt(num)+1;
			System.out.println(numeros[i]);
			}
                        System.out.println("Numeros Ordenados");
			for(int i=0;i<num-1;i++){
                            int indice = i;
                            for(int j = i+1;j<num;j++){
                                if(numeros[j] < numeros[indice]){
                                    indice = j;
                                }
			}
                            int aux = numeros[i];
                            numeros[i] = numeros[indice];
                            numeros[indice] = aux;
			}
			for(int i=0;i<num;i++){
                            System.out.println(numeros[i]);
			}
	}
	public static void Metodo_insercion(){
			Scanner sc = new Scanner(System.in);
			Random random = new Random();
			System.out.println("Ingrese el numero de elementos del array");
			int num = sc.nextInt();
			int [] numeros = new int[num];
			System.out.println("Numeros desorganizados");
			for(int i=0;i<num;i++){
			numeros[i] = random.nextInt(num)+1;
                        System.out.println(numeros[i]);
			}

			System.out.println("Numeros Ordenados");
			for(int i=1;i<num;i++){
                            int clave = numeros[i];
                            int j= i-1;
                            while(j >= 0 && numeros[j] > clave){
                                numeros[j + 1] = numeros[j];
                                j--;
                            }
                            numeros[j+1] = clave;
			}
			for(int i=0;i<num;i++){
                            System.out.println(numeros[i]);
			}
	}
	public static void mergeSort(int[] arr, int izquierda, int derecha) {
			if (izquierda < derecha) {
                            int medio = (izquierda + derecha) / 2;
                            mergeSort(arr, izquierda, medio);
                            mergeSort(arr, medio + 1, derecha);
                            merge(arr, izquierda, medio, derecha);
			}
	}
	
	public static void merge(int[] arr, int izquierda, int medio, int derecha) {
            int n1 = medio - izquierda + 1;
            int n2 = derecha - medio;
            int[] L = new int[n1];
            int[] R = new int[n2];
            for (int i = 0; i < n1; i++)
                L[i] = arr[izquierda + i];
            for (int j = 0; j < n2; j++)
                R[j] = arr[medio + 1 + j];
            int i = 0, j = 0;
            int k = izquierda;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
		} else {
                    arr[k] = R[j];
                    j++;
		}
                k++;
		}
		while (i < n1) {
		arr[k] = L[i];
		i++;
                k++;
                }
                while (j < n2) {
                    arr[k] = R[j];
                    j++;
                    k++;
                }
	}
	
}
