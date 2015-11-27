package fr.iutvalence.info.dut.m3105.preamble;

public class ShadowShapeDecorator extends ShapeDecorator
{
	private int intensity;
	private int angle;
	public ShadowShapeDecorator(int angle,int intensity) 
	{
		super();
		this.intensity = intensity;
		this.angle = angle;
	}
	
	public String toString()
	{
		return this.shape.toString()+", angle = "+this.angle+", "+this.intensity;
	}
}
