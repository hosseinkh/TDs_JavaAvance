package fr.dauphine.javaavance.td1;

public class Ring {
	
	private Circle c;
	private double internRadius;

	public Ring(Circle c, double radius2) {
		if(radius2 < c.getRadius()) {
			this.c = c;
			this.internRadius = radius2;
		}
		
	}
	
	@Override
	public boolean equals(Object obj) {
		Ring r2 = ((Ring) obj);
		return c.equals(r2.c) && r2.internRadius == internRadius;
	}
	
	@Override
	public String toString() {
		return c.toString() + "\n Rayon Interne : " + internRadius;
	}
	
	public boolean contains(Point p) {
		return (Math.pow(Math.sqrt(c.getCenter().getX() - p.getX()), 2) + Math.pow(Math.sqrt(c.getCenter().getY() - p.getY()), 2)) < Math.pow(internRadius, 2);
	}
	
	public boolean contains(Point p, Ring...rings) {
		for(Ring r : rings)
			if(r.contains(p))
				return true;
		return false;
	}

}
