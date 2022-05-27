package seoultech.se.tetris.component.Menu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seoultech.se.tetris.component.endGame.EndGame;
import seoultech.se.tetris.component.model.DataManager;

import java.awt.event.KeyEvent;

import static org.junit.jupiter.api.Assertions.*;

class TetrisMenuTest {
    TetrisMenu tetrisMenu;
    @Test
    @DisplayName("TetrisMenuTest")
    void testEndGame() {
        tetrisMenu = new TetrisMenu(100,200);
        KeyEvent key = new KeyEvent(tetrisMenu, KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, KeyEvent.VK_DOWN, 'a');
        tetrisMenu.keyPressed(key);

        assertEquals(tetrisMenu.getMenuNum() , 1);

        tetrisMenu.keyPressed(key);
        assertEquals(tetrisMenu.getMenuNum() , 2);

        tetrisMenu.keyPressed(key);
        assertEquals(tetrisMenu.getMenuNum() , 3);

        tetrisMenu.keyPressed(key);
        assertEquals(tetrisMenu.getMenuNum() , 4);

        tetrisMenu.keyPressed(key);
        assertEquals(tetrisMenu.getMenuNum() , 5);

        tetrisMenu.keyPressed(key);
        assertEquals(tetrisMenu.getMenuNum() , 0);

        KeyEvent key2 = new KeyEvent(tetrisMenu, KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, KeyEvent.VK_UP, 'a');
        tetrisMenu.keyPressed(key2);
        assertEquals(tetrisMenu.getMenuNum() , 5);

    }

}