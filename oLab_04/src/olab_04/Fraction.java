/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package olab_04;

/**
 *
 * @author helld
 */

public class Fraction {
    public double topN;
    public double btmN;
    
    public String toFraction(){
         return ((int)topN+"/"+(int)btmN);
    }
    public String toFloat(){
        double num = topN / btmN;
        return Double.toString(num);
    }
    public void addFraction(Fraction f){
        if(btmN == f.btmN){
            topN = topN + f.topN;
        }
        else{
            topN = (topN*f.btmN)+(f.topN*btmN);
            btmN = btmN*f.btmN;
        }
    }
    public boolean myEquals(Fraction x){
        boolean bool = (topN/btmN == (x.topN/x.btmN));
        return bool;
    }
    public double gcd(double a, double b){
        return b == 0 ? a : gcd(b, a%b);
    }
    
    public void LowestTermFrac(){
        double num = gcd(topN, btmN);
        topN = topN/num;
        btmN = btmN/num;
    }
}
