package ernadas_ratai_kvadratai;

public class MakeLifeEasy {

	public static boolean between ( Double reiksme, Double nuo, Double iki ) {
		
		boolean yra_tarp = false;
		
		if ( ( reiksme >= nuo) && ( reiksme <= iki ) ) {
			
			yra_tarp = true;
		}
		return yra_tarp;
	}
}
