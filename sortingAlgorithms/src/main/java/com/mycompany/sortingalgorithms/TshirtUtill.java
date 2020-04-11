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
public class TshirtUtill {
   
    public static Tshirt[] makeTshirts(int tshirtCollection){
        Tshirt[] result = new Tshirt[tshirtCollection];
        for (int i = 0; i < tshirtCollection; i++ ){
            Tshirt temp = new Tshirt(Color.getRandomColor(),Fabric.getRandomFabric(),Size.getRandomSize());
            result[i] = temp;
                    
        }
        
        return result;
        
        
        
    }
    
     public static  ArrayList<Tshirt> makeTshirts1(int tshirtCollection){
         ArrayList<Tshirt> result = new  ArrayList<>(tshirtCollection);
        for (int i = 0; i < tshirtCollection; i++ ){
            Tshirt temp = new Tshirt(Color.getRandomColor(),Fabric.getRandomFabric(),Size.getRandomSize());
            result.set(i, temp);
                    
        }
        
        return result;
    
    
    
     }
    
    
}
