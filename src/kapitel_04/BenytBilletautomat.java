package kapitel_04;
public class BenytBilletautomat
{
	public static void main(String[] arg)
	{
            java.util.Scanner tastatur = new java.util.Scanner(System.in);
            int input;
            int price = 24;
            int balance = 0;
            Billetautomat automat = new Billetautomat(price);                           // Creating an object for the class Billetautomat
            System.out.println("Installatøren har installeret en ny billetautomat");    // Prompt for the programmer
            System.out.println();                                                       // Create an additional space for readability
            while(true)
            {
                System.out.println("En kunde vil købe en billet");
                System.out.println("Billetprisen er: " + automat.getBilletpris()+ " kroner");
                System.out.println("Please put in the required amount");
                input = tastatur.nextInt();
                automat.indsætPenge(input);
                balance += input;
                automat.setBalance(balance);
                System.out.println("Balancen er nu på " + automat.getBalance() + " kroner");
                while(automat.getBalance() < price)
                {
                    System.out.println("du har betalt " + automat.getBalance() + " ud af " + price + "dkk");
                    balance += tastatur.nextInt();
                    automat.setBalance(balance);
                }
                automat.udskrivBillet();    
                System.out.println("Balancen er nu på " + automat.getBalance() + " kroner");
            }
	}
}