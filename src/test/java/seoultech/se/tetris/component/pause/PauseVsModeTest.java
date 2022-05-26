package seoultech.se.tetris.component.pause;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seoultech.se.tetris.component.Board;
import seoultech.se.tetris.component.VSmode;
import seoultech.se.tetris.component.model.DataManager;

import java.awt.event.KeyEvent;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PauseVsModeTest {
    PauseVsMode pauseVsMode;
    @BeforeEach
    void setUp() throws IOException {
        VSmode vSmode = new VSmode(100,200, "NormalMode");
        pauseVsMode = new PauseVsMode(vSmode);
    }

    @Test
    void keyPressed() {
        KeyEvent key = new KeyEvent(pauseVsMode, KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, KeyEvent.VK_LEFT, 'a');
        pauseVsMode.keyPressed(key);
        assertEquals( 1,pauseVsMode.getStatus());

        KeyEvent key2 = new KeyEvent(pauseVsMode, KeyEvent.KEY_PRESSED, System
                .currentTimeMillis(), 0, KeyEvent.VK_RIGHT, 'a');
        pauseVsMode.keyPressed(key2);
        assertEquals(2,pauseVsMode.getStatus());

        pauseVsMode.keyPressed(key);
        assertEquals( 1,pauseVsMode.getStatus());
    }

}