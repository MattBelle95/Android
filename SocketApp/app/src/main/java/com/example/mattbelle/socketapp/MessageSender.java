package com.example.mattbelle.socketapp;

import android.os.AsyncTask;
import java.io.DataOutputStream;
import java.io.IOException;
import  java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Matt Belle on 11/24/2018.
 */

public class MessageSender extends AsyncTask<String,Void,Void> {

    PrintWriter printWriter;

    @Override
    protected Void doInBackground(String... string){

        String message = string[0];

        try {
            printWriter = new PrintWriter(MainActivity.socket.getOutputStream());
            printWriter.write(message);
            printWriter.flush();
            //printWriter.close();

        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}
