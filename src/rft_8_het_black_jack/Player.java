

package rft_8_het_black_jack;

import java.util.Scanner;
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
 <h2> Player osztály</h2>
 <p>Player konstruktorában történik a játék utasításai</p>
 */
public class Player{
	String[] lap_en=new String[10];
	int db=0;
	int Osszeg=0;
	Player(){
		Main_game black_jack=new Main_game();
		lap_en[db]=black_jack.LapKap(black_jack.LapAdd());
		System.out.println("Én Lapom: "+lap_en[db]+"\n");
		Scanner sc=new Scanner(System.in);
		String valasz="";
		System.out.println("\n Kérsz lapot? 'i' vagy 'n'  \n");
		valasz=sc.nextLine();
		db=1;
		while(!(valasz.equals("n"))) {
		System.out.println("\n Kérsz lapot? 'i' vagy 'n'  \n");
		lap_en[db]=black_jack.Dontes(valasz);
		System.out.println("Új lap: "+lap_en[db]);
		db++;
		valasz=sc.nextLine();
		}
		
		System.out.println("Összes lap: ");
		for (int i = 0; i < db; i++) {
			System.out.print(" "+lap_en[i]+",");
			black_jack.Ertekeles(lap_en[i],"player");
			
		}
		System.out.println(" Összeg: "+black_jack.Osszeg);
		Osszeg=black_jack.Osszeg;
		}

}

/**
<h2> Gép osztály</h2>

<p>Gép konstruktorában történik a játék utasításai</p>
*/

class Gép{
	String[] lap_gep =new String[10];
	int db=0;
	int Gep_Osszeg=0;
	Gép(){
		Main_game black_jack=new Main_game();
		for (int i = 0; i < 2; i++) {
			lap_gep[i]=black_jack.LapKap(black_jack.LapAdd());
			black_jack.Ertekeles(lap_gep[i],"gep");
			}
		boolean plusz=true;
		 db=3;
		while(plusz) {
		if(black_jack.Osszeg_gep>=15) {
			for (int i = 0; i <=db; i++) {
				System.out.print(" "+lap_gep[i]+",");
			}
			System.out.println(" Gép Összeg: "+black_jack.Osszeg_gep);
			Gep_Osszeg=black_jack.Osszeg_gep;
			plusz=false;
		}else {
			lap_gep[db]=black_jack.LapKap(black_jack.LapAdd());
			black_jack.Ertekeles(lap_gep[db],"gep");
		}
		
		db++;
		}
		
	}
		
	
}
