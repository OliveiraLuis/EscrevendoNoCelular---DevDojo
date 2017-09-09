package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class EscrevendoNoCelularTest {

	@Test
	public void testTecla2UmaVez() {
		String resultadoTeste = EscrevendoNoCelular.numeroParaLertra("2");
		assertEquals("A", resultadoTeste);

	}

}
