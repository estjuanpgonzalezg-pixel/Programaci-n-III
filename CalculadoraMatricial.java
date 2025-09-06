/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ZAIDA GUZMAN
 */
public class CalculadoraMatricial {
    public static void sumar_matriz(){
    Scanner sc = new Scanner(System.in);

    System.out.println("MATRIZ_A");
		System.out.println("Ingrese el numero de filas de la matriz");
		int nfa = sc.nextInt();
		System.out.println("Ingrese el numero de columnas de la matriz");
		int nca = sc.nextInt();
	
		System.out.println("MATRIZ_B");
		System.out.println("Ingrese el numero de filas de la matriz");
		int nfb = sc.nextInt();
		System.out.println("Ingrese el numero de columnas de la matriz");
		int ncb = sc.nextInt();
		
		int [][] matrizC = new int [nfa][nca];
		if(nfa==nfb && nca==ncb ) {
                    System.out.println("Ingresar # matrizA :");
                    int [][] matrizA = new int[nfa][nca];
                    for(int i=0; i<nfa; i++) {
                        for(int j=0; j<nca; j++) {
			System.out.println("ingrese el numero en la posicion: ("+ i + ","+ j +")");
			matrizA [i][j]= sc.nextInt();
			}
			}
                    System.out.println("Ingresar # matrizB :");
                    int [][] matrizB = new int[nfb][ncb];
                    for(int i=0; i<nfb; i++) {
                        for(int j=0; j<ncb; j++) {
			System.out.println("ingrese el numero en la posicion: ("+ i + ","+ j +")");
			matrizB [i][j]= sc.nextInt();
			}
			}
                    System.out.println("MATRIZ_A");
                    for(int i=0; i<nfa; i++) {
                    System.out.println();
                    for(int j=0; j<nca; j++) {
                    System.out.print(matrizA [i][j]+"\t");
                    }
                    }
                    System.out.println();
                    System.out.println("MATRIZ_B");
                    for(int i=0; i<nfb; i++) {
                    System.out.println();
                    for(int j=0; j<ncb; j++) {
                        System.out.print(matrizB [i][j]+"\t");
			}
                    }
                    for(int i=0; i<nfa; i++) {
                        for(int j=0; j<nca; j++) {
			matrizC[i][j] = matrizA [i][j] + matrizB [i][j];
			}
                    }
                    System.out.println();
                    System.out.println("La suma de ambas matrices es de: ");
                    for(int i=0; i<nfa; i++) {
                    System.out.println();
                    for(int j=0; j<nca; j++) {
                    System.out.print(matrizC[i][j]+"\t");
				}
			}
		}else{
			System.out.println();
			System.out.println("no se pueden sumar matrices de diferentes tamaños");
		}
  }
	
  public static void producto_matriz(){
		Scanner sc = new Scanner(System.in);
		System.out.println("MATRIZ_A");
		System.out.println("Ingrese el numero de filas de la matriz");
		int nfa = sc.nextInt();
		System.out.println("Ingrese el numero de columnas de la matriz");
		int nca = sc.nextInt();

		System.out.println("MATRIZ_B");
		System.out.println("Ingrese el numero de filas de la matriz");
		int nfb = sc.nextInt();
		System.out.println("Ingrese el numero de columnas de la matriz");
		int ncb = sc.nextInt();
		
		int[][] resultado = new int[nfa][ncb];
		if(nca == nfb) {
		System.out.println("Ingresar # matrizA :");
		int [][] matrizA = new int[nfa][nca];
                for(int i=0; i<nfa; i++) {
                    for(int j=0; j<nca; j++) {
                        System.out.println("ingrese el numero en la posicion: ("+ i + ","+ j +")");
			matrizA [i][j]= sc.nextInt();
			}
			}
                System.out.println("Ingresar # matrizB :");
                int [][] matrizB = new int[nfb][ncb];
                for(int i=0; i<nfb; i++) {
                    for(int j=0; j<ncb; j++) {
                        System.out.println("ingrese el numero en la posicion: ("+ i + ","+ j +")");
			matrizB [i][j]= sc.nextInt();
			}
                }
                for(int i=0; i<nfa; i++) {
                    for(int j=0; j<ncb; j++) {
                        resultado[i][j]=0;
			for(int k=0; k<nca; k++) {
			resultado[i][j] = resultado[i][j]+(matrizA[i][k]*matrizB[k][j]);
			}
                    }
                }
                System.out.println();
		System.out.println("---- Resultado de la Multiplicacion ----");
		for(int i=0; i<nfa; i++) {
                    for(int j=0; j<ncb; j++) {
                    System.out.print(resultado[i][j]+"\t");
                    }
                    System.out.println();
                }
		}else{
			System.out.println("No se puede realizar la multiplicacion, ya que el numero de columnas de A debe ser igual al numero de filas de B");
		}

  }

