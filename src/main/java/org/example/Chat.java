package org.example;

import javax.swing.*;
//https://habr.com/ru/articles/82730/

//– Создать окно клиента чата. Окно должно содержать JtextField для ввода логина, пароля, IP-адреса сервера, порта подключения к серверу, область ввода
//        сообщений, JTextArea область просмотра сообщений чата и JButton подключения к серверу и отправки сообщения в чат. Желательно сразу сгруппировать
//        компоненты, относящиеся к серверу сгруппировать на JPanel сверху экрана, а
//        компоненты, относящиеся к отправке сообщения – на JPanel снизу.
public class Chat extends JFrame {
  JTextField loginField = new JTextField("Введите логин : ");
    JTextField passwordField = new JTextField("Введите пароль : ");
    JTextField serverField = new JTextField("Введите IP сервера и порт для подключения: ");

    JButton buttonConnect = new JButton("Подключиться");
//    ChatWindow(){
//
//    }
}
