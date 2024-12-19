package business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SportvereinTest {
	
	Sportverein sportverein;
	String[] sportarten = {"Dressur",  "Springreiten" };
	
	@BeforeEach
	void setUp() throws Exception {
		
		
		this.sportverein = new Sportverein("Reitclub", 23, 35, "Essen", sportarten);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		assertTrue(this.sportverein.getName().equals("Reitclub"), "Sportverein Name wird nicht richtig gesetzt");
		assertEquals(this.sportverein.getAnzahlEhemaligerMitglieder(), 23.0, "Sportverein AnzahlEhemaliger nicht richtig gesetzt");
		assertEquals(this.sportverein.getAnzahlMitglieder(), 35.0, "Sportverein Anzahl Mitglieder nicht richtig gesetzt");
		assertTrue(this.sportverein.getOrt().equals("Essen"), "Sportverein Name wird nicht richtig gesetzt");
		assertArrayEquals(this.sportverein.getSportarten().toArray(), this.sportarten, "Sportverein Array wird nciht richtig gesetzt");
		
		
		Throwable exc = assertThrows(Exception.class, () -> new Sportverein("Reitclub", 23, 35, "Essen", null));


		
		//fail("Not yet implemented");
	}

}
