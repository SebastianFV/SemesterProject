package kapitel_04;
public class BenytBilletautomat
{
	public static void main(String[] arg)
	{
            java.util.Scanner tastatur = new java.util.Scanner(System.in);
            int input;
            int price = 24;
            Billetautomat automat = new Billetautomat(price);                           // Creating an object for the class Billetautomat
            System.out.println("Installatøren har installeret en ny billetautomat");    // Prompt for the programmer
            System.out.println();                                                       // Create an additional space for readability
            while(true)
            {
                System.out.println("En kunde vil købe en billet");
                int pris = automat.getBilletpris();
                System.out.println("Billetprisen er: " + pris + " kroner");
                System.out.println("Please put in the required amount");
                input = tastatur.nextInt();
                automat.indsætPenge(input);
                System.out.println("Balancen er nu på " + automat.getBalance() + " kroner");
                while(input < price)
                {
                    System.out.println("du har betalt " + input + " ud af " + price + "dkk");
                    input = input+tastatur.nextInt();
                }
                automat.udskrivBillet();    
                System.out.println("Balancen er nu på " + automat.getBalance() + " kroner");
            }
	}
}