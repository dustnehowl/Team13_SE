package seoultech.se.tetris.component.pause;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seoultech.se.tetris.component.Board;
import seoultech.se.tetris.component.model.DataManager;

import java.awt.event.KeyEvent;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PauseTest {

    Pause pause;

    @BeforeEach
    void setUp() throws IOException {
        Board board = new Board(100,200,DataManager.getInstance().getMode());
        pause = new Pause(board);
    }

    @Test
    void keyPressed() {
        KeyEvent key = new KeyEvent(pause, KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, KeyEvent.VK_LEFT, 'a');
        pause.keyPressed(key);
        assertEquals( 1,pause.getStatus());

        KeyEvent key2 = new KeyEvent(pause, KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, KeyEvent.VK_RIGHT, 'a');
        pause.keyPressed(key2);
        assertEquals(2,pause.getStatus());

        pause.keyPressed(key);
        assertEquals( 1,pause.getStatus());
    }
}