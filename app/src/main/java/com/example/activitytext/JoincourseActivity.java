package com.example.activitytext;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.Date;

public class JoincourseActivity extends AppCompatActivity {

    final String FILE_NAME="timetable.bin";
    private Button write,read;
    private  EditText cname;
    private  EditText date;
    private  EditText tname;
    private  EditText begintime;
    private  EditText endtime;
    private  EditText classname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joincourse);
        Button write=(Button)findViewById(R.id.write);
        final Button read=(Button)findViewById(R.id.read);
        final EditText cname=(EditText)findViewById(R.id.cname);
        final EditText date=(EditText)findViewById(R.id.date);
        final EditText tname=(EditText)findViewById(R.id.tname);
        final EditText begintime=(EditText)findViewById(R.id.begintime);
        final EditText endtime=(EditText)findViewById(R.id.endtime);
        final EditText classname=(EditText)findViewById(R.id.classname);

            }
            private class ButtonListenr implements View.OnClickListener{
        @Override
        public void onClick(View v){
               switch (v.getId()){
                   case R.id.write:
                       String saveInfo=cname.getText().toString().trim();
                       String saveInfo1= date.getText().toString().trim();
                       String saveInfo2=tname.getText().toString().trim();
                       String saveInfo3=begintime.getText().toString().trim();
                       String saveInfo4=endtime.getText().toString().trim();
                       String saveInfo5=classname.getText().toString().trim();

                       FileOutputStream fos;
                       try {
                           fos=openFileOutput("timetable.txt",MODE_PRIVATE);
                           fos.write(saveInfo.getBytes());
                           fos.close();
                       }catch (Exception e){
                           e.printStackTrace();
                       }Toast.makeText(JoincourseActivity.this,"数据保存成功",Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.read:
                       String content="";
                       try{
                           FileInputStream fis=openFileInput("timetable.txt");
                           byte[]buffer=new byte[fis.available()];
                           fis.read(buffer);
                           content=new String(buffer);
                           fis.close();
                       }catch (Exception e){
                           e.printStackTrace();
                       }Toast.makeText(JoincourseActivity.this,"保存的课程信息为"+content,Toast.LENGTH_SHORT).show();
                       break;
                       default:
               }
               if(cname.equals(" ")||tname.equals(" ")||date.equals(" ")
                       ||begintime.equals(" ")||endtime.equals("")||classname.equals(" ")){
                   Toast.makeText(JoincourseActivity.this,"您的课程信息未填写完整",Toast.LENGTH_SHORT).show();
               }
               }


            }

        }


        ;










