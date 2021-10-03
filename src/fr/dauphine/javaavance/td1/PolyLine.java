package fr.dauphine.javaavance.td1;

import java.util.LinkedList;

public class PolyLine {
	
	private LinkedList<Point> points;
	
	public PolyLine(LinkedList<Point> points) {
		this.points = points;
	}
	
	public void add(Point p) {
		this.points.add(p);
	}
	
	public int nbPoints() {
		return points.size();
	}
	
	public boolean contains(Point p2) {
		return points.contains(p2);
	}

}
