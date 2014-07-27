package com.example.eseshalisaha;

import java.io.ByteArrayInputStream;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter{

		private LayoutInflater m_inflater;
	    private List<Halisaha> halisahalar_listesi;
	 
	    public ListViewAdapter(Activity activity, List<Halisaha> halisahalar) {
	        
	        m_inflater = (LayoutInflater) activity.getSystemService(
	                Context.LAYOUT_INFLATER_SERVICE);
	                halisahalar_listesi = halisahalar;
	    }
	 
	    @Override
	    public int getCount() {
	        return halisahalar_listesi.size();
	    }
	 
	    @Override
	    public Halisaha getItem(int position) {
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
	        Halisaha saha = halisahalar_listesi.get(position);
	 
	        textView.setText(saha.IsimGetir());
	        if(saha.IdGetir()==1)
	        	imageView.setImageResource(R.drawable.demirspor);
	        else if(saha.IdGetir()==2)
	        	imageView.setImageResource(R.drawable.ataturkmesleklisesi);
	        else if(saha.IdGetir()==3)
	        	imageView.setImageResource(R.drawable.esplanetpark);
	        else if(saha.IdGetir()==4)
	        	imageView.setImageResource(R.drawable.fethiheperhalisaha);
	        else if(saha.IdGetir()==6)
			    imageView.setImageResource(R.drawable.esbay);
	        else if(saha.IdGetir()==9)
			    imageView.setImageResource(R.drawable.sportmen);
	        else if(saha.IdGetir()==10)
			    imageView.setImageResource(R.drawable.cavusoglu);
	        else if(saha.IdGetir()==13)
			    imageView.setImageResource(R.drawable.sekersporeses);
	        else if(saha.IdGetir()==15)
			    imageView.setImageResource(R.drawable.galipturkanhalisahasi);
	        else if(saha.IdGetir()==16)
			    imageView.setImageResource(R.drawable.eseshalisaha);
	        else if(saha.IdGetir()==18)
			    imageView.setImageResource(R.drawable.ogu);
	        else
			    imageView.setImageResource(R.drawable.logoyok);
	        
	        return satirView;
		}
	}

