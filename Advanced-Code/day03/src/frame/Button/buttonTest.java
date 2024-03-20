package frame.Button;

import javax.swing.*;

public class buttonTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);//取消窗体默认布局
        JButton bto = new JButton("点我啊");
        bto.setBounds(50,50,100,100);
        frame.getContentPane().add(bto);//添加窗体布局
        frame.setVisible(true);

    }
}
