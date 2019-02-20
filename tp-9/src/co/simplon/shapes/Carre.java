package co.simplon.shapes;

public class Carre extends Formes{
	private int cote;
	
	public Carre() {
		super();
		this.cote=0;
	}
	public Carre(Point2D point,int cote) {
		//super(x,y);
		this.centre=point;
		this.cote=cote;
	}
	public double area() {
		//this.cote=cote;
		return cote*cote;
	}
	public int getCote() {
		return this.cote;
	}
	public void setCote(int cote) {
		if (cote<0)
			this.cote=0;
		else
			this.cote=cote;
	}
	public double perimetre() {
		return cote*4;
	}
	public void deplacer(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	//@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "carre:"+"[cote="+getCote() + super.toString() +"]";
	}

}
