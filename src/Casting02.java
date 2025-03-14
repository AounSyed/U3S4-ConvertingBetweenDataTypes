public class Casting02 {
    public static void main(String[] args) {
                
        //World population today
        long currentWorldPop = 7000000000L;
        System.out.println("Current World Population: " +currentWorldPop);
        
        //World population in 1950,  Source: United Nations Population Division
        //2.52 Billion
        int africaPop   =   221000000;
        int asiaPop     = 1402000000;
        int europePop   =   547000000;
        int americasPop =   339000000;
        int oceanaPop   =    13000000;
        long total = (long) africaPop + asiaPop + europePop + americasPop + oceanaPop;

        System.out.println("World Population in 1950: " 
                + total);
        
        //The current population of Asia is an estimated 60% of the world population
        double percentAsia = 0.6;
        int currentAsiaPop = (int) (currentWorldPop * percentAsia);
        System.out.println("Current Asia Population: " +currentAsiaPop);      
       
    }  
}
