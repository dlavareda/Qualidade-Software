import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dlavareda
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	preencheLista();
	}
    
	public static void  preencheLista() {
    	ArrayList<Pergunta> Lista = new ArrayList();
		Pergunta P1 = new Pergunta();
        Pergunta P2 = new Pergunta();
        Pergunta P3 = new Pergunta();
        P1.setTexto("Pergunta 1");
        P1.setValor(1);
        P2.setTexto("Pergunta 2");
        P2.setValor(2);
        P3.setTexto("Pergunta 3");
        P3.setValor(3);
		assertTrue("Verifica se a lista esta vazia", Lista.isEmpty());
		 Lista.add(P1);
		 assertEquals("Verifica se a lista tem tamanho 1", 1, Lista.size());
		 Lista.add(P2);
		 Lista.add(P3);
		 assertTrue("Verifica se a lista não esta vazia", Lista.isEmpty());
		 System.out.print(Lista);
	}
@Test
public void teste() {
	preencheLista();
}
}
