package rft_8_het_black_jack;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * <h1>BlackJack játék</h1>
	 * <h2>Szerzõk:</h2>
	 * <ul>
	 * 		<li>A játékot készítette: Fodor Balázs</li>
	 * 		<li>Az egységtesztet készítette: Fodor Balázs</li>
	 * 		<li>Dokumnetációval ellátta: Mocsári Richárd</li>
	 * </ul>
	 * @version 1.0
	 * @author Fodor Balázs, Mocsári Richárd

**/
class black_jack_test {
	Main_game test=new Main_game();
	/**<h1>Testek</h1>
	/**<p>LapAdd(): megvizsgálja számot kapok</p>**/
	@Test
	void LapAdd() {
		Integer test=this.test.LapAdd();
		Integer x=1;
		String eredmeny=test.getClass().getName();
		String elvaras=x.getClass().getName();
		assertEquals(elvaras,eredmeny);
		
	}
	
	/**<p>LapKap(): megvizsgálja szöveget kapok</p>**/
	@Test
	void  LapKap() {
		String eredmeny=test.LapKap(5);
		String elvaras="a";
		assertEquals(elvaras.getClass().getName(),eredmeny.getClass().getName());
		
	}
	/**<p>Dontes_i(): megvizsgálja szöveget kapok</p>**/
	@Test
	void Dontes_i() {
		String eredmeny=test.Dontes("i").getClass().getName();
		String elvaras="a".getClass().getName();
		assertEquals(elvaras,eredmeny);
	}
	/**<p>Dontes_n(): megvizsgálja 0 kapok</p>**/
	@Test
	void Dontes_n() {
		String eredmeny=test.Dontes("n");
		String elvaras="0";
		assertEquals(elvaras,eredmeny);
	}
	/**<p>Dontes_hibas(): megvizsgálja 0 kapok</p>**/
	@Test
	void Dontes_hibas() {
		String eredmeny=test.Dontes("1");
		String elvaras="0";
		assertEquals(elvaras,eredmeny);
	}
	/**<p>Ertekeles_player() : megvizsgálja kapot paraméterben szoveg (lap) azt az értéket kapom (felhasználó)</p>**/
	@Test
	void  Ertekeles_player() {
		int eredmeny=test.Ertekeles("Dráma", "player");
		int elvaras=10;
		assertEquals(elvaras,eredmeny);
		
	}
	/**<p>Ertekeles_gep() : megvizsgálja kapot paraméterben szoveg (lap) azt az értéket kapom (gép)</p>**/
	@Test
	void  Ertekeles_gep() {
		int eredmeny=test.Ertekeles("Ász", "gep");
		int elvaras=11;
		assertEquals(elvaras,eredmeny);
		
	}

}
