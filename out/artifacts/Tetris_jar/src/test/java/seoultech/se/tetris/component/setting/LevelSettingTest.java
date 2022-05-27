package seoultech.se.tetris.component.setting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seoultech.se.tetris.component.VSmode;
import seoultech.se.tetris.component.model.DataManager;
import seoultech.se.tetris.component.pause.PauseVsMode;

import java.awt.event.KeyEvent;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class LevelSettingTest {
    LevelSetting levelSetting;
    @BeforeEach
    void setUp() throws IOException {
        levelSetting = new LevelSetting(100,200);
    }

    @Test
    void easyPressed(){
        levelSetting.getEasy().doClick();
        String lv = DataManager.getInstance().getLevel();
        assertEquals( "easy",lv);
    }
    @Test
    void normalPressed(){
        levelSetting.getNormal().doClick();
        String lv = DataManager.getInstance().getLevel();
        assertEquals( "normal",lv);
    }
    @Test
    void hardPressed(){
        levelSetting.getHard().doClick();
        String lv = DataManager.getInstance().getLevel();
        assertEquals( "hard",lv);
    }
}