
package rft_8_het_black_jack;


/**
 * <h1>BlackJack j�t�k</h1>
	 * <h2>Szerz�k:</h2>
	 * <ul>
	 * 		<li>A j�t�kot k�sz�tette: Fodor Bal�zs</li>
	 * 		<li>Az egys�gtesztet k�sz�tette: Fodor Bal�zs</li>
	 * 		<li>Dokumnet�ci�val ell�tta: Mocs�ri Rich�rd</li>
	 * </ul>
	 * @version 1.0
	 *  @author Fodor Bal�zs, Mocs�ri Rich�rd
**/


public class App{
	public static void main(String[] args) {
		System.out.println("Lap  �rt�ke");
		System.out.println("�sz  1 vagy 11");
		System.out.println("Kir�ly, D�ma, Bubi  10");
		System.out.println("Sz�mozott lapok (2�10)  A lapon l�v� sz�m �rt�ke \n");
		//new Player();
		//new G�p();
		Main_game main=new Main_game();
		Player player=new Player();
		G�p gep=new G�p();
		main.Osszeg(player.Osszeg, gep.Gep_Osszeg);
		
	}
}
		
		

	
	


