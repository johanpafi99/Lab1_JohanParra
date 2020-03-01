//importar el metodo scanner.
import java.util.Scanner;
import java.util.TooManyListenersException;
public class lab1 {
    public static void main (final String[] args) {
        // Nombrar el scanner.
        final Scanner sc = new Scanner(System.in);
        final Calculadora miC = new Calculadora();
        final CalcuArray calcuArray = new CalcuArray();
        // Declaracion de variables.
        int option;
        String palabra1;
        String palabra2;
        String palabra3;
        double num1;
        double num2;
        double aux;
        double aux2; // NOTA: Cambie este auxiliar de un int a un doblue para poder ejecutar.
        int numero;
        int i;
        int lista;

        // Estas 3 lineas me imprimen el menu de opciones proncipal.
        System.out.println("1. Enter 3 words.");
        System.out.println("2. Enter 2 real numbers above 0.");
        System.out.println("3. Enter 3 list of numbers to wich you choose the size");
        // Escaner lector, para saber que opcion eligio el usuario:
        option = sc.nextInt();

        // Este switch me manda a la opcion que eligio el usuario en el primer menu.
        switch (option) {
        // Ingresar 3 cadenas de caracteres.
        case 1:
            // Menu secundario para preguntar que hacer.
            System.out.println("1. Show the length of each word.");
            System.out.println("2. Show the 3 words in one sentence.");
            System.out
                    .println("3. Show on the screen the character located in a position of the chain, to your choice.");
            // Escaner lector, para saber que opcion eligio el usuario:
            option = sc.nextInt();
            sc.nextLine();
            // Este switch me manda a la opcion que eligio el usuario en el segundo menu.
            switch (option) {
            // Desplegar la logitud de cada una de las cadenas.
            case 1:
                // Pedir palabras.
                System.out.println("Enter the first word.");
                palabra1 = sc.nextLine();
                System.out.println("Enter the second word.");
                palabra2 = sc.nextLine();
                System.out.println("Enter the third word.");
                palabra3 = sc.nextLine();

                // Imprimir longitud de cada una de las palabras.
                System.out.println("The first word is " + palabra1.length() + " characters long");
                System.out.println("The second word is " + palabra2.length() + " characters long");
                System.out.println("The third word is " + palabra3.length() + " characters long");
                break;
            // Concatenar las tres cadenas.
            case 2:
                // Pedir palabras.
                System.out.println("Enter the first word.");
                palabra1 = sc.nextLine();
                System.out.println("Enter the second word.");
                palabra2 = sc.nextLine();
                System.out.println("Enter the third word.");
                palabra3 = sc.nextLine();
                // Imprimir cadenas concatenadas
                System.out.println(palabra1 + " " + palabra2 + " " + palabra3);
                break;
            // Mostrar el caracter en la posicion elegida por el usuario
            case 3:
                // variable.
                int position;
                // Pedir palabras y posicion a mostrar.
                System.out.println("Enter the first word.");
                palabra1 = sc.nextLine();
                System.out.println("Enter the second word.");
                palabra2 = sc.nextLine();
                System.out.println("Enter the third word.");
                palabra3 = sc.nextLine();
                System.out.println("Enter the position of the 3 words you want to see.");
                position = sc.nextInt();
                // Este if me muestra los caracteres en la posicion dada de ser posible, sino me
                // dice que ingrese un numero valido.
                if (position <= palabra1.length() && position <= palabra2.length() && position <= palabra3.length()
                        && position > 0) {
                    System.out.println(
                            "The " + position + "th character of the first word is: " + palabra1.charAt(position - 1));
                    System.out.println(
                            "The " + position + "th character of the second word is: " + palabra2.charAt(position - 1));
                    System.out.println(
                            "The " + position + "th character of the third word is: " + palabra3.charAt(position - 1));
                } else {
                    System.out.println(
                            "You've enter a position that doesn't exist in one or more words, please verify and try again.");
                }
                break;
            }
            break;

        // Ingresar 2 numeros reales mayores a 0
        case 2:
            System.out.println("1. Show the division of both numbers.");
            System.out.println("2. Show the division of both numbers and the residue.");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
            case 1:
                System.out.println("Enter the first number.");
                num1 = sc.nextDouble();
                System.out.println("Enter the second number.");
                num2 = sc.nextDouble();
                if (num2 != 0) {
                    aux = miC.dividir(num1, num2);
                    System.out.println("The division of " + num1 + " and " + num2 + " is equal to " + aux);
                } else {
                    System.out.println("This division is UNDEFINED");
                }
                break;
            case 2:
                System.out.println("Enter the first number.");
                num1 = sc.nextDouble();
                System.out.println("Enter the second number.");
                num2 = sc.nextDouble();
                if (num2 != 0) {
                    aux = num1 / num2; // Decimales muy largoss!!!!! hacer un cast
                    aux2 = num1 % num2;
                    final int ax = (int) aux2;

                    System.out.println("The division of " + num1 + " and " + num2 + " is equal to ");
                    System.out.printf("%.2f", aux);
                    System.out.println("The residue is: " + ax);
                } else {
                    System.out.println("This division is UNDEFINED");
                }
                break;
            }
            break;

        // Ingresar arreglos.
        case 3:

            int [] arreglo1 = new int [20];
            int [] arreglo2 = new int [20];
            int [] arreglo3 = new int [20];
            int tam;

        System.out.println("Enter the length of your first list. Max capacity: 20");
        tam = sc.nextInt();
        sc.nextLine();
        
        for (i=0; i < tam ; i++){
            System.out.println("Enter the "+(i+1)+"th number");
            numero = sc.nextInt();
            arreglo1 [i] = numero;
        }

        for (i=0; i < tam ; i++){
            System.out.println("Enter the "+(i+1)+"th number");
            numero = sc.nextInt();
            arreglo2 [i] = numero;
        }
    
        for (i=0; i < tam ; i++){
            System.out.println("Enter the "+(i+1)+"th number");
            numero = sc.nextInt();
            arreglo3 [i] = numero;
        }
        
        System.out.println("1. Show the 3 lists you entered.");
        System.out.println("2. Show the average of a lsit you choose.");
        System.out.println("3. Show the highest value of a list you choose.");
        System.out.println("4. Show a new list as the result of (+, -, or *) between two list of your choice.");
        System.out.println("5. Show a combine list of the 3 lists you entered.");
        System.out.println("6. Show an interception between the 3 lists you entered");
        System.out.println("7. Rotate the numbers's position how many times you want.");
        System.out.println("8. Arrange any list you choose from low to high.");
        option = sc.nextInt();
        sc.nextLine();
        switch (option){
        case 1:
            System.out.println("lista 1:");
            for(i=0; i < tam; i++){
                System.out.print(arreglo1[i]+", ");
            }
            System.out.println();
            System.out.println("lista 2:");
            for(i=0; i < tam; i++){
                System.out.print(arreglo2[i]+", ");
            }
            System.out.println();
            System.out.println("lista 3:");
            for(i=0; i < tam; i++){
                System.out.print(arreglo3[i]+", ");
            }
            System.out.println();
        break;
        case 2:
            int suma;
            double promedio;
            System.out.println("Choose the list you wish to know its average.");
            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                suma = 0;
                promedio = 0;
                    for (i=0; i < tam; i++){
                        suma += arreglo1[i];
                        promedio = suma/tam;
                    }
                    System.out.println("the average of the first list is: "+promedio);
                break;
                case 2:
                suma = 0;
                promedio = 0;
                    for (i=0; i < tam; i++){
                        suma += arreglo2[i];
                        promedio = suma/tam;
                    }
                    System.out.println("the average of the second list is: "+promedio);
                break;
                case 3:
                suma = 0;
                promedio = 0;
                    for (i=0; i < tam; i++){
                        suma += arreglo3[i];
                        promedio = suma/tam;
                    }
                    System.out.println("the average of the third list is: "+promedio);
                break;
            }
        break;
        case 3:
            System.out.println("Choose the list you wish to know its highest value.");
            option = sc.nextInt();
            sc.nextLine();
            int max = 0;
            switch (option){
                case 1:
                max = arreglo1[0];
                for (i = 0; i < arreglo1.length; i++) {
                    if(arreglo1[i]>max){
                    max=arreglo1[i];
                    }
                }
                System.out.println("The highest value of the first list is: "+max);
                break;
                case 2:
                max = arreglo2[0];
                for (i = 0; i < arreglo2.length; i++) {
                    if(arreglo2[i]>max){
                    max=arreglo2[i];
                    }
                }
                System.out.println("The highest value of the second list is: "+max);
                break;
                case 3:
                max=arreglo3[0];
                for (i = 0; i < arreglo3.length; i++) {
                    if(arreglo3[i]>max){
                    max=arreglo3[i];
                    }
                }
                System.out.println("The highest value of the third list is: "+max);
                break;
            }
        break;
        case 4:
            int starray = 0;
            int ndarray = 0;
            int sumatoria = 0;
            System.out.println("choose the arrays you want to operate.");
            starray = sc.nextInt();
            sc.nextLine();
            ndarray = sc.nextInt();
            sc.nextLine();
            
            System.out.println("What operation do you want to apply?");
            option= sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.println();
                break;
            }
            
        break;
        case 6:
            numero=0;
            int rep = 0;
            int j = 0;
            int k;
            int [] arregloX = new int [arreglo1.length+arreglo2.length+arreglo3.length];
            int [] arregloY = new int [rep];
            for (i=0; i < arregloX.length; i+=3, j++){
                arregloX[i] = arreglo1[j];
                arregloX[i+1] = arreglo2[j];
                arregloX[i+2] = arreglo3[j];
            }
            for (i=0; i<arregloX.length; i++ ){
                for (j=i+1; j<arregloX.length; j++){
                    if(arregloX[i]==arregloX[j]);
                    arregloY[i] = arregloX[i];
                    rep++;
                }   
            }
            for(i=0; i < rep; i++){
                System.out.print(arregloY[i]+", ");
            }
        break;
        }
        
        break;

    }
}
}