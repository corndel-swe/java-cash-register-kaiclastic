package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level2 {
  /**
   * Goes through the given drawer and counts how many *coins* there are in total
   * 
   * <p>
   * N.b. just the number of coins, not the total value of them
   * 
   * <p>
   * N.b. $1 is a note, not a coin
   */
  public static int countCoins(List<Item> drawer) {
    // TODO
    int total = 0;


    for(int i = drawer.size() -4; i < drawer.size(); i++){

      total += drawer.get(i).getQuantity();

    }

    return total;
  }

  /**
   * Same as count coins but for *notes* instead
   */
  public static int countNotes(List<Item> drawer) {

    int total = 0;


    for(int i = 0; i < 5; i++){

      total += drawer.get(i).getQuantity();

    }

    return total;
  }
}
