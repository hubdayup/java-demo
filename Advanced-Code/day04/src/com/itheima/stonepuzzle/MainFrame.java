package com.itheima.stonepuzzle;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener {

    //此方法用于初始化窗体

    int[][] data = {{1, 2, 3, 4}
            , {5, 6, 7, 8}
            , {9, 10, 11, 12}
            , {13, 14, 15, 0}};
    int[][] win = {{1, 2, 3, 4}
            , {5, 6, 7, 8}
            , {9, 10, 11, 12}
            , {13, 14, 15, 0}};

    public void initFrame() {


        setSize(514, 595);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("石头迷阵单机版v1.0");
        setAlwaysOnTop(true);// 设置窗体置顶
        setLocationRelativeTo(null);//设置窗体居中

        //设置窗体可见

    }

    public MainFrame() {
        this.addKeyListener(this);
        initFrame();//创建窗体
        initData();//打乱石头迷阵
        paintView();//绘制游戏界面

        setVisible(true);
    }


    public void paintView() {
        getContentPane().removeAll();
        if(victory()){
            JLabel winable = new JLabel(new ImageIcon("E:\\image\\win.png"));
            winable.setBounds(124,230,266,88);
            getContentPane().add(winable);
        }
        JButton btn = new JButton(" 重新游戏");
        btn.setBounds(350,20,100,20);
        getContentPane().add(btn);
        btn.setFocusable(false);

        btn.addActionListener(e -> {
            count = 0;
            initData();
            paintView();
        });
        JLabel scoreLabe = new JLabel("步数为："+count);
        scoreLabe.setBounds(50,20,100,20);
        getContentPane().add(scoreLabe);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jl1 = new JLabel(new ImageIcon("E:\\image\\" + data[i][j] + ".png"));
                jl1.setBounds(50 + 100 * j, 90 + 100 * i, 100, 100);
                getContentPane().add(jl1);//继承于Frame类，且子类没有重写过该方法，可以省略super
            }

        }
        JLabel background = new JLabel(new ImageIcon("E:\\image\\background.png"));
        background.setBounds(26, 30, 450, 484);
        getContentPane().add(background);
        getContentPane().repaint();
    }
    int row;//0号元素横坐标
    int column;//0号元素纵坐标
    int count;//统计步数变量
    public void initData() {
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                int randomX = r.nextInt(4);
                int randomY = r.nextInt(4);
                int temp = data[i][j];
                data[i][j] = data[randomX][randomY];
                data[randomX][randomY] = temp;

            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if(data[i][j]==0){
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(row);
        System.out.println(column);
    } //打乱石头迷阵


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        move(keyCode);
        //每次移动后都刷新界面
        paintView();
    }
/**此方法处理移动业务*/
    private  void move(int keyCode) {
        if(victory()){
            return;
        }
        if (keyCode == 37) {//左上右下移动
            if(column==3){
                return;
            }
            int temp = data[row][column];
              data[row][column] = data[row][column+1];
            data[row][column+1] = temp;
        column++;
        count++;}
            else if (keyCode == 38) {
                if(row==3){
                    return;
                }
                int temp = data[row][column];
                        data[row][column] = data[row+1][column];
                        data[row+1][column] = temp;
                        row++;
                        count++;
                    }
               else if (keyCode == 39) {
                   if(column==0){
                       return;
                   }
                    int temp = data[row][column];
               data[row][column] = data[row][column-1];
               data[row][column-1] = temp;
               column--;
               count++;}
                  else   if (keyCode == 40) {
                      if(row==0){
                          return;
                      }
                        int temp = data[row][column];
                        data[row][column] = data[row-1][column];
                        data[row-1][column] = temp;
                        row--;
                        count++;
                    }
                  else if(keyCode ==90){
                      data = new int[][]{{1, 2, 3, 4}
                              , {5, 6, 7, 8}
                              , {9, 10, 11, 12}
                              , {13, 14, 15, 0}

            };
        }
    }
    public boolean victory(){



        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if(data[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return true;

    }

    @Override
                public void keyReleased (KeyEvent e){

                }
            }
