package kapitel_17;
public class BenytSnakkesagligePersoner
{
	public static void main(String[] arg)
	{
		System.out.println("BenytSnakkesagligePersoner.main() startet");
		SnakkesagligPerson p = new SnakkesagligPerson("Jacob",150); // opret Jacob
		Thread t = new Thread(p); // Ny tråd, klar til at udføre p.run()
		t.start(); // .. Nu starter personen med at snakke...

		p = new SnakkesagligPerson("Troels",400);                   // opret Troels
		t = new Thread(p);
		t.start();

		// Det kan også gøres meget kompakt:
		new Thread(new SnakkesagligPerson("Henrik",200)).start();   // opret Henrik
		System.out.println("BenytSnakkesagligePersoner.main() slutter");
	}
}