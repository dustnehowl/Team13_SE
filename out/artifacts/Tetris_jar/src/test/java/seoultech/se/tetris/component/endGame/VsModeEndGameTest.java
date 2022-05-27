package seoultech.se.tetris.component.endGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seoultech.se.tetris.component.model.DataManager;

import static org.junit.jupiter.api.Assertions.*;

class VsModeEndGameTest {

    @Test
    @DisplayName("EndGameTest")
    void testVSModeEndGame() {
        new VsModeEndGame(100,200, "Player1", "ItemMode");
    }

}