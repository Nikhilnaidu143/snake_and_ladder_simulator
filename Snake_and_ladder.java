public class Snake_and_ladder{
   public static void main(String[] args){
      System.out.println("WELCOME TO SNAKE & LADDER SIMULATOR...\n\n");

      /* TEMPORARY VARIABLES */
      int player1_position = 0;
      int temp_player1_position = 0;
      int player1_start_position = 0;

      int player2_position = 0;
      int temp_player2_position = 0;
      int player2_start_position = 0;

      int die_roll = 0;

      /* CONSTANT VARIABLES */
      final int ladder = 2;
      final int snake = 1;

      while(true){
         die_roll++;
         /* RANDOM DIE ROLL */
         int die1 = (int)Math.floor(Math.random()*6+1);
         System.out.println("DIE ROLLED BY PLAYER-1 AND VALUE IS " + die1 + ".");
         if(player1_start_position == 1){
            /* UC-3 :- OPTIONS */
            int options1 = (int)Math.floor(Math.random()*2+1);
            switch(options1){
               case ladder:
                  temp_player1_position = player1_position;
                  player1_position += die1;
                  /* UC-5:- Ensure the player gets to exact winning position 100 to win the game. */
                  if(player1_position > 100){
                     player1_position = temp_player1_position;
                     System.out.println("PLAYER-1 NEEDS TO GET " + (100-player1_position) + " TO WIN THE GAME.\n");
                     break;
                  }
                  System.out.println("PLAYER-1 CLIMBED LADDER WITH " + die1 + " AND PLAYER-1 CURRENT POSITION :- " + player1_position + " .\n");
                  break;
               case snake:
                  player1_position -= die1;
                  if(player1_position < 0){
                     player1_position = 0;
                     player1_start_position = 0;
                     System.out.println("OOPS! PLAYER-1 GOT ELIMINATED. PLAYER-1 CURRENT POSITION :- " + player1_position + "\n");
                     break;
                  }
                  System.out.println("PLAYER-1 BITTEN BY A SNAKE WITH " + die1 + " AND PLAYER-1 CURRENT POSITION :- " + player1_position + " .\n");
                  break;
            }
         }
         if(player1_start_position == 0 && die1 == 6){
            player1_start_position = 1;
            player1_position = 1;
            System.out.println("PLAYER-1 GOT " + die1 + " AND ENTERED INTO GAME. PLAYER-1 CURRENT POSITION :- " + player1_position + " .\n");
         }
         if( player1_position >= 100 ){
            System.out.println("HURRAY ! PLAYER-1 REACHED " + player1_position + " AND WON THE GAME WITH " + die_roll + " DIE ROLLS.");
            return;
         }
                  /* RANDOM DIE ROLL */
         int die2 = (int)Math.floor(Math.random()*6+1);
         System.out.println("DIE ROLLED BY PLAYER-2 AND VALUE IS " + die2 + ".");
         if(player2_start_position == 1){
            /* UC-3 :- OPTIONS */
            int options2 = (int)Math.floor(Math.random()*2+1);
            switch(options2){
               case ladder:
                  temp_player2_position = player2_position;
                  player2_position += die2;
                  /* UC-5:- Ensure the player gets to exact winning position 100 to win the game. */
                  if(player2_position > 100){
                     player2_position = temp_player2_position;
                     System.out.println("PLAYER-2 NEEDS TO GET " + (100-player2_position) + " TO WIN THE GAME.\n");
                     break;
                  }
                  System.out.println("PLAYER-2 CLIMBED LADDER WITH " + die2 + " AND PLAYER-2 CURRENT POSITION :- " + player2_position + " .\n");
                  break;
               case snake:
                  player2_position -= die2;
                  if(player2_position < 0){
                     player2_position = 0;
                     player2_start_position = 0;
                     System.out.println("OOPS! PLAYER-2 GOT ELIMINATED. PLAYER-2 CURRENT POSITION :- " + player2_position + "\n");
                     break;
                  }
                  System.out.println("PLAYER-2 BITTEN BY A SNAKE WITH " + die2 + " AND PLAYER-2 CURRENT POSITION :- " + player2_position + " .\n");
                  break;
            }
         }
         if(player2_start_position == 0 && die2 == 6){
            player2_start_position = 1;
            player2_position = 1;
            System.out.println("PLAYER-2 GOT " + die2 + " AND ENTERED INTO GAME. PLAYER-2 CURRENT POSITION :- " + player2_position + " .\n");
         }
         if( player2_position >= 100 ){
            System.out.println("HURRAY ! PLAYER-2 REACHED " + player2_position + " AND WON THE GAME WITH " + die_roll + " DIE ROLLS.");
            return;
         }
      }
   }
}
