package com.example.guojian.zhuhuribao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DailyDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_detail);
        Intent mIntent = getIntent();
        int newId = mIntent.getIntExtra("newsId",0);
        TextView textView = (TextView)findViewById(R.id.news_id);
        textView.setText(""+newId);
    }
}
