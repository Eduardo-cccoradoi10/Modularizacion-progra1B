import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = -1; // valor inicial distinto de 0

		while (opcion != 0) {

		    mostrarMenu(); // mostramos el menú

		    opcion = leerEntero(); // pedimos la opción con validación

		    switch (opcion) {
		        case 1:
		            ejercicioCalculadora();
		            break;
		        case 2:
		            ejercicioValidarContrasena();
		            break;
		        case 3:
		        	ejercicioNumeroPrimo();
		        	break;
		        case 4:
		        	ejercicioSumaPares();
		        	break;
		        case 5:
		        	ejercicioConversionTemperatura();
		        	break;
		        case 6:
		        	ejercicioContarVocales();
		        	break;
		        case 7:
		        	ejercicioFactorial();
		        	break;
		        case 8:
		        	ejercicioAdivinanza();
		        	break;
		        case 9:
		        	ejercicioPasoPorReferencia();
		        	break;
		        case 10:
		            ejercicioTablaMultiplicar();
		            break;
		        case 0:
		            System.out.println("Saliendo...");
		            break;
		        default:
		            System.out.println("Opcion invalida");
		    }
		}

	}
	public static void mostrarMenu() {
		System.out.println("===== MENU PRINCIPAL =====");
	    System.out.println("1. Calculadora");
	    System.out.println("2. Validacion de contrasena");
	    System.out.println("3. Numero primo");
	    System.out.println("4. Suma de numeros pares");
	    System.out.println("5. Conversion de temperatura");
	    System.out.println("6. Contador de vocales");
	    System.out.println("7. Factorial");
	    System.out.println("8. Juego de adivinanza");
	    System.out.println("9. Intercambio de numeros");
	    System.out.println("10. Tabla de multiplicar");
	    System.out.println("0. Salir");

	}

	public static void ejercicioCalculadora() {

	    int opcion = -1;

	    while (opcion != 0) {

	        System.out.println("===== CALCULADORA =====");
	        System.out.println("1. Sumar");
	        System.out.println("2. Restar");
	        System.out.println("3. Multiplicar");
	        System.out.println("4. Dividir");
	        System.out.println("0. Regresar al menu principal");
	        System.out.print("Seleccione una opcion: ");

	        opcion = leerEntero(); // validación de número entero

	        if (opcion == 0) {
	            System.out.println("Regresando al menu principal...");
	            break;
	        }

	        // Pedimos los nmeros solo si la opción es válida
	        System.out.println("Ingrese el primer numero:");
	        double num1 = leerDouble();

	        System.out.println("Ingrese el segundo numero:");
	        double num2 = leerDouble();

	        switch (opcion) {
	            case 1:
	                System.out.println("Resultado: " + (num1 + num2));
	                break;

	            case 2:
	                System.out.println("Resultado: " + (num1 - num2));
	                break;

	            case 3:
	                System.out.println("Resultado: " + (num1 * num2));
	                break;

	            case 4:
	                if (num2 == 0) {
	                    System.out.println("Error: no se puede dividir entre cero.");
	                } else {
	                    System.out.println("Resultado: " + (num1 / num2));
	                }
	                break;

	            default:
	                System.out.println("Opción inválida.");
	                break;
	        }

	        System.out.println(); // línea en blanco para orden visual
	    }
	}


	public static void ejercicioValidarContrasena() {

	    Scanner sc = new Scanner(System.in);
	    String contrasena;

	    do {
	        System.out.print("Ingrese la contraseña: ");
	        contrasena = sc.nextLine();

	        if (!contrasena.equals("1234")) {
	            System.out.println("Contraseña incorrecta. Intente de nuevo.");
	        }

	    } while (!contrasena.equals("1234"));

	    System.out.println("Acceso concedido.");
	}

public static void ejercicioNumeroPrimo() {

    System.out.println("===== VERIFICAR NUMERO PRIMO =====");

    System.out.print("Ingrese un numero entero: ");
    int numero = leerEntero();

    // Los números menores o iguales a 1 NO son primos
    if (numero <= 1) {
        System.out.println(numero + " NO es un numero primo.");
        return;
    }

    boolean esPrimo = true;

    // Verificamos divisores desde 2 hasta numero - 1
    for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            esPrimo = false;
            break; // ya no necesitamos seguir revisando
        }
    }

    if (esPrimo) {
        System.out.println(numero + " SI es un numero primo.");
    } else {
        System.out.println(numero + " NO es un numero primo.");
    }
}


public static void ejercicioSumaPares() {

    System.out.println("===== SUMA DE NUMEROS PARES =====");

    System.out.print("Ingrese un numero entero: ");
    int n = leerEntero();

    int suma = 0;
    int i = 1;

    while (i <= n) {
        if (i % 2 == 0) { // si es par
            suma += i;
        }
        i++; // importante para evitar bucle infinito
    }

    System.out.println("La suma de los numeros pares desde 1 hasta " + n + " es: " + suma);
}



