package kapitel_09;
import javax.swing.JFrame;

public class BenytGrafikpanel
{
	public static void main(String[] arg)
	{
		Grafikpanel panel = new Grafikpanel();        // opret panelet

		JFrame vindue = new JFrame("Grafikpanel");    // opret et vindue på skærmen
		vindue.add( panel );                          // vis panelet i vinduet

		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
		vindue.setSize(350,70);                       // sæt vinduets størrelse
		vindue.setVisible(true);                      // åbn vinduet
	}
}