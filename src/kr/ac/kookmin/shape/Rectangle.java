package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
	int w, h;
	
	public Rectangle(Point center, int w, int h){
		super(center);
		this.w = w;
		this.h = h;
	}
	
	public Rectangle getBounds() {
		return this;
	}
	
	public int getHeight() {
		return this.h;
	}
	
	public int getWidth() {
		return this.w;
	}
	
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Rectangle";
	}
}
