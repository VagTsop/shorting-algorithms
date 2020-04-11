/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sortingalgorithms;

import java.util.Comparator;

/**
 *
 * @author vatso
 */
public class TshirtSizeComparator implements Comparator<Tshirt> {
    
    
    @Override
    public int compare(Tshirt o1, Tshirt o2) {
        return (o1.getS().ordinal() - o2.getS().ordinal());
    }
    
    
    @Override
    public Comparator<Tshirt> reversed() {
        return Comparator.super.reversed();
    }
    
   
    
    
    
    
    
    
    
    
}
