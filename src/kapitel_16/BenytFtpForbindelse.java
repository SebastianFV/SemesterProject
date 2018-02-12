package kapitel_16;
public class BenytFtpForbindelse {
	public static void main(String[] a) throws Exception
	{
		FtpForbindelse f = new FtpForbindelse();
		// bemærk - vær altid MEGET FORSIGTIG med at angive adgangskoder i en fil!!
		f.forbind("javabog.dk","nordfalk","adgangskoden");

		f.sendKommando("HELP");    // få liste over kommandoer som tjenesten kender
		f.modtagTekst("LIST");     // få liste over filer på værten

		String indhold = "Indhold af en lille fil med navnet:\nfil.txt\n";
		f.sendTekst("STOR fil.txt", indhold);       // gem en tekstfil på værten

		indhold = f.modtagTekst("RETR fil.txt");    // hent filen igen 
		System.out.println("Fil hentet med indholdet: "+indhold);
	}
}