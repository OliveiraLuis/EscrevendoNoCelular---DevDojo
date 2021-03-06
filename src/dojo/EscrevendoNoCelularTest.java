package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class EscrevendoNoCelularTest {

	@Test
	public void testTecla2UmaVez() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("2");
		assertEquals("A", resultadoTeste);

	}
	@Test
	public void testTecla2DuasVezes() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("22");
		assertEquals("B", resultadoTeste);

	}
	@Test
	public void testTecla2TresVezes() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("222");
		assertEquals("C", resultadoTeste);

	}
	@Test
	public void testTecla2QuatroVezes() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("2222");
		assertEquals("CA", resultadoTeste);

	} 
	@Test
	public void testTecla2CincoVezes() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("22222");
		assertEquals("CB", resultadoTeste);

	} 
	@Test
	public void testTecla2SeisVezes() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("222222");
		assertEquals("CC", resultadoTeste);

	}
	@Test
	public void testTecla2NoveVezes() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("222222222");
		assertEquals("CCC", resultadoTeste);

	} 
	@Test
	public void testTecla3UmaVez() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("3");
		assertEquals("D", resultadoTeste);

	}
	@Test
	public void testTecla3NoveVezes() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("333333333");
		assertEquals("FFF", resultadoTeste);

	}
	@Test
	public void testCombinacao23() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("23");
		assertEquals("AD", resultadoTeste);

	} 
	@Test
	public void testCombinacao2333() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("2333");
		assertEquals("AF", resultadoTeste);

	}
	@Test
	public void testCombinacao23456789() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("23456789");
		assertEquals("ADGJMPTW", resultadoTeste);

	}
	@Test
	public void testCombinacao203304440507777() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("203304440507777");
		assertEquals("A E I J S", resultadoTeste);

	}

}
