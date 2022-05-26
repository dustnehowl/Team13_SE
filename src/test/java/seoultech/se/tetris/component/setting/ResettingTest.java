package seoultech.se.tetris.component.setting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seoultech.se.tetris.component.Setting;
import seoultech.se.tetris.component.model.DataManager;
import seoultech.se.tetris.component.model.ScoreDataManager;

import static org.junit.jupiter.api.Assertions.*;

class ResettingTest {
    Resetting setting;
    @BeforeEach
    void setUp() {
        setting = new Resetting(100,200);
    }

    @Test
    void resetTest() {
        setting.getReset().doClick();
        assertEquals("normal", DataManager.getInstance().getLevel());
        assertEquals("off", DataManager.getInstance().getColor_weak());
        assertEquals("normal", DataManager.getInstance().getDisplay());
        assertEquals(27, DataManager.getInstance().getPause());

        assertEquals(37, DataManager.getInstance().getLeft());
        assertEquals(39, DataManager.getInstance().getRight());
        assertEquals(32, DataManager.getInstance().getHarddrop());
        assertEquals(38, DataManager.getInstance().getRotate());
        assertEquals(40, DataManager.getInstance().getDown());

        assertEquals(65, DataManager.getInstance().getLeft2());
        assertEquals(68, DataManager.getInstance().getRight2());
        assertEquals(84, DataManager.getInstance().getHarddrop2());
        assertEquals(87, DataManager.getInstance().getRotate2());
        assertEquals(83, DataManager.getInstance().getDown2());
    }
    @Test
    void tableResetTest(){
        setting.getResetTable().doClick();
        String key = ScoreDataManager.getInstance().getNormKey();
        assertEquals(0, ScoreDataManager.getInstance().getObjectData(key).length);
    }

    @Test
    void itemTableResetTest(){
        setting.getResetItemTable().doClick();
        String key = ScoreDataManager.getInstance().getItemKey();
        assertEquals(0, ScoreDataManager.getInstance().getObjectData(key).length);
    }
}