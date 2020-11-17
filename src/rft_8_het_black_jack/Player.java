

package rft_8_het_black_jack;

import java.util.Scanner;
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
 <h2> Player oszt�ly</h2>
 <p>Player konstruktor�ban t�rt�nik a j�t�k utas�t�sai</p>
 */
public class Player{
	String[] lap_en=new String[10];
	int db=0;
	int Osszeg=0;
	Player(){
		Main_game black_jack=new Main_game();
		lap_en[db]=black_jack.LapKap(black_jack.LapAdd());
		System.out.println("�n Lapom: "+lap_en[db]+"\n");
		Scanner sc=new Scanner(System.in);
		String valasz="";
		System.out.println("\n K�rsz lapot? 'i' vagy 'n'  \n");
		valasz=sc.nextLine();
		db=1;
		while(!(valasz.equals("n"))) {
		System.out.println("\n K�rsz lapot? 'i' vagy 'n'  \n");
		lap_en[db]=black_jack.Dontes(valasz);
		System.out.println("�j lap: "+lap_en[db]);
		db++;
		valasz=sc.nextLine();
		}
		
		System.out.println("�sszes lap: ");
		for (int i = 0; i < db; i++) {
			System.out.print(" "+lap_en[i]+",");
			black_jack.Ertekeles(lap_en[i],"player");
			
		}
		System.out.println(" �sszeg: "+black_jack.Osszeg);
		Osszeg=black_jack.Osszeg;
		}

}

/**
<h2> G�p oszt�ly</h2>

<p>G�p konstruktor�ban t�rt�nik a j�t�k utas�t�sai</p>
*/

class G�p{
	String[] lap_gep =new String[10];
	int db=0;
	int Gep_Osszeg=0;
	G�p(){
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
			System.out.println(" G�p �sszeg: "+black_jack.Osszeg_gep);
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
