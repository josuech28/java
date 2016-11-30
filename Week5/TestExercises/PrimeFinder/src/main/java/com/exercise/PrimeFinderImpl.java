package com.exercise;

/**
 * Created by joschinc on 11/29/16.
 */
public class PrimeFinderImpl implements PrimeFinder {
    public boolean findPrime(long number) throws ArithmeticException {
       if(number < 2){
           throw new ArithmeticException("Do not accept negative values or (0,1) ");
       }
       return isPrime(number);
    }

    public int findSquareRoot(int number) throws ArithmeticException {
        if(number < 0 ){
            throw new ArithmeticException("Do not accept negative values");
        }
            return (int) Math.sqrt(number);
    }

    private boolean isPrime(long number){
        for(long i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
             return true;
    }
}
