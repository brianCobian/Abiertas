package programa1;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tecla = null;
        Scanner scanner = new Scanner (System.in);
        
        do{
        Scanner number = new Scanner(System.in);
        int menu;
        System.out.println("Nepoide");
        System.out.println("[1] Evaluar un resultado de 3 dados");
        System.out.println("[2] Leer numeros mayores de 20");
        System.out.println("[3] Multiplicacion");
        System.out.println("[4] Juego de adivinanza");
        System.out.println("[5] Salir");
        menu = number.nextInt();
        
        switch(menu){
            case 1:
            System.out.println("Lanzando 3 dados");
            int dado1 = (int) (Math.random() * 6) + 1;
            int dado2 = (int) (Math.random() * 6) + 1;
            int dado3 = (int) (Math.random() * 6) + 1;
            int total=0;
        
            System.out.println(dado1 + " " + dado2 + " " + dado3);
        
            if(dado1==6){
            total= total +6;
            }
            if(dado2==6){
                total=total +6;
            }
            if(dado3==6){
                    total=total+6;
            }
        
            if(total==18){
                System.out.println("Excelente");
            }
            else if (total==12){
                 System.out.println("Muy bien");
            }
            else if (total==6){
                System.out.println("Regular");
            }
            else{
                System.out.println("Pesimo");
            }
            break;
            case 2:
                Scanner reader = new Scanner(System.in);
                int numero = 0;
                int contador =0;
                int numeros = 0;
                System.out.println("Intruduzca numeros mayores a 20");
                do {			       
                    numero = reader.nextInt();
                    if(numero > 20 && numero%2==0){
                        numeros = numeros + numero;
                        contador++;
                    }
                    else if(numero>20){
                        numeros = numeros + numero;
                    }
                    else{
                        System.out.println("El numero es menor que 20");
                    }
                } while (contador<5);
                System.out.println("La suma total fue: " + numeros);
                break;
                
            case 3:
                Scanner multi = new Scanner(System.in);
                int resultado;
                int intentos=0;
                int num1 = (int) (Math.random() * 99) + 1;
                int num2 = (int) (Math.random() * 99) + 1;
                System.out.println(" "+num1);
                System.out.println("X"+num2);
                System.out.println("----");
                do{
                    resultado = multi.nextInt();
                    if(resultado != (num1*num2)){
                        intentos++;
                    }
                    else{
                        System.out.println("Correcto");
                        break;
                    }
                }while(intentos<5);
                break;
                
            case 4:
                int adivinanza = (int) (Math.random() * 99) + 1;
                Scanner adiv = new Scanner(System.in);
                int numAd;
                System.out.println("Adivina el numero entre 1 y 100");
                do{
                    numAd = adiv.nextInt();
                    if(numAd<adivinanza){
                        System.out.println("Introduzca un numero mayor");
                    }
                    else if(numAd>adivinanza){
                        System.out.println("Introduzca un numero menor");
                    }
                }while(numAd!=adivinanza);
                System.out.println("Felicidades");
                break;
            
            case 5:
                return;
                
        }
        
        System.out.print("\n¿Quiere seguir? s/n\n");
        tecla = new Scanner(System.in).nextLine();
        } while(tecla.equals("s") || tecla.equals("S"));   
        
    }
    
}
