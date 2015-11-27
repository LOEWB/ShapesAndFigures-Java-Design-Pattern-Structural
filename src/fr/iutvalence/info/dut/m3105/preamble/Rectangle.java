package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle {
	
	private int weight;
	private int height;
	
	public Rectangle (int w, int h)
	{
		this.weight=w;
		this.height=h;
	}
	
	public String toString()
	{
		return "rectangle(w="+this.weight+", h="+this.height+")";
	}

}
