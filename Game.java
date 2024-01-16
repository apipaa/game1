
package game;


public class Game {

   
    public static void main(String[] args) {
        //objek
        player hero = new player();
        player musuh = new player ();
        
        hero.name = "irin";
        hero.speed = 60;
        hero.healthPoin= 70;
        hero.armor = 50;
        hero.damage = 70;
        
        hero.run();
        hero.attack();
        hero.defend();
        
         if(hero.isDead()){
            System.out.println("game over;"); 
        }else{
            System.out.println("masih hidup");
        }
        
        musuh.name = "oran";
        musuh.speed = 50;
        musuh.healthPoin= 60;
        musuh.armor = 100;
        musuh.damage = 80;
        
        musuh.run();
        musuh.attack();
        musuh.defend();
        
        if(musuh.isDead()){
            System.out.println("game over;"); 
        }else{
            System.out.println("masih hidup");
        }
}
}
