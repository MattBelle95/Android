package com.example.mattbelle.socketapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.Socket;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    public static EditText editText2;
    public static EditText editText3;
    public static Socket socket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
    }


    public void send(View v){
        MessageSender messageSender = new MessageSender();
        messageSender.execute(editText.getText().toString());
    }

    public void connect(View v){
        Connect cn = new Connect();
        cn.execute();
        MyServerThread rx = new MyServerThread();
        rx.execute();
    }


}
