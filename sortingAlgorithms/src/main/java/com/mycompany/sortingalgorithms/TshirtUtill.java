/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sortingalgorithms;

import java.util.ArrayList;

/**
 *
 * @author vatso
 */
public  class TshirtUtill {

	public static Tshirt[] makeTshirts(int tshirtCollection) {
		Tshirt[] result = new Tshirt[tshirtCollection];
		for (int i = 0; i < tshirtCollection; i++) {
			Tshirt temp = new Tshirt(Color.getRandomColor(), Fabric.getRandomFabric(), Size.getRandomSize());
			result[i] = temp;

		}

		return result;

	}

	public static ArrayList<Tshirt> makeTshirts1(int tshirtCollection) {
		ArrayList<Tshirt> result = new ArrayList<>(tshirtCollection);
		for (int i = 0; i < tshirtCollection; i++) {
			Tshirt temp = new Tshirt(Color.getRandomColor(), Fabric.getRandomFabric(), Size.getRandomSize());
			result.set(i, temp);

		}

		return result;

	}

	public static void sortOptions()  {
		System.out.println("Select your sorting option");
		System.out.println("1. Print T-shirts");
		System.out.println("2. Short T-shirts by size in ascending");
		System.out.println("3. Short T-shirts by size in descending");
		System.out.println("4. Short T-shirts by color in ascending");
		System.out.println("5. Short T-shirts by color in descending");
		System.out.println("6. Short T-shirts by fabric in ascending");
		System.out.println("7. Short T-shirts by fabric in descending");
		System.out.println("8. Short T-shirts by size, color and fabric in ascending");
		System.out.println("9. Short T-shirts by size, color and fabric in descending");
	}
	
	
	
	
}
