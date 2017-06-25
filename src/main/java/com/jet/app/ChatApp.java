/**
 * Класс для запуска чата
 *  @autor Fedotova Anastasia
 */
package com.jet.app;

class ChatApp {


    public static void main(String[] args){

        startChat();

    }

    private static void startChat(){
        Server.start();
        Client.start();
    }
}