public static void ejercicioConversionTemperatura() {

    int opcion = -1;

    while (opcion != 0) {

        System.out.println("===== CONVERSION DE TEMPERATURA =====");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.println("0. Regresar al menú principal");
        System.out.print("Seleccione una opcion: ");

        opcion = leerEntero();

        switch (opcion) {

            case 1:
                System.out.print("Ingrese la temperatura en Celsius: ");
                double celsius = leerDouble();
                double fahrenheit = celsius * 1.8 + 32;
                System.out.println("Resultado: " + fahrenheit + " °F");
                break;

            case 2:
                System.out.print("Ingrese la temperatura en Fahrenheit: ");
                double f = leerDouble();
                double c = (f - 32) / 1.8;
                System.out.println("Resultado: " + c + " °C");
                break;

            case 0:
                System.out.println("Regresando al menu principal...");
                break;

            default:
                System.out.println("Opción invalida.");
                break;
        }

        System.out.println(); // espacio para orden visual
    }
}


public static void ejercicioContarVocales() {

    Scanner sc = new Scanner(System.in);

    System.out.println("===== CONTADOR DE VOCALES =====");
    System.out.print("Ingrese una frase o palabra: ");
    String texto = sc.nextLine();

    int contador = 0;

    for (int i = 0; i < texto.length(); i++) {
        char c = texto.charAt(i);

        if (c == 'a' || c == 'A' ||
            c == 'e' || c == 'E' ||
            c == 'i' || c == 'I' ||
            c == 'o' || c == 'O' ||
            c == 'u' || c == 'U') {

            contador++;
        }
    }

    System.out.println("La frase contiene " + contador + " vocal(es).");
}


public static void ejercicioFactorial() {

    System.out.println("===== FACTORIAL =====");

    System.out.print("Ingrese un número entero no negativo: ");
    int n = leerEntero();

    if (n < 0) {
        System.out.println("Error: el factorial no está definido para numeros negativos.");
        return;
    }

    int resultado = 1;
    int i = 1;

    while (i <= n) {
        resultado *= i; // resultado = resultado * i
        i++; // avanzar
    }

    System.out.println("El factorial de " + n + " es: " + resultado);
}



public static void ejercicioAdivinanza() {

    System.out.println("===== JUEGO DE ADIVINANZA =====");

    int secreto = (int)(Math.random() * 100) + 1;
    int intento;

    do {
        System.out.print("Adivine el numero (1-100): ");
        intento = leerEntero();

        if (intento > secreto) {
            System.out.println("El numero es menor.");
        } else if (intento < secreto) {
            System.out.println("El numero es mayor.");
        }

    } while (intento != secreto);

    System.out.println("¡Correcto! El numero era " + secreto + ".");
}


public static void ejercicioPasoPorReferencia() {

    System.out.println("===== INTERCAMBIO DE NUMEROS (PASO POR REFERENCIA) =====");

    System.out.print("Ingrese el primer numero: ");
    Numero a = new Numero(leerEntero());

    System.out.print("Ingrese el segundo numero: ");
    Numero b = new Numero(leerEntero());

    System.out.println("\nAntes del intercambio:");
    System.out.println("a = " + a.valor);
    System.out.println("b = " + b.valor);

    intercambiar(a, b);

    System.out.println("\nDespues del intercambio:");
    System.out.println("a = " + a.valor);
    System.out.println("b = " + b.valor);
}
public static void intercambiar(Numero a, Numero b) {
    int temp = a.valor;
    a.valor = b.valor;
    b.valor = temp;
}


public static void ejercicioTablaMultiplicar() {

    System.out.println("===== TABLA DE MULTIPLICAR =====");

    System.out.print("Ingrese un numero entero: ");
    int numero = leerEntero(); // validación automática

    System.out.println("\nTabla del " + numero + ":");
    mostrarTabla(numero);
}

public static void mostrarTabla(int n) {
    int i = 1;

    while (i <= 10) {
        System.out.println(n + " x " + i + " = " + (n * i));
        i++;
    }
}


	public static int leerEntero() {
	    Scanner sc = new Scanner(System.in);

	    while (true) {
	        try {
	            System.out.print("Ingrese un numero entero: ");
	            int numero = sc.nextInt();
	            return numero; // si llega aquí, el número es válido
	        } catch (Exception e) {
	            System.out.println("Error: debe ingresar un numero entero valido.");
	            sc.nextLine(); // limpia el buffer para evitar bucles infinitos
	        }
	    }
	}


	public static double leerDouble() {
	    Scanner sc = new Scanner(System.in);

	    while (true) {
	        try {
	            System.out.print("Ingrese un numero decimal: ");
	            double numero = sc.nextDouble();
	            return numero; // si llega aquí, el número es válido
	        } catch (Exception e) {
	            System.out.println("Error: debe ingresar un numero decimal valido.");
	            sc.nextLine(); // limpia el buffer para evitar bucles infinitos
	        }
	    }
	}



}
