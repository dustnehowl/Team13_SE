package seoultech.se.tetris.component.setting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seoultech.se.tetris.component.model.DataManager;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DisplaySettingTest {
    DisplaySetting displaySetting;
    @BeforeEach
    void setUp() throws IOException {
        displaySetting = new DisplaySetting(100,200);
    }

    @Test
    void smallPressed(){
        displaySetting.getSmall().doClick();
        String lv = DataManager.getInstance().getDisplay();
        assertEquals( "small",lv);
    }
    @Test
    void normalPressed(){
        displaySetting.getNormal().doClick();
        String lv = DataManager.getInstance().getDisplay();
        assertEquals( "normal",lv);
    }
    @Test
    void bigPressed(){
        displaySetting.getBig().doClick();
        String lv = DataManager.getInstance().getDisplay();
        assertEquals( "big",lv);
    }

}