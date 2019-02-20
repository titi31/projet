package co.simplon.shapes;

public abstract class Formes  {
	public Point2D centre;
	
	public Formes() {
	
		this.centre = new Point2D(0,0);	
	}
	
	public Formes(double x,double y) {
		
		this.centre = new Point2D(x,y);
	}
	public Formes(Point2D centre) {
		this.centre = centre;
	}
	
	public double getX() {
		return centre.x;
	}
	public double getY() {
		return centre.y;
	}
	
	
	public abstract double area();
	public abstract double perimetre();
	public void setX(double x) {
		this.centre.x=x;
	}
	public void setY(double y) {
		this.centre.y=y;
	}
	public String toString() {
		return " x="+getX()+"/"+"y="+getY();
	}
}
