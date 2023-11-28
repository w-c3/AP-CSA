/* Programmer:
   Date:
   Description:
*/

import java.util.Scanner;

public class myProgram
{
    public static void main(String[] args)
    {
        System.out.println("Let\'s play \'Stuck in the Mud\'");
        Scanner input = new Scanner(System.in);
        String playAgain = "yes";
        int playerScore = 0;
        int computerScore = 0;
        int playerWins = 0;
        int computerWins = 0;
        
        
        while(!(playAgain.equals("no"))){
            System.out.println("Rolling Dice....");
            playerScore = 0;
            computerScore = 0;
            //Player Dice 1:
            int dice1 = (int)(Math.random()*6 +1);
            boolean dice1roll = true;
            System.out.print("You rolled [");
            while(dice1roll){
                 System.out.print(" " + dice1);
                 if (dice1 != 2 && dice1 != 5){
                     playerScore = playerScore + dice1;
                 }else{
                    dice1roll = false;
                }
                dice1 = (int)(Math.random()*6 +1);
            }
            //Player Dice 2:
            int dice2 = (int)(Math.random()*6 +1);
            boolean dice2roll = true;
            while(dice2roll){
                 System.out.print(" " + dice2);
                 if (dice2 != 2 && dice2 != 5){
                     playerScore = playerScore + dice2;
                 }else{
                    dice2roll = false;
                }
                dice2 = (int)(Math.random()*6 +1);
            }
            //Player Dice 3:
            int dice3 = (int)(Math.random()*6 +1);
            boolean dice3roll = true;
            while(dice3roll){
                 System.out.print(" " + dice3);
                 if (dice3 != 2 && dice3 != 5){
                     playerScore = playerScore + dice3;
                 }else{
                    dice3roll = false;
                }
                dice3 = (int)(Math.random()*6 +1);
            }
            //Player Dice 4:
            int dice4 = (int)(Math.random()*6 +1);
            boolean dice4roll = true;
            while(dice4roll){
                 System.out.print(" " + dice4);
                 if (dice4 != 2 && dice4 != 5){
                     playerScore = playerScore + dice4;
                 }else{
                    dice4roll = false;
                }
                dice4 = (int)(Math.random()*6 +1);
            }
            //Player Dice 5:
            int dice5 = (int)(Math.random()*6 +1);
            boolean dice5roll = true;
            while(dice5roll){
                 System.out.print(" " + dice5);
                 if (dice5 != 2 && dice5 != 5){
                     playerScore = playerScore + dice5;
                 }else{
                    dice5roll = false;
                }
                dice5 = (int)(Math.random()*6 +1);
            }
            System.out.print("]");
            System.out.println();
            //Player Score:
            System.out.println("Total player: " + playerScore);
            
            
            //Computer Rolling:
            //1
            dice1 = (int)(Math.random()*6 +1);
            dice1roll = true;
            while(dice1roll){
                 if (dice1 != 2 && dice1 != 5){
                     computerScore = computerScore + dice1;
                 }else{
                    dice1roll = false;
                }
                dice1 = (int)(Math.random()*6 +1);
            }
            //2
            dice2 = (int)(Math.random()*6 +1);
            dice2roll = true;
            while(dice2roll){
                 if (dice2 != 2 && dice2 != 5){
                     computerScore = computerScore + dice2;
                 }else{
                    dice2roll = false;
                }
                dice2 = (int)(Math.random()*6 +1);
            }
            //3
            dice3 = (int)(Math.random()*6 +1);
            dice3roll = true;
            while(dice3roll){
                 if (dice3 != 2 && dice3 != 5){
                     computerScore = computerScore + dice3;
                 }else{
                    dice3roll = false;
                }
                dice3 = (int)(Math.random()*6 +1);
            }
            //4
            dice4 = (int)(Math.random()*6 +1);
            dice4roll = true;
            while(dice4roll){
                 if (dice4 != 2 && dice4 != 5){
                     computerScore = computerScore + dice4;
                 }else{
                    dice4roll = false;
                }
                dice4 = (int)(Math.random()*6 +1);
            }
            //5
            dice5 = (int)(Math.random()*6 +1);
            dice5roll = true;
            while(dice5roll){
                 if (dice5 != 2 && dice5 != 5){
                     computerScore = computerScore + dice5;
                 }else{
                    dice5roll = false;
                }
                dice5 = (int)(Math.random()*6 +1);
            }
            System.out.println("Total Computer: " + computerScore);
            ////////////////////////////////////////////////
            if(playerScore > computerScore){
                System.out.println("You won!!!");
                playerWins ++;
            }
            else if(playerScore < computerScore){
                System.out.println("Computer won!!!");
                computerWins ++;
            }else{
                System.out.println("Tie Game!!!");
            }
            System.out.println("Play Again?");
            playAgain = input.nextLine();
        }
        
        System.out.println("You won " + playerWins + " games.");
        System.out.println("Computer won " + computerWins + " games.");
        if(computerWins > playerWins){
            System.out.println("Computer won \'Stuck in the Mud\'");
        }else if(computerWins < playerWins){
            System.out.println("You won \'Stuck in the Mud\'");
        }else{
            System.out.println("Computer and you tied \'Stuck in the Mud\'");
        }
        
    }
}
 /*
            int dice1 = (int)(Math.random()*6 +1);
            System.out.print("You rolled [" + dice1);
            while(!(dice1 == 2)){
                while(!(dice1 == 5)){
                    playerScore = playerScore + dice1;
                    dice1 = (int)(Math.random()*6 +1);
                    System.out.print(" " + dice1);
                }
                
            }
            */
            /*
            //Dice 2:
            int dice2 = (int)(Math.random()*6 +1);
            while(dice2 != 2 && dice2 != 5){
                 System.out.print(" " + dice2);
                 if (dice2 != 2 && dice2 != 5){
                     playerScore = playerScore + dice2;
                     
                 }
                 dice2 = (int)(Math.random()*6 +1);
            }
            */