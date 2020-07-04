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
public enum Color {
	RED(3), ORANGE(9), YELLOW(12), GREEN(160), BLUE(14), INDIGO(8), VIOLET(15);

	public final int colorvalue;

	private Color(int value) {
		this.colorvalue = value;
	}

	public static Color getRandomColor() {
		return values()[(int) (Math.random() * values().length)];
	}

}
