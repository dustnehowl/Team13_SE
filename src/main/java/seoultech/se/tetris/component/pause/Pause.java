package seoultech.se.tetris.component.pause;

import seoultech.se.tetris.component.Board;
import seoultech.se.tetris.component.Menu.TetrisMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pause extends JFrame implements KeyListener{
    private static final int BACK = 1;
    private static final int END = 2;
    private static int[] menu = {BACK, END};
    private static int status = 1;
    private static int numMenu = menu.length;

    private JPanel menuPane;
    private JButton backGame, terminate;
    private Board board;

    public Pause(Board board){
        this.board = board;
        this.setSize(board.getWidth(), board.getHeight()/2);
        this.setLocation(board.getX(), board.getHeight()/2 - board.getHeight()/4+board.getY());
        this.setLayout(new GridLayout(3,1,0,0));

        status = 1;
        numMenu = menu.length;
        addMenuPannel();

        this.add(new JPanel());
        this.add(menuPane);


        setTitle("일시정지");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    void addMenuPannel(){
        menuPane = new JPanel(new FlowLayout());

        backGame = new JButton("돌아가기");
        backGame.setFocusPainted(false);
        backGame.setSelected(true);
        terminate = new JButton("게임 종료");
        terminate.setFocusPainted(false);

        backGame.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/3-20));
        terminate.setPreferredSize(new Dimension(this.getWidth()/4,this.getHeight()/3-20));

        backGame.addKeyListener(this);
        terminate.addKeyListener(this);

        menuPane.add(backGame);
        menuPane.add(terminate);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                if (status == BACK) {
                    board.pause();
                    disPose();
                } else if (status == END) {
                    new TetrisMenu(board.getLocation().x, board.getLocation().y);
                    board.dispose();
                    disPose();
                }
                break;
            case KeyEvent.VK_RIGHT:
                if(status < numMenu) {
                    status++; // 2
                    backGame.setSelected(false);
                    terminate.setSelected(true);
                }
                break;
            case KeyEvent.VK_LEFT:
                if(status > 1)
                    status--; //1

                terminate.setSelected(false);
                backGame.setSelected(true);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static int getStatus() {
        return status;
    }

    private void disPose() {
        this.dispose();
    }
}
