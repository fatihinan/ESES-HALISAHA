package com.example.eseshalisaha;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter{

		private LayoutInflater m_inflater;
	    private List<Halisahalar> halisahalar_listesi;
	 
	    public ListViewAdapter(Activity activity, List<Halisahalar> halisahalar) {
	        
	        m_inflater = (LayoutInflater) activity.getSystemService(
	                Context.LAYOUT_INFLATER_SERVICE);
	                halisahalar_listesi = halisahalar;
	    }
	 
	    @Override
	    public int getCount() {
	        return halisahalar_listesi.size();
	    }
	 
	    @Override
	    public Halisahalar getItem(int position) {
	        return halisahalar_listesi.get(position);
	    }
	 
	    @Override
	    public long getItemId(int position) {
	        return position;
	    }
	 
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			View satirView;
	        satirView = m_inflater.inflate(R.layout.satir_layout, null);
	        TextView textView = (TextView) satirView.findViewById(R.id.isim); 
	        ImageView imageView = (ImageView) satirView.findViewById(R.id.simge);
	        Halisahalar saha = halisahalar_listesi.get(position);
	 
	        textView.setText(saha.getIsim());
	 
	        
	        if (saha.getSimge()=="demirspor") {
	            imageView.setImageResource(R.drawable.demirspor);
	        }
	        
	        return satirView;
		}
	}

