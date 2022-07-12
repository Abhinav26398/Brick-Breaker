package brickBreaker;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame obj=new JFrame();
        GamePlay gameplay=new GamePlay();
        obj.setBounds(10,10,710,600);
        obj.setTitle("Breackout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }
}
