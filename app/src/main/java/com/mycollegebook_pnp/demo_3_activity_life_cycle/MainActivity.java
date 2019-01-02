package com.mycollegebook_pnp.demo_3_activity_life_cycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");
       Toast.makeText(getApplicationContext(),String.valueOf("onCreate invoked"),Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart invoked");
       Toast.makeText(getApplicationContext(),String.valueOf("onStart invoked"),Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
      Toast.makeText(getApplicationContext(),String.valueOf("onResume invoked"),Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause invoked");
        Toast.makeText(getApplicationContext(),String.valueOf("onPause invoked"),Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop invoked");
       Toast.makeText(getApplicationContext(),String.valueOf("onStop invoked"),Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
       Toast.makeText(getApplicationContext(),String.valueOf("onRestart invoked"),Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
        Toast.makeText(getApplicationContext(),String.valueOf("onDestroy invoked"),Toast.LENGTH_LONG).show();

    }
}