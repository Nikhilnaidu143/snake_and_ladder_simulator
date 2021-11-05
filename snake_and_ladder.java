public class snake_and_ladder{
   public static void main(String[] args){
      System.out.println("WELCOME TO SNAKE & LADDER SIMULATOR...\n\n");

      /* TEMPORARY VARIABLES */
      int player_position = 0;

		/* CONSTANT VARIABLES */
      final int ladder = 2;
      final int snake = 1;

      System.out.println("PLAYER POSITION AT START :- " + player_position);

		int die = (int)Math.floor(Math.random()*6+1);

		/* UC-3 :- OPTIONS */
      int options = (int)Math.floor(Math.random()*3);

      System.out.println("DIE ROLLED AND VALUE IS " + die + ".\n");
		switch(options){
         case ladder :
            player_position += die;
            System.out.println("\nPLAYER CLIMBED LADDER WITH " + die + " .");
            break;
         case snake :
            player_position -= die;
            System.out.println("\nPLAYER BITTEN BY A SNAKE WITH " + die + " .");
            break;
         default :
            System.out.println("\nPLAYER CHOOSED NO PLAY OPTION.");
      }
   }
}

