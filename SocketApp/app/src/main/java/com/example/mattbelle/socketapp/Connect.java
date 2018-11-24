package com.example.mattbelle.socketapp;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Matt Belle on 11/24/2018.
 */

public class Connect extends AsyncTask<Void,Void,Void> {



    @Override
    protected Void doInBackground(Void... string){

        try {
            MainActivity.socket = new Socket("192.168.1.30",8888);
            if (MainActivity.socket.isConnected())
                MainActivity.editText2.setText("Connected!!");
            else
                MainActivity.editText2.setText("Disconnected!!");

        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}
