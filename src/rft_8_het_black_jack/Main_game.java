package rft_8_het_black_jack;
import java.util.Random;

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
public class Main_game {

/**
 * <h2>V�ltozok</h2>
 * <ul>
 * <li>[]lapok:String<li> 
 * <li>Osszeg:int<li>
 * <li>Osszeg_gep:int<li>
 * </ul>
 * **/	
	
/**<p>lapok: T�mb amiben 13 fajta lapvan sz�veg</p>**/	
public String [] lapok={"�sz","Kir�ly","Dr�ma","Bubi","10","9","8","7","6","5","4","3","2"};
/**<p>lapok: Osszeg (Player lapok) osszerteket tartalmazza</p>**/
public int Osszeg=0;
/**<p>lapok: Osszeg_gep (G�p lapok) osszerteket tartalmazza</p>**/
public int Osszeg_gep=0;

/**
 * <h2>Met�dusok</h2>
 * 
 *<ul> 
 * <li>LapAdd</li>
 * <li>LapKap</li> 
 * <li>Dontes</li> 
 * <li>Ertekeles</li> 
 *</ul> 
 * **/

	/** <p> LapAdd(): Francia k�rty�ban 13 fajta lap van, ez�rt gener�l egy 1-13 k�z�tti int t�pus� v�ltozott (lapot)</p>**/
	public int LapAdd() {
		return (int)(Math.random()* 13);}
	/** <p> LapKap(int i): A t�mb ami tartalmazza lapok fajt�j�t annak az indexe lesz  a f�ggv�nyem param�ter�ben.</p>**/
	public String LapKap(int i) {
		return lapok[i];}
	/** <p> Dontes(String valasz): Eld�nti a metod�som param�ter�ben  k�rek m�g lapot vagy sem.</p>**/
	public String Dontes(String valasz) {
		if(valasz.equals("i")) {
			return LapKap(LapAdd());
		}
		else if(valasz.equals("n")){
			
			System.out.println("Meg�lt�l");
			return "0";
			
		}else {
			System.out.println("Hib�s d�nt�s!");
			return "0";
		}
		
		
	}
	/** <p> Ertekeles(String lap, String type): F� funkci�ja megvizsg�lja lap �rt�k�t m�sik eld�nit, hogy a typeban player vagy gep van a szerint adja �ssze a pontokat.</p>**/
	public int Ertekeles(String lap, String type) {
		
			if(type.equals("player")) {
			if(lap.equals("�sz")) Osszeg+=11;
			else if(lap.equals("Kir�ly")||lap.equals("Dr�ma")||lap.equals("Bubi")) Osszeg+=10;
			else Osszeg+=Integer.parseInt(lap);
			return Osszeg;
			}else {
				if(lap.equals("�sz")) Osszeg_gep+=11;
				else if(lap.equals("Kir�ly")||lap.equals("Dr�ma")||lap.equals("Bubi")) Osszeg_gep+=10;
				else Osszeg_gep+=Integer.parseInt(lap);
				}
			
			return Osszeg_gep;
			
			
		}
	
public void Osszeg(int x , int y) {
	System.out.println("Te: "+x );
	System.out.println("G�p: "+y );
	if(x==21) System.out.println("Te nyert�l");
	else if(y==21) System.out.println("G�p nyert");
	else if(x>21) System.out.println("G�p nyert");
	else if(y>21) System.out.println("Te nyert�l");
	else if(x>y) System.out.println("Te nyert�l");
	else if(x<y) System.out.println("G�p nyert");
	else System.out.println("D�ntetlen");
	
	}

	
	
	
	
	

}
