package mealapp;

import domein.MenuDirector;
import domein.MyItalianBuilder;
import domein.MyJapaneseBuilder;

public class MealApp {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       MenuDirector director = new MenuDirector(new MyItalianBuilder());
       director.buildMenu();
       System.out.println(director.getMenu().toString());
       
       director = new MenuDirector(new MyJapaneseBuilder());
       director.buildMenu();
       System.out.println(director.getMenu().toString());
   }
   
}
