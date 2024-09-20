package com.corndel.cashregister.exercises;

import com.corndel.cashregister.exercises.models.Recipe;
import com.corndel.cashregister.exercises.models.RecipeBook;

import java.awt.print.Book;

public class Exercise3b {
  /**
   * Given a recipeBook containing recipes, returns the total number of servings
   * in the book
   */
  public static int countServings(RecipeBook recipeBook) {
    // TODO
    int count = 0;

    for (Recipe recipeServe : recipeBook.recipes) {
      count += recipeServe.getServings();
    }

    return count;
  }
}
