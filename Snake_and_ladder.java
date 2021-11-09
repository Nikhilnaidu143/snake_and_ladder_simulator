public class Snake_and_ladder{
   public static void main(String[] args){
      System.out.println("WELCOME TO SNAKE & LADDER SIMULATOR...\n\n");

      /* TEMPORARY VARIABLES */
      int player_position = 0;
      int player_start_position = 0;
      int die_roll = 0;

      /* CONSTANT VARIABLES */
      final int ladder = 2;
      final int snake = 1;

      while(true){
         die_roll++;
         /* RANDOM DIE ROLL */
         int die = (int)Math.floor(Math.random()*6+1);
         System.out.println("DIE ROLLED BY PLAYER AND VALUE IS " + die + ".");
         if(player_start_position == 1){
            /* UC-3 :- OPTIONS */
            int options = (int)Math.floor(Math.random()*3);
            switch(options){
               case ladder :
                  player_position += die;
                  System.out.println("PLAYER CLIMBED LADDER WITH " + die + " .\n");
                  break;
               case snake :
                  player_position -= die;
                  if(player_position < 0){
							player_position = 0;
                     player_start_position = 0;
                     System.out.println("OOPS! PLAYER GOT ELIMINATED. PLAYER CURRENT POSITION :- " + player_position );
                  }
                  System.out.println("PLAYER BITTEN BY A SNAKE WITH " + die + " .\n");
                  break;
               default :
                  System.out.println("PLAYER CHOOSED NO PLAY OPTION.\n");
            }
         }
         if(player_start_position == 0 && die == 6){
            player_start_position = 1;
            player_position = 1;
            System.out.println("PLAYER GOT " + die + " AND ENTERED INTO GAME.\n");
         }
         if(player_position >= 100){
            System.out.println("HURRAY ! PLAYER REACHED " + player_position + " AND WON THE GAME.");
            return;
         }
      }
   }
}

