package org.example;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame{
    private  static  final  int WINDOW_HEIGHT = 555;
    private  static  final  int WINDOW_WIDTH = 507;
    private  static  final  int WINDOW_POSX = 300;
    private  static  final  int WINDOW_POSY = 100;
    String WINDOW_NAME = "Игра в крестики-нолики";
    SettingsWindow settings;
    Map map;
   
//    Первое задание – добавить на экран компоновщик-сетку с одним столбцом и добавить над существующей кнопкой следующие компоненты в заданном порядке: JLabel с заголовком «Выберите режим игры», сгруппированные в ButtonGroup
//    переключаемые JRadioButton с указанием режимов «Человек против компьютера» и «Человек против человека», JLabel с заголовком «Выберите размеры
//    поля», JLabel с заголовком «Установленный размер поля:», JSlider со значениями 3..10, JLabel с заголовком «Выберите длину для победы», JLabel с заголовком «Установленная длина:», JSlider со значениями 3..10.
    GameWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX,WINDOW_POSY);
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setTitle(WINDOW_NAME);
        setResizable(false);

        settings = new SettingsWindow(this);
        map = new Map(settings.sliderSizeValue, settings.sliderSizeValue);
        JButton btnStart = new JButton("New Game");
        JButton btnExit = new JButton("Exit");
        JPanel controPanel = new JPanel(new GridLayout(1,2));
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });
        controPanel.add(btnStart);
        controPanel.add(btnExit);
        add(controPanel,BorderLayout.SOUTH);
        add(map);
        map.setVisible(false);
        setVisible(true);

    }

    void startNewGame(boolean mode, int fSzX,int fSzY, int wLen){
        map.setVisible(true);
        map.startNewGame(mode,fSzX,fSzY, wLen);
    //    repaint();
//        github.com:eliivanov66/java_practice.git
       // https://github.com/eliivanov66/java_practice/tree/main/java_development_kit/lection_1
    }

}
