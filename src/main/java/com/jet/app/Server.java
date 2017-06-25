/**
 * Класс для реализации серверной части чата
 *  @autor Fedotova Anastasia
 */
package com.jet.app;

class Server {

    static void start(){
        /**
         *  Выбор действия для сервера
         */
        System.out.println("Welcome, Server!");
        System.out.println("Choose:");
        System.out.println("1: Send message");
        System.out.println("2: Receive Message");
        System.out.println("3: History Chat");
        System.out.println("4: Analise Chat");
        System.out.println("5: Log Chat");

        int chooseCommandServer=1;
        switch(chooseCommandServer) {
            case 1:
                System.out.println("Enter message");
                sendMessage(" ");
                break;
            case 2:
                System.out.println("Get messages");
                receiveMessage(" ");
                break;
            case 3:
                System.out.println("History Chat");
                getAllMesseges();
                break;
            case 4:
                System.out.println("Analise Chat");
                countMessage();
                break;
            case 5:
                System.out.println("Log Chat");
                logChat();
                break;
        }
    }

    private static void sendMessage(String sendMessageServer){

    }

    private static void receiveMessage(String receiveMessageServer){

    }

    private static void getAllMesseges(){

    }

    private static void countMessage(){

    }

    private static void logChat(){

    }

    static void commands(){

    }
}