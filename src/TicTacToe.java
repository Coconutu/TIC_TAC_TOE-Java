import javax.swing.*;
import java.awt.*;

//https://www.youtube.com/watch?v=Nc77ymnm8Ss 5:16

public class TicTacToe {
    int boardWidth=600;
    int boardHeight=650; //50 px for thenext panel on top

    JFrame frame=new JFrame();
    TicTacToe () {
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }

}
