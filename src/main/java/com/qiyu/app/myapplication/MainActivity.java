package com.qiyu.app.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<MyData> mlist=new ArrayList<>();
    ListView mListView;
    MyAdapter mAdapter;
    //jjjjj
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView= (ListView) findViewById(R.id.listview);
        initData();
        mAdapter=new MyAdapter(MainActivity.this,mlist);
        mListView.setAdapter(mAdapter);
    }

    private void initData() {
        //lllll
        MyData d1 = new MyData("欢欢",0);
        MyData d2 = new MyData("干啥",1);
        MyData d3 = new MyData("上课不好好听课",1);
        MyData d4 = new MyData("你钱掉了",0);
        MyData d5 = new MyData("骗人",1);
        MyData d6 = new MyData("不信，你看看",0);
        MyData d7 = new MyData("看呀",0);
        mlist.add(d1);
        mlist.add(d2);
        mlist.add(d3);
        mlist.add(d4);
        mlist.add(d5);
        mlist.add(d6);
        mlist.add(d7);
    }
}
