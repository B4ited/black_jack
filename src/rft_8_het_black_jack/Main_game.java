package rft_8_het_black_jack;
import java.util.Random;

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
public class Main_game {

/**
 * <h2>Változok</h2>
 * <ul>
 * <li>[]lapok:String<li> 
 * <li>Osszeg:int<li>
 * <li>Osszeg_gep:int<li>
 * </ul>
 * **/	
	
/**<p>lapok: Tömb amiben 13 fajta lapvan szöveg</p>**/	
public String [] lapok={"Ász","Király","Dráma","Bubi","10","9","8","7","6","5","4","3","2"};
/**<p>lapok: Osszeg (Player lapok) osszerteket tartalmazza</p>**/
public int Osszeg=0;
/**<p>lapok: Osszeg_gep (Gép lapok) osszerteket tartalmazza</p>**/
public int Osszeg_gep=0;

/**
 * <h2>Metódusok</h2>
 * 
 *<ul> 
 * <li>LapAdd</li>
 * <li>LapKap</li> 
 * <li>Dontes</li> 
 * <li>Ertekeles</li> 
 *</ul> 
 * **/

	/** <p> LapAdd(): Francia kártyában 13 fajta lap van, ezért generál egy 1-13 közötti int típusú változott (lapot)</p>**/
	public int LapAdd() {
		return (int)(Math.random()* 13);}
	/** <p> LapKap(int i): A tömb ami tartalmazza lapok fajtáját annak az indexe lesz  a függvényem paraméterében.</p>**/
	public String LapKap(int i) {
		return lapok[i];}
	/** <p> Dontes(String valasz): Eldönti a metodúsom paraméterében  kérek még lapot vagy sem.</p>**/
	public String Dontes(String valasz) {
		if(valasz.equals("i")) {
			return LapKap(LapAdd());
		}
		else if(valasz.equals("n")){
			
			System.out.println("Megáltál");
			return "0";
			
		}else {
			System.out.println("Hibás döntés!");
			return "0";
		}
		
		
	}
	/** <p> Ertekeles(String lap, String type): Fõ funkciója megvizsgálja lap értékét másik eldönit, hogy a typeban player vagy gep van a szerint adja össze a pontokat.</p>**/
	public int Ertekeles(String lap, String type) {
		
			if(type.equals("player")) {
			if(lap.equals("Ász")) Osszeg+=11;
			else if(lap.equals("Király")||lap.equals("Dráma")||lap.equals("Bubi")) Osszeg+=10;
			else Osszeg+=Integer.parseInt(lap);
			return Osszeg;
			}else {
				if(lap.equals("Ász")) Osszeg_gep+=11;
				else if(lap.equals("Király")||lap.equals("Dráma")||lap.equals("Bubi")) Osszeg_gep+=10;
				else Osszeg_gep+=Integer.parseInt(lap);
				}
			
			return Osszeg_gep;
			
			
		}
	
public void Osszeg(int x , int y) {
	System.out.println("Te: "+x );
	System.out.println("Gép: "+y );
	if(x==21) System.out.println("Te nyertél");
	else if(y==21) System.out.println("Gép nyert");
	else if(x>21) System.out.println("Gép nyert");
	else if(y>21) System.out.println("Te nyertél");
	else if(x>y) System.out.println("Te nyertél");
	else if(x<y) System.out.println("Gép nyert");
	else System.out.println("Döntetlen");
	
	}

	
	
	
	
	

}
