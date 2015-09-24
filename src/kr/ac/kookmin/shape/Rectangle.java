package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
	
	int h;
	int w;
	
	public Rectangle getBounds() {
		return this;
	}
	
	public int getHeight() {
		return h;
	}
	
	public int getWidth() {
		return w;
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

