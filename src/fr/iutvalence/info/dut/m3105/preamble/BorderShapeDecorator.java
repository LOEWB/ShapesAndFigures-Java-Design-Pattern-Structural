package fr.iutvalence.info.dut.m3105.preamble;

public class BorderShapeDecorator extends ShapeDecorator
{
	
	public BorderShapeDecorator(int thickness) 
	{
		super();
		this.thickness = thickness;
	}
	private int thickness;
	public String toString()
	{
		return this.shape.toString()+", thickness = "+this.thickness;
	}
}
