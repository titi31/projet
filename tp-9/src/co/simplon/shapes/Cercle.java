package co.simplon.shapes;
import java.lang.Math;

public class Cercle extends Formes{
	private int rayon;
	public Cercle() {
		super();
		this.rayon=0;
		
	}
	public Cercle(Point2D point,int rayon) {
		//super(x,y);
		this.centre=point;
		this.rayon=rayon;
	}
	public double area() {
		this.rayon=rayon;
		return Math.PI*Math.pow(rayon,2);
	}
	public void setRayon(int rayon) {
		if(rayon<0)
			rayon=0;
		else
			this.rayon=rayon;
	}
	public int getRayon() {
		return this.rayon;
	}
	public double perimetre() {
		return Math.PI*rayon+2;
	}
	public void deplacer(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "cercle:"+"[rayon="+getRayon() + super.toString() +"]";
	}
}
