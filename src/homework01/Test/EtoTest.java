package homework01.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import homework01.Eto;

public class EtoTest {

	@Test
	public void testGetEto() {
		assertEquals("申", Eto.getEto(2016));
		assertEquals("酉", Eto.getEto(2017));
		assertEquals("戌", Eto.getEto(2018));
		assertEquals("亥", Eto.getEto(2019));
		assertEquals("子", Eto.getEto(2020));
		assertEquals("丑", Eto.getEto(2021));
		assertEquals("寅", Eto.getEto(2022));
		assertEquals("卯", Eto.getEto(2023));
		assertEquals("辰", Eto.getEto(2024));
		assertEquals("巳", Eto.getEto(2025));
		assertEquals("午", Eto.getEto(2026));
		assertEquals("未", Eto.getEto(2027));

		assertEquals("戌", Eto.getEto(1982));
		assertEquals("亥", Eto.getEto(1983));
		assertEquals("子", Eto.getEto(1984));
		assertEquals("丑", Eto.getEto(1985));
		assertEquals("寅", Eto.getEto(1986));
		assertEquals("卯", Eto.getEto(1987));
		assertEquals("辰", Eto.getEto(1988));
		assertEquals("巳", Eto.getEto(1989));
		assertEquals("午", Eto.getEto(1990));
		assertEquals("未", Eto.getEto(1991));
		assertEquals("申", Eto.getEto(1992));
		assertEquals("酉", Eto.getEto(1993));

		assertEquals("紀元前は計算できません", Eto.getEto(-1));
		assertEquals("紀元前は計算できません", Eto.getEto(0));
		assertEquals("酉", Eto.getEto(1));
	}

}
