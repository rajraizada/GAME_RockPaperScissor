package com.company.Notes;
import java.util.Random;
import java.util.Scanner;

class rockPaperScissor{
    int cC, uC; // userChoice / computerChoice
    int wRU = 0; // wR-> win Rate User/Computer
    int wRC = 0; // wR-> win Rate User/Computer
    int i;

    rockPaperScissor(){
        System.out.println("ROCK PAPER SCISSOR GAME");
        System.out.println();
        System.out.println("----------- Rules -------------");
        System.out.println("0 -> Rock");
        System.out.println("1 -> Paper");
        System.out.println("2 -> Scissor");
        System.out.println("Rock beats Scissor, Paper beats Rock and Scissor beats Paper.");
        System.out.println("Game will continue for 5 rounds, one who wins majority rounds will be declared as Winner.");
        System.out.println();
    }

    public void round(){
        Random r = new Random();
        int a = r.nextInt(3);
        cC = a;

        Scanner s = new Scanner(System.in);
        System.out.println("Round "+i);
        System.out.println();
        System.out.print("Enter the number : ");
        int b = s.nextInt();
         uC = b;

        System.out.println("Computer has chosen : "+a);
        System.out.println();
        judge();
    }

    public void judge(){
        if(cC == uC){
            round();
            System.out.println();
        }
        else if(cC==0 && uC==1){
            System.out.println("Congratulations! You won this round.");
            wRU=wRU+1;
            System.out.println("Round "+i+" Score : Computer "+wRC+" "+"You "+wRU);
            System.out.println();
        }
        else if(cC==0 && uC==2){
            System.out.println("Computer won this round");
            wRC=wRC+1;
            System.out.println("Round "+i+" Score : Computer "+wRC+" "+"You "+wRU);
            System.out.println();
        }
        else if(cC==1 && uC==0){
            System.out.println("Computer won this round");
            wRC=wRC+1;
            System.out.println("Round "+i+" Score : Computer "+wRC+" "+"You "+wRU);
            System.out.println();
        }
        else if(cC==1 && uC==2){
            System.out.println("Congratulations! You won this round.");
            wRU=wRU+1;
            System.out.println("Round "+i+" Score : Computer "+wRC+" "+"You "+wRU);
            System.out.println();
        }
        else if(cC==2 && uC==0){
            System.out.println("Congratulations! You won this round.");
            wRU=wRU+1;
            System.out.println("Round "+i+" Score : Computer "+wRC+" "+"You "+wRU);
            System.out.println();
        }
        else if(cC==2 && uC==1){
            System.out.println("Computer won this round");
            wRC=wRC+1;
            System.out.println("Round "+i+" Score : Computer "+wRC+" "+"You "+wRU);
            System.out.println();
        }
        else{
            System.out.println("Invalid attempt. You lost the game.");
            i=10;
            wRC=10;
        }
    }

}

public class Java_tut_41_Ex_2_Game_Rock_Paper_Scissor {
    public static void main(String[] args) {

        rockPaperScissor play = new rockPaperScissor();

        play.i=1;
            while(play.i<=5) {
                play.round();
                play.i++;
            }
        if(play.wRC > play.wRU){
            System.out.println("********** Computer is the Winner **********");
        }
        else{
            System.out.println("********** Congratulations! you are the winner **********");
        }
    }
}
