/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sortingalgorithms;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vatso
 */
public class Demo {

	public static void main(String[] args) throws IOException {

		Tshirt[] tshirtarray = TshirtUtill.makeTshirts(40);

		TshirtSizeComparator tshirtsizecomparator = new TshirtSizeComparator();

		TshirtColorComparator tshirtcolorcomparator = new TshirtColorComparator();

		TshirtFabricComparator tshirtFabricComparator = new TshirtFabricComparator();

		TshirtSortBySizeColorAndFabric tshirtSortBySizeColorAndFAbric = new TshirtSortBySizeColorAndFabric();

		System.out.println();
		Scanner sc = new Scanner(System.in);

		TshirtUtill.sortOptions();
		int menuChoice;
		do {
			
			menuChoice = sc.nextInt();
			switch (menuChoice) {

			case 1:
				System.out.println(Arrays.toString(tshirtarray));
				break;
			case 2:
				Tshirt[] sortedSizeArrayAsc = AlgorithmShorting.bubbleSort(tshirtarray, tshirtsizecomparator);
				System.out.println(Arrays.toString(sortedSizeArrayAsc));
				break;
			case 3:
				Tshirt[] sortedSizeArrayDesc = AlgorithmShorting.bubbleSort(tshirtarray,
						tshirtsizecomparator.reversed());
				System.out.println(Arrays.toString(sortedSizeArrayDesc));
				break;
			case 4:
				Tshirt[] sortedColorAsc = AlgorithmShorting.quicksort(tshirtarray, 0, 39, tshirtcolorcomparator);
				System.out.println(Arrays.toString(sortedColorAsc));
				break;

			case 5:
				Tshirt[] sortedColorDesc = AlgorithmShorting.quicksort(tshirtarray, 0, 39,
						tshirtcolorcomparator.reversed());
				System.out.println(Arrays.toString(sortedColorDesc));
				break;
			case 6:
				Tshirt[] sortedFabricAsc = AlgorithmShorting.quicksort(tshirtarray, 0, 39, tshirtFabricComparator);
				System.out.println(Arrays.toString(sortedFabricAsc));
				break;
			case 7:
				Tshirt[] sortedFabricDesc = AlgorithmShorting.quicksort(tshirtarray, 0, 39,
						tshirtFabricComparator.reversed());
				System.out.println(Arrays.toString(sortedFabricDesc));
				break;
			case 8:
				Tshirt[] sortedbySizeColorAndFabricAsc = AlgorithmShorting.quicksort(tshirtarray, 0, 39,
						tshirtSortBySizeColorAndFAbric);
				System.out.println(Arrays.toString(sortedbySizeColorAndFabricAsc));
				break;
			case 9:
				Tshirt[] sortedbySizeColorAndFabricDesc = AlgorithmShorting.quicksort(tshirtarray, 0, 39,
						tshirtSortBySizeColorAndFAbric.reversed());
				System.out.println(Arrays.toString(sortedbySizeColorAndFabricDesc));
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		} while (menuChoice < 9);
	}

}
