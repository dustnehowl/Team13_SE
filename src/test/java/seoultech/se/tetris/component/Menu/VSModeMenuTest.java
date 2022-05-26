package seoultech.se.tetris.component.Menu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seoultech.se.tetris.component.VSModeMenu;
import seoultech.se.tetris.component.endGame.EndGame;
import seoultech.se.tetris.component.model.DataManager;

import static org.junit.jupiter.api.Assertions.*;

class VSModeMenuTest {

    @Test
    @DisplayName("VSModeMenuTest")
    void testEndGame() {
        new VSModeMenu(100,200);
    }

}