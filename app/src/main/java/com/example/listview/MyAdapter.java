package com.example.listview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter implements ListAdapter {

    private ArrayList<Order.Product> list;
    private Context context;

    public MyAdapter(ArrayList<Order.Product> list, Context context) {
        this.list = list;
        this.context = context;
    }

    // Insert new element in list; The content will be updated automatically
    public void add(Order.Product p){
        Log.w("MyAdapter","add");
        list.add(p);
        notifyDataSetChanged();
    }

    @Override
    public boolean hasStableIds() {
        return super.hasStableIds();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.product_layout,parent, false);
        }
        // Get UI elements
        TextView productName = (TextView) convertView.findViewById(R.id.productName);
        TextView price = (TextView) convertView.findViewById(R.id.price);
        Button btn = (Button) convertView.findViewById(R.id.button);

        // Set the text for TextView
        productName.setText(list.get(position).productName);
        price.setText(list.get(position).price);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Call add method within the class and add new 'product' in list
                add(new Order.Product("Product 4", "dsf"));
                System.out.println("Total elements " + list.size());
                Toast.makeText(context, "Add", Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }



}
