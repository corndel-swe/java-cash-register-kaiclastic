package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level4 {
  /**
   * Returns true if it is possible to make the target amount out of the cash in
   * the drawer. Returns false if it is not possible.
   */
  public static boolean canMakeAmount(int target, List<Item> drawer) {
    // TODO
    boolean targetAchieved = false;

   for(Item currentCash : drawer){
    int value = currentCash.getValue();
    int quantity= currentCash.getQuantity();

     while (target > 0 && quantity > 0 ) {
       // remember it must be => 0 otherwise we will never reach to zero ie achieving the target
       if (target >= value){
         target -= value;
         quantity --;

       } else{
         break;
       }
     }
   }

   System.out.println(target);
    if (target == 0){
      targetAchieved = true;
    }


    return targetAchieved;
  }
}
