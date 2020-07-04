/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sortingalgorithms;

/**
 *
 * @author vatso
 */
public class Tshirt implements Comparable<Tshirt> {

	private final Color c;
	private final Fabric f;
	private final Size s;

	public Tshirt(Color c, Fabric f, Size s) {
		this.c = c;
		this.f = f;
		this.s = s;
	}

	@Override
	public String toString() {
		return "TShirt{" + "c=" + c + ", s=" + s + ", f=" + f + '}';
	}

	public Color getC() {
		return c;
	}

	public Size getS() {
		return s;
	}

	public Fabric getF() {
		return f;
	}

	@Override
	public int compareTo(Tshirt o) {
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	
	
	
	

}