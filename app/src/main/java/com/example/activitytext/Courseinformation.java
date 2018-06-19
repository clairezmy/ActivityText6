package com.example.activitytext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

public class Courseinformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courseinformation);
    }
    public class  Course_information implements Serializable{
        private String cname;
        private int date;
        private String tname;
        private String classname;
        private int begintime;
        private int endtime;
        public Course_information(String cname,String tname,String
                                  classname,int date,int begintime,int endtime){
            this.cname=cname;
            this.tname=tname;
            this.classname=classname;
            this.begintime=begintime;
            this.date=date;
            this.endtime=endtime;
        }
        public String getCname(){
            return cname;
        }

        public String getClassname() {
            return classname;
        }

        public String getTname() {
            return tname;
        }

        public int getDate() {
            return date;
        }

        public int getEndtime() {
            return endtime;
        }

        public int getBegintime() {
            return begintime;
        }

        public void setClassname(String classname) {
            this.classname = classname;
        }

        public void setBegintime(int begintime) {
            this.begintime = begintime;
        }

        public void setCname(String cname) {
            this.cname = cname;
        }

        public void setDate(int date) {
            this.date = date;
        }

        public void setEndtime(int endtime) {
            this.endtime = endtime;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

    }
}