  public static void inversa_matriz(){
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese el tamaño de la matriz (filas=columnas)");
		int ni = sc.nextInt();
		System.out.println("");
		double [][] matriz_inv = new double[ni][ni];
		for(int i=0; i<ni; i++) {
			for(int j=0; j<ni; j++) {
				System.out.print("ingrese el valor de la posicion: ("+i+","+j+")");
				matriz_inv [i][j] = sc.nextInt();
			}
		}
		double [][] identidad = new double[ni][ni];
		for(int i=0;i<ni;i++){
			identidad[i][i]=1.0;
		}
		for (int i = 0; i < ni; i++) {
                    double pivote = matriz_inv[i][i];
                    if (pivote == 0) {
                        System.out.println("La matriz no tiene inversa (det=0).");
                        return;
		}
                    for (int j = 0; j < ni; j++) {
                        matriz_inv[i][j] /= pivote;
                        identidad[i][j] /= pivote;
			}
                    for (int k = 0; k < ni; k++) {
                        if (k != i) {
                            double factor = matriz_inv[k][i];
                            for (int j = 0; j < ni; j++) {
                                matriz_inv[k][j] -= factor * matriz_inv[i][j];
                                identidad[k][j] -= factor * identidad[i][j];
					}
				}
			}
		}
		//imprimir matriz inversa
		System.out.println("---- Matriz inversa----");
		for(int i=0;i<ni;i++){
			System.out.println();
			for(int j=0;j<ni;j++){
				System.out.printf("%.3f\t", identidad[i][j]);
			}
		}
  }
  public static void producto_vector(){
        Scanner sc = new Scanner(System.in);
		System.out.println("----MATRIZ----");
		System.out.println("Ingrese el numero de filas de la matriz");
		int nfa = sc.nextInt();
		System.out.println("Ingrese el numero de columnas de la matriz");
		int nca = sc.nextInt();

		System.out.println("----VECTOR----");
		System.out.println("Ingrese el numero de elementos del vector");
		int nfb = sc.nextInt();
		
		int[][] resultado = new int[nfa][1];
		if(nca == nfb) {
                    System.out.println("Ingresar # matriz :");
                    int [][] matrizA = new int[nfa][nca];
                    for(int i=0; i<nfa; i++) {
                        for(int j=0; j<nca; j++) {
                            System.out.println("ingrese el numero en la posicion: ("+ i + ","+ j +")");
                            matrizA [i][j]= sc.nextInt();
                        }
		}
                    System.out.println("Ingresar # vector :");
			int [][] matrizB = new int[nfb][1];
                        for(int i=0; i<nfb; i++) {
                            for(int j=0; j<1; j++) {
                                System.out.println("ingrese el numero en la posicion: ("+ i + ","+ j +")");
				matrizB [i][j]= sc.nextInt();
				}
			}
			for(int i=0; i<nfa; i++) {
				for(int j=0; j<1; j++) {
				resultado[i][j]=0;
				for(int k=0; k<nca; k++) {
				resultado[i][j] = resultado[i][j]+(matrizA[i][k]*matrizB[k][j]);
				}
			}
			}
			System.out.println("RESULTADO");
			for(int i=0;i<nfa;i++){
				for(int j=0;j<1;j++){
					System.out.println(resultado[i][j]);
				}
			}
		}else{
			System.out.println("El numero de columnas de a debe ser igual al numero de filas de b");
                }
		
		
  }
    
}
