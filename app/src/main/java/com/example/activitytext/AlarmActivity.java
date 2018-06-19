package com.example.activitytext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.Calendar;
import java.util.Set;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;



public class AlarmActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        new AlertDialog.Builder(AlarmActivity.this).
                setTitle("课业提醒").//设置标题
                setMessage("别忘了你还有事情要做哟！").//设置内容
                setPositiveButton("知道了", new OnClickListener(){//设置按钮
            public void onClick(DialogInterface dialog, int which) {
                AlarmActivity.this.finish();//关闭Activity
            }
        }).create().show();

    }
}
