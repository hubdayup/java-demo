package frame;

import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("这个是大哥的第一个窗体");
        frame.setVisible(true);
    }
}
