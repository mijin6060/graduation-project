package com.example.opencv0702;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class splashActivity extends Activity {
    protected void onCreate(Bundle savedInstandeState){
        super.onCreate(savedInstandeState);
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
