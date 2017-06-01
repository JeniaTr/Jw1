package com.company;

/**
 * Created by JeniaTr-SL on 31.05.2017.
 */
public class Advice extends Thought {
   @Override
    public void message (){
       System.out.println("Advice.message");
       super.message();
   }
}
