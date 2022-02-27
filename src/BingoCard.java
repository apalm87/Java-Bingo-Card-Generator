import java.util.ArrayList;
import java.util.Random;

public class BingoCard {

    public static void  main(String[] args)
    {
        Random n = new Random();

        //Array Lists to store used numbers per column
        ArrayList<Integer>numB = new ArrayList<Integer>();
        ArrayList<Integer>numI = new ArrayList<Integer>();
        ArrayList<Integer>numN = new ArrayList<Integer>();
        ArrayList<Integer>numG = new ArrayList<Integer>();
        ArrayList<Integer>numO = new ArrayList<Integer>();

        //2d Array for bingo card
        Integer[][]Card = new Integer[5][5];

        //variables for numbers in columns
        int colB = 0;
        int colI = 0;
        int colN = 0;
        int colG = 0;
        int colO = 0;

        //print bingo card
        System.out.println("B  I  N  G  O");
        //Random generated numbers printed.

        //outer for loop to find column location
        for(int c = 0; c < Card.length; c++)
        {
            colB = n.nextInt(15) + 1;
            colI = n.nextInt(15) + 15;//16-30
            colN = n.nextInt(15) + 30;//31-45
            colG = n.nextInt(15) + 45;//46-60
            colO = n.nextInt(15) + 60;//61-75

            //innter for loop to find row location
            for (int r = 0; r < Card.length; r++)
            {
                //2d array locations, c=column#, r=row#
                Card[c][r] = colB;
                Card[c][r] = colI;
                Card[c][r] = colN;
                Card[c][r] = colG;
                Card[c][r] = colO;

                if (r == 0)//Column B
                {
                    //comments applies to this and all other letter columns
                    while(numB.contains(colB))//check array list to see if number is already used.
                    {
                        colB = n.nextInt(15) + 1;
                    }
                    //if statement for spacing
                    if(colB < 10)//if number is single digit
                    {
                        System.out.print(colB + "  ");
                    }
                    else//if number is double digit
                    {
                        System.out.print(colB + " ");
                    }
                    numB.add(colB);//add used number to array list
                }

                else if (r == 1)//Column I
                {
                    while(numI.contains(colI))
                    {
                        colI = n.nextInt(15) + 15;
                    }
                    if(colI < 10)
                    {
                        System.out.print(colI + "  ");
                    }
                    else
                    {
                        System.out.print(colI + " ");
                    }
                    numI.add(colI);
                }

                else if (r == 2)//Column N
                {
                    while(numN.contains(colN))
                    {
                        colN = n.nextInt(15) + 30;
                    }
                    //print 0 in center space
                    if (c==2 && r == 2)
                    {
                        System.out.print(0 + "  ");
                    }
                    else if(colN < 10)
                    {
                        System.out.print(colN + "  ");
                    }
                    else
                    {
                        System.out.print(colN + " ");
                    }
                    numN.add(colN);

                }

                else if (r == 3)//Column G
                {
                    while (numG.contains(colG))
                    {
                        colG = n.nextInt(15) + 45;
                    }
                    if(colG < 10)
                    {
                        System.out.print(colG + "  ");
                    }
                    else
                    {
                        System.out.print(colG + " ");
                    }
                    numG.add(colG);
                }

                else if (r == 4)//Column O
                {
                    while (numO.contains(colO))
                    {
                        colO = n.nextInt(15) + 60;
                    }
                    if(colO < 10)
                    {
                        System.out.println(colO + "  ");
                    }
                    else
                    {
                        System.out.println(colO + " ");
                    }
                    numO.add(colO);
                }
            }//end inner for
        }//end outer for
    }//end main
}//end program
