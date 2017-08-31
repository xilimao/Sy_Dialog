package com.example.sxhs.sy_dialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnn = (Button) findViewById(R.id.btnn);
        btnn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ZDialog zDialog = new ZDialog(MainActivity.this);
        zDialog.setTitle("fsdfsdfsd").setContent("rghhhhh")
                .ClickOk(new ZDialog.OnClickOk() {//重写clickOk方法
                    @Override
                    public boolean clickOk() {
                        Log.i("fsdfeeeee","sdsjkbfisbfiusbfuibsfuksb");
                        Toast.makeText(MainActivity.this,"点击了ok",Toast.LENGTH_SHORT).show();
                        return true;
                    }
                }).ClickNo(new ZDialog.OnClickNo() {
            @Override
            public boolean clickNo() {
                Log.i("fsdfeeeee","sdsjkbfisbfiusbfuibsfuksb");
                Toast.makeText(MainActivity.this,"点击了no",Toast.LENGTH_SHORT).show();
                return true;
            }
        }).show();
    }
}
