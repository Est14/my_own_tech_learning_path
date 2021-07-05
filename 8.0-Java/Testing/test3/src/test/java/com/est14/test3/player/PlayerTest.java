package com.est14.test3.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void looser(){

        // Utilizamos Mokito para simular la clase dice
        Dice dice = Mockito.mock(Dice.class);
        // Indicamos que cuando utilice un metodo de Dice retorne un valor especifico
        Mockito.when(dice.roll()).thenReturn(3);
        Player newPlayer = new Player(dice, 2);
        assertFalse(newPlayer.play());
    }

    @Test
    public void win(){

        // Utilizamos Mokito para simular la clase dice
        Dice dice = Mockito.mock(Dice.class);
        // Indicamos que cuando utilice un metodo de Dice retorne un valor especifico
        Mockito.when(dice.roll()).thenReturn(3);
        Player newPlayer = new Player(dice, 3);
        assertTrue(newPlayer.play());
    }

}