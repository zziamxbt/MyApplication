package com.qiyu.app.myapplication;

import java.io.Serializable;

/**
 * Created by qiyu on 2016/4/25.
 */
public class MyData implements Serializable {
    private  String content;//聊天内容
    private int flag;//标志位，0：接受message，1：发生message

    public MyData(String content, int flag) {
        this.content = content;
        this.flag = flag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
