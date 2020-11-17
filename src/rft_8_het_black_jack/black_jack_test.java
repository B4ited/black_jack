package rft_8_het_black_jack;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * <h1>BlackJack j�t�k</h1>
	 * <h2>Szerz�k:</h2>
	 * <ul>
	 * 		<li>A j�t�kot k�sz�tette: Fodor Bal�zs</li>
	 * 		<li>Az egys�gtesztet k�sz�tette: Fodor Bal�zs</li>
	 * 		<li>Dokumnet�ci�val ell�tta: Mocs�ri Rich�rd</li>
	 * </ul>
	 * @version 1.0
	 * @author Fodor Bal�zs, Mocs�ri Rich�rd

**/
class black_jack_test {
	Main_game test=new Main_game();
	/**<h1>Testek</h1>
	/**<p>LapAdd(): megvizsg�lja sz�mot kapok</p>**/
	@Test
	void LapAdd() {
		Integer test=this.test.LapAdd();
		Integer x=1;
		String eredmeny=test.getClass().getName();
		String elvaras=x.getClass().getName();
		assertEquals(elvaras,eredmeny);
		
	}
	
	/**<p>LapKap(): megvizsg�lja sz�veget kapok</p>**/
	@Test
	void  LapKap() {
		String eredmeny=test.LapKap(5);
		String elvaras="a";
		assertEquals(elvaras.getClass().getName(),eredmeny.getClass().getName());
		
	}
	/**<p>Dontes_i(): megvizsg�lja sz�veget kapok</p>**/
	@Test
	void Dontes_i() {
		String eredmeny=test.Dontes("i").getClass().getName();
		String elvaras="a".getClass().getName();
		assertEquals(elvaras,eredmeny);
	}
	/**<p>Dontes_n(): megvizsg�lja 0 kapok</p>**/
	@Test
	void Dontes_n() {
		String eredmeny=test.Dontes("n");
		String elvaras="0";
		assertEquals(elvaras,eredmeny);
	}
	/**<p>Dontes_hibas(): megvizsg�lja 0 kapok</p>**/
	@Test
	void Dontes_hibas() {
		String eredmeny=test.Dontes("1");
		String elvaras="0";
		assertEquals(elvaras,eredmeny);
	}
	/**<p>Ertekeles_player() : megvizsg�lja kapot param�terben szoveg (lap) azt az �rt�ket kapom (felhaszn�l�)</p>**/
	@Test
	void  Ertekeles_player() {
		int eredmeny=test.Ertekeles("Dr�ma", "player");
		int elvaras=10;
		assertEquals(elvaras,eredmeny);
		
	}
	/**<p>Ertekeles_gep() : megvizsg�lja kapot param�terben szoveg (lap) azt az �rt�ket kapom (g�p)</p>**/
	@Test
	void  Ertekeles_gep() {
		int eredmeny=test.Ertekeles("�sz", "gep");
		int elvaras=11;
		assertEquals(elvaras,eredmeny);
		
	}

}
