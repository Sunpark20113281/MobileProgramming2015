package kr.ac.kookmin.shape;

public abstract class Shape {
    protected Point center;
    
    public Shape(Point center){
    	this.center = center;
    }
    
	public Point getCenter(){
    	return center;
    }
    abstract Rectangle getBounds();
    abstract void draw(Graphics g);

}