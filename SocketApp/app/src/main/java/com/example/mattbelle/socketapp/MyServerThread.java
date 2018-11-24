package com.example.mattbelle.socketapp;

import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Handler;
import java.util.logging.LogRecord;


public class MyServerThread extends AsyncTask<Void,Void,Void>{
    InputStreamReader inputStreamReader;
    BufferedReader bufferedReader;
    String message;

    @Override
    public Void doInBackground(Void... voids){
        try{
            inputStreamReader = new InputStreamReader(MainActivity.socket.getInputStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            while(true){
                message = bufferedReader.readLine();
                MainActivity.editText3.setText(message);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

}
