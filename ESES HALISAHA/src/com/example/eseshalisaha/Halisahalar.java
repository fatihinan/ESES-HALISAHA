package com.example.eseshalisaha;

public class Halisahalar {

	    private String  isim;
	    private String  simge;
	 
	    public Halisahalar(String isim, String simge ) {
	        super();
	        this.isim = isim;
	        this.simge = simge;
	    }
	 
	    @Override
	    public String toString() {
	        return isim;
	    }
	 
	    public String getIsim() {
	        return isim;
	    }
	 
	    public void setIsim(String isim) {
	        this.isim = isim;
	    }
	    
	    public String getSimge() {
	        return simge;
	    }
	 
	    public void setSimge(String simge) {
	        this.simge = simge;
	    }
	    
}

