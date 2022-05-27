package seoultech.se.tetris.component.setting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seoultech.se.tetris.component.model.DataManager;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ColorWeakSettingTest {
    ColorWeakSetting colorWeakSetting;
    @BeforeEach
    void setUp() throws IOException {
        colorWeakSetting = new ColorWeakSetting(100,200);
    }

    @Test
    void onPressed(){
        colorWeakSetting.getOn().doClick();
        String lv = DataManager.getInstance().getColor_weak();
        assertEquals( "on",lv);
    }
    @Test
    void offPressed(){
        colorWeakSetting.getOff().doClick();
        String lv = DataManager.getInstance().getColor_weak();
        assertEquals( "off",lv);
    }

}