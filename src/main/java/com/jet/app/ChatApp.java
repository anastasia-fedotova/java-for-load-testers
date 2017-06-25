package com.jet.app;


import com.acme.edu.App;

public class ChatApp
{
    public static void main(String[] args){
    startChat();
    }

    static void startChat(){
        Server.start();
        Client.start();

    }
}
