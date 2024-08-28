package com.example.demo;

public class Tetrix {
    int crear;
    public Tetrix(int crear){
		this.crear=crear;
	}
	public int getCrear() {
		return crear;
	}
	public void setCrear(int crear) {
		this.crear = crear;
	}
	public boolean FueCreado(){
		return this.crear==1;
	}

    
}
