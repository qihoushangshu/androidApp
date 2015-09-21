package com.example.xiaodong.androidapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.xiaodong.androidapp.MESSAGE";
    //xnm的按钮事件调本方法
    public void sendMessage(View view){
        //从当前窗口跳转到DisplayMessageActivity
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        //获取文本框的id
        EditText editText = (EditText)findViewById(R.id.edit_message);
        //获取文本框内容
        String message = editText.getText().toString();
        //向另一个窗口传值
        intent.putExtra(EXTRA_MESSAGE,message);
        //启动跳转
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
