/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.util.Scanner;

/**
 *
 * @author Arceus922
 */
public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] ttt=new char[3][3];
        int i,j,k,l,m,n;
        char winner;
        System.out.println("Tic Tac Toe v:1.0");
        do
        {
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                ttt[i][j]='e';
            }
        }
        winner='n';
        System.out.println("Current table (e=empty space)");
        System.out.println(ttt[0][0]+""+ttt[0][1]+""+ttt[0][2]);
        System.out.println(ttt[1][0]+""+ttt[1][1]+""+ttt[1][2]);
        System.out.println(ttt[2][0]+""+ttt[2][1]+""+ttt[2][2]);
        for (l=0;l<9;l++)
        {
            System.out.println("It's player's "+((l%2)+1)+" turn");
            do
            {
                System.out.println("Give the number for the collumn ( 1 2 or 3 ): ");
                m=in.nextInt();
                System.out.println("Give the number for the row ( 1 2 or 3 ): ");
                n=in.nextInt();
                if(m>3||n>3||n<1||m<1)
                {
                    System.out.println("The numbers you gave were not matching for any column/row please try again!");
                }else if(ttt[n-1][m-1]!='e')
                {
                    System.out.println("The place you wish to mark has arleady been marked! Please try again!");
                }
            }while(m>3||n>3||n<1||m<1||ttt[n-1][m-1]!='e');
            if(l%2==0)
            {
                ttt[n-1][m-1]='o';
            }
            if(l%2==1)
            {
                ttt[n-1][m-1]='x';
            }
            System.out.println("Current table (e=empty space)");
            System.out.println(ttt[0][0]+""+ttt[0][1]+""+ttt[0][2]);
            System.out.println(ttt[1][0]+""+ttt[1][1]+""+ttt[1][2]);
            System.out.println(ttt[2][0]+""+ttt[2][1]+""+ttt[2][2]);
            if(ttt[0][0]==ttt[0][1]&&ttt[0][0]==ttt[0][2]&&ttt[0][0]!='e')
            {
                winner=ttt[0][0];
                break;
            }
            if(ttt[1][0]==ttt[1][1]&&ttt[1][0]==ttt[1][2]&&ttt[1][0]!='e')
            {
                winner=ttt[1][0];
                break;
            }
            if(ttt[2][0]==ttt[2][1]&&ttt[2][0]==ttt[2][2]&&ttt[2][0]!='e')
            {
                winner=ttt[2][0];
                break;
            }
            if(ttt[0][0]==ttt[1][0]&&ttt[0][0]==ttt[2][0]&&ttt[0][0]!='e')
            {
                winner=ttt[0][0];
                break;
            }
            if(ttt[0][1]==ttt[1][1]&&ttt[0][1]==ttt[2][1]&&ttt[0][1]!='e')
            {
                winner=ttt[0][1];
                break;
            }
            if(ttt[0][2]==ttt[1][2]&&ttt[0][2]==ttt[2][2]&&ttt[0][2]!='e')
            {
                winner=ttt[0][2];
                break;
            }
            if(ttt[0][0]==ttt[1][1]&&ttt[0][0]==ttt[2][2]&&ttt[0][0]!='e')
            {
                winner=ttt[0][0];
                break;
            }
            if(ttt[2][0]==ttt[1][1]&&ttt[0][2]==ttt[2][0]&&ttt[0][2]!='e')
            {
                winner=ttt[0][2];
                break;
            }
        }
        if(winner=='o')
        {
            System.out.println("Player 1 is the winner");
        }
        else if(winner=='x')
        {
            System.out.println("Player 2 is the winner");
        }
        else
        {
            System.out.println("The game was a draw");
        }
        System.out.println("Do you want to continue? (0=no, any other number=yes)");
        k=in.nextInt();
        }while(k!=0);
    }
    
}
