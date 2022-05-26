package seoultech.se.tetris.component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seoultech.se.tetris.blocks.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class BoardTests {

    Board board;

    @BeforeEach
    void setUp() throws IOException {
        board = new Board(100,100,"normalScore");
    }

    @Test
    @DisplayName(("설정이 easy인 경우"))
    void getRandomBlock1() throws IOException {
        int[] cnt = new int[7];
        board.setLev_block(72);
        for(int i=0; i<70000; i++){
            Block rand_block = board.getRandomblock();
            if(rand_block instanceof IBlock) cnt[0]++;
            if(rand_block instanceof JBlock) cnt[1]++;
            if(rand_block instanceof SBlock) cnt[2]++;
            if(rand_block instanceof LBlock) cnt[3]++;
            if(rand_block instanceof OBlock) cnt[4]++;
            if(rand_block instanceof ZBlock) cnt[5]++;
            if(rand_block instanceof TBlock) cnt[6]++;

        }
        int iBlockCnt = cnt[0];
        assertTrue(cnt[1] * 1.15 <= iBlockCnt);
        assertTrue(cnt[2] * 1.15 <= iBlockCnt);
        assertTrue(cnt[3] * 1.15 <= iBlockCnt);
        assertTrue(cnt[4] * 1.15 <= iBlockCnt);
        assertTrue(cnt[5] * 1.15 <= iBlockCnt);
        assertTrue(cnt[6] * 1.15 <= iBlockCnt);
    }

    @Test
    @DisplayName("설정이 normal인 경우")
    void getRandomBlock2() throws IOException {
        int[] cnt = new int[7];
        board.setLev_block(70);
        for(int i=0; i<70000; i++){
            Block rand_block = board.getRandomblock();
            if(rand_block instanceof IBlock) cnt[0]++;
            if(rand_block instanceof JBlock) cnt[1]++;
            if(rand_block instanceof SBlock) cnt[2]++;
            if(rand_block instanceof LBlock) cnt[3]++;
            if(rand_block instanceof OBlock) cnt[4]++;
            if(rand_block instanceof ZBlock) cnt[5]++;
            if(rand_block instanceof TBlock) cnt[6]++;

        }
        int iBlockCnt = cnt[0];
        assertTrue(cnt[1] <= 10500);
        assertTrue(cnt[2] <= 10500);
        assertTrue(cnt[3] <= 10500);
        assertTrue(cnt[4] <= 10500);
        assertTrue(cnt[5] <= 10500);
        assertTrue(cnt[6] <= 10500);

    }

    @Test
    @DisplayName("설정이 hard인 경우")
    void getRandomBlock3() throws IOException {
        int[] cnt = new int[7];
        board.setLev_block(68);
        for(int i=0; i<70000; i++){
            Block rand_block = board.getRandomblock();
            if(rand_block instanceof IBlock) cnt[0]++;
            if(rand_block instanceof JBlock) cnt[1]++;
            if(rand_block instanceof SBlock) cnt[2]++;
            if(rand_block instanceof LBlock) cnt[3]++;
            if(rand_block instanceof OBlock) cnt[4]++;
            if(rand_block instanceof ZBlock) cnt[5]++;
            if(rand_block instanceof TBlock) cnt[6]++;

        }
        int iBlockCnt = cnt[0];
        assertTrue(cnt[1] >= iBlockCnt* 1.15);
        assertTrue(cnt[2] >= iBlockCnt * 1.15);
        assertTrue(cnt[3] >= iBlockCnt * 1.15);
        assertTrue(cnt[4] >= iBlockCnt * 1.15);
        assertTrue(cnt[5] >= iBlockCnt * 1.15);
        assertTrue(cnt[6] >= iBlockCnt * 1.15);
    }
}