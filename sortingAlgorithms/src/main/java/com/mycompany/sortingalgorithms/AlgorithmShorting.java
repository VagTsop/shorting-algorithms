/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sortingalgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author vatso
 */
public class AlgorithmShorting {

	public static Tshirt[] bubbleSort(Tshirt[] arraytosort, Comparator comparator) {
		int n = arraytosort.length;
		Tshirt temp;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (comparator.compare(arraytosort[j - 1], arraytosort[j]) > 0) {

					temp = arraytosort[j - 1];
					arraytosort[j - 1] = arraytosort[j];
					arraytosort[j] = temp;

				}

			}

		}
		return arraytosort;

	}

	public static Tshirt[] quicksort(Tshirt[] array, int begin, int end, Comparator comparator) {

		if (begin < end) {
			int partitionIndex = partition(array, begin, end, comparator);

			quicksort(array, begin, partitionIndex - 1, comparator);
			quicksort(array, partitionIndex + 1, end, comparator);

		}

		return array;

	}

	private static int partition(Tshirt arr[], int begin, int end, Comparator comparator) {

		Tshirt pivot = arr[end];
		int i = begin - 1;

		for (int j = begin; j < end; j++) {
			if (comparator.compare(arr[j], pivot) < 0) {
				i++;

				Tshirt swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;

			}

		}

		Tshirt swapTemp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swapTemp;

		return i + 1;

	}

	public static ArrayList<Tshirt> bucketSort(ArrayList<Tshirt> list, Comparator comparator) {
		final int noOfBuckets = (int) Math.sqrt(list.size());
		List<Tshirt>[] buckets = new List[noOfBuckets];
		for (int i = 0; i < noOfBuckets; i++) {
			buckets[i] = new LinkedList<>();
		}
		for (Tshirt t : list) {
			buckets[hash(t)].add(t);
		}
		for (List<Tshirt> bucket : buckets) {
			Collections.sort(bucket, comparator);
		}
		int i = 0;
		for (List<Tshirt> bucket : buckets) {
			for (Tshirt num : bucket) {
				list.set(i++, num);
			}
		}
		return list;
	}

	private static int hash(Tshirt e) {
		return e.getC().colorvalue / 10;
	}

}
