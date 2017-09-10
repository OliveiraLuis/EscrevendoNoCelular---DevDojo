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

}
