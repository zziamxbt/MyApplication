package com.qiyu.app.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by qiyu on 2016/4/25.
 */
public class MyAdapter extends BaseAdapter {
    public static final int TYPE_COUNT = 2;
    public static final int ACCEPT = 0;
    public static final int SEND = 1;
    List<MyData> mList;
    Context mContext;
    LayoutInflater mInflater;

    public MyAdapter(Context mContext, List<MyData> mList) {
        this.mContext = mContext;
        this.mList = mList;
        mInflater=LayoutInflater.from(mContext);
    }

    @Override
    public int getItemViewType(int position) {
        //返回当前数据行的视图类型
        return mList.get(position).getFlag();
    }

    @Override
    public int getViewTypeCount() {
        //返回视图类型的总数量（PS:聊天有两个视图类型，发送者以及接受者）
        return TYPE_COUNT;
    }

    @Override
    public int getCount() {
        //返回总数据的行数
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        //返回当前是第几行数据
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
  class ViewHolder{
      TextView mTextView;
  }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       ViewHolder viewHolder=null;
        if(convertView==null){
            if(getItemViewType(position)== ACCEPT){
                convertView=mInflater.inflate(R.layout.leftchat,null);

            }else if(getItemViewType(position)== SEND){
                convertView=mInflater.inflate(R.layout.rightchat,null);
            }
            viewHolder=new ViewHolder();
            viewHolder.mTextView= (TextView) convertView.findViewById(R.id.chat);
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        MyData data=mList.get(position);
        viewHolder.mTextView.setText(data.getContent());
        return convertView;
    }
}
