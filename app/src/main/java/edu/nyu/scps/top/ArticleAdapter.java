package edu.nyu.scps.top;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ArticleAdapter extends BaseAdapter {
    private Context context;
    String[] title;
    String[] abs;
    Bitmap[] bitmap;

    public ArticleAdapter(Context context, String[] title, String[] abs, Bitmap[] bitmap) {
        this.context = context;
        this.title = title;
        this.abs = abs;
        this.bitmap = bitmap;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout linearLayout;
        if (convertView != null) {
            linearLayout = (LinearLayout)convertView;
        } else {
            LayoutInflater inflater = LayoutInflater.from(context);
            linearLayout = (LinearLayout)inflater.inflate(R.layout.article, null);
        }
        ImageView imageView = (ImageView)linearLayout.findViewById(R.id.imageView);
        if (bitmap[position] != null) {
            imageView.setImageBitmap(bitmap[position]);
        }
        TextView textView = (TextView)linearLayout.findViewById(R.id.textView);
        textView.setText(title[position]);
        /*
        TextView text2 = (TextView)linearLayout.findViewById(android.R.id.text2);
        text2.setText(abs[position]);
        */
        return linearLayout;
    }
}
