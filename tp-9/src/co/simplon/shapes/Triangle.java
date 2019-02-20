package co.simplon.shapes;

public class Triangle extends Formes {
	
	private int base;
	private int hauteur;
	public Triangle() {
		super();
		this.base=0;
		this.hauteur=0;
	}
	public Triangle(Point2D point,int base,int hauteur) {
		//super(x,y);
		this.centre=point;
		this.base=base;
		this.hauteur=hauteur;
	}
	public double area() {
		this.base=base;
		this.hauteur=hauteur;
		int resultat=(base*hauteur)/2;
		return resultat;
	}
	public int getBase() {
		return this.base;
	}
	public int getHauteur() {
		return this.hauteur;
	}
	public void setBase(int base) {
		if(base<0)
			this.base=0;
		else
			this.base=base;
	}
	public void setHauteur(int hauteur) {
		if(hauteur<0)
			this.hauteur=0;
		else
			this.hauteur=hauteur;
	}
	public double perimetre() {
		return base+hauteur;
	}
	public void deplacer(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "triangle:"+"[base="+getBase() + super.toString() + "]";
	}
}
