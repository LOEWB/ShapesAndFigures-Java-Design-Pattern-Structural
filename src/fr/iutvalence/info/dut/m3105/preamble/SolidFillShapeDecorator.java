package fr.iutvalence.info.dut.m3105.preamble;

public class SolidFillShapeDecorator extends ShapeDecorator
{
	public SolidFillShapeDecorator(String color) 
	{
		super();
		this.color = color;
	}
	String color;
	public String toString()
	{
		return this.shape.toString()+", color = "+this.color;
	}
}
