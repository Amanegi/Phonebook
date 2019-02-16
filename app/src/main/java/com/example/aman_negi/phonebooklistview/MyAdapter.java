package com.example.aman_negi.phonebooklistview;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aman_Negi on 04-02-2018.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<RowLayout> rowLayoutArrayList;
    private LayoutInflater inflater;


    public MyAdapter(Context context, ArrayList<RowLayout> rowLayoutArrayList) {
        this.context = context;
        this.rowLayoutArrayList = rowLayoutArrayList;
    }

    @Override
    public int getCount() {
        return rowLayoutArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return rowLayoutArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.row_layout, parent, false);

        //Getting all views of singlerow
        ImageView imageView = (ImageView) view.findViewById(R.id.contactImage);
        TextView txtName = (TextView) view.findViewById(R.id.contactName);
        TextView txtNum = (TextView) view.findViewById(R.id.contactNumber);

        RowLayout r = rowLayoutArrayList.get(position);
        int img = r.getImage();
        String cname = r.getName();
        String cnum = r.getNumber();

        //Set data to the views
        imageView.setImageResource(img);
        txtName.setText(cname);
        txtNum.setText(cnum);

        return view;
    }
}
