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
public enum Fabric {
	WOOL(1), COTTON(2), POLYESTER(3), RAYON(4), LINEN(5), CASHMERE(6), SILK(7);

	public final int fabricvalue;

	public static Fabric getRandomFabric() {
		return values()[(int) (Math.random() * values().length)];
	}

	private Fabric(int value) {
		this.fabricvalue = value;
	}

}
