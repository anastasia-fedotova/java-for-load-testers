/**
 * Класс для реализации клиентской части чата
 *  @autor Fedotova Anastasia
 */
package com.jet.app;


class Client {

    static void start(){
        /**
         *  Выбор действия для клиента
         */
        System.out.println("Welcome, Client!");
        System.out.println("Choose:");
        System.out.println("1: Send message");
        System.out.println("2: Receive Message");

        int chooseCommandClient = 1;
        switch(chooseCommandClient) {
            case 1:
                System.out.println("Enter message");
                sendMessage(" ");
                break;
            case 2:
                System.out.println("Get messages");
                receiveMessage(" ");
                break;
        }
    }


    private static void sendMessage(String sendMessageClient){
        Server.commands();
    }

    private static void receiveMessage(String receiveMessageClient){

    }

}