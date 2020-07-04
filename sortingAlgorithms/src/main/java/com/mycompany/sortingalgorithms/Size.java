/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sortingalgorithms;

/**
 *
 * @author vatso
 *///
public enum Size {
	XS(1), S(4), M(66), L(33), XL(28), XXL(50), XXXL(50);

	public final int sizevalue;

	public static Size getRandomSize() {
		return values()[(int) (Math.random() * values().length)];
	}

	private Size(int value) {
		this.sizevalue = value;
	}

}
