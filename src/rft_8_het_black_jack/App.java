
package rft_8_het_black_jack;


/**
 * <h1>BlackJack játék</h1>
	 * <h2>Szerzõk:</h2>
	 * <ul>
	 * 		<li>A játékot készítette: Fodor Balázs</li>
	 * 		<li>Az egységtesztet készítette: Fodor Balázs</li>
	 * 		<li>Dokumnetációval ellátta: Mocsári Richárd</li>
	 * </ul>
	 * @version 1.0
	 *  @author Fodor Balázs, Mocsári Richárd
**/


public class App{
	public static void main(String[] args) {
		System.out.println("Lap  Értéke");
		System.out.println("Ász  1 vagy 11");
		System.out.println("Király, Dáma, Bubi  10");
		System.out.println("Számozott lapok (2–10)  A lapon lévõ szám értéke \n");
		//new Player();
		//new Gép();
		Main_game main=new Main_game();
		Player player=new Player();
		Gép gep=new Gép();
		main.Osszeg(player.Osszeg, gep.Gep_Osszeg);
		
	}
}
		
		

	
	


