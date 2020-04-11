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
public class TshirtSortBySizeColorAndFabric implements Comparator<Tshirt>{
    
   
        @Override
    public int compare(Tshirt o1, Tshirt o2) {
        int compSize = o1.getS().ordinal() - o2.getS().ordinal();
        if (compSize == 0) {
            int compColor = o1.getC().name().compareTo(o2.getC().name());
            if (compColor == 0) {
                int compFabric = o1.getF().name().compareTo(o2.getF().name());
                if (compFabric == 0) {
                    return 0;
                } else {
                    return compFabric;
                }
            } else {
                return compColor;
            }
        }else{
            return compSize;
        }
    }
    
     @Override
    public Comparator<Tshirt> reversed() {
        return Comparator.super.reversed();
    } 
    
    
    
    
    
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

