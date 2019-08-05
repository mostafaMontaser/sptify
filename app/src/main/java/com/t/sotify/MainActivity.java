package com.t.sotify;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.prefs.Preferences;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences= getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("username","mostafa");
        editor.commit();

        SharedPreferences sharedPreferences1=getPreferences(MODE_PRIVATE);
        String s=sharedPreferences1.getString("username","not Found") ;
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
    }
}
