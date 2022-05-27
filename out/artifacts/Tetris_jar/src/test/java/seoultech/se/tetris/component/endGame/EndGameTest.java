package seoultech.se.tetris.component.endGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seoultech.se.tetris.component.model.DataManager;

import static org.junit.jupiter.api.Assertions.*;

class EndGameTest {

    @Test
    @DisplayName("EndGameTest")
    void testEndGame() {
        new EndGame(100,200, 20,DataManager.getInstance().getMode());
    }

}