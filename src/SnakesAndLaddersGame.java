enum color{
    red,
    blue,
    green,
    yellow,
    orange
}

public class SnakesAndLaddersGame {
  public static void initializeGame()
    {
        int[] snakeboard=new int[100];
        int[] ladderboard=new int[100];
        int [] numbers=new int[2];
        int counter1=1;
        int counter2=1;
        System.out.println("Initializing the game...");
        String[] input=new String[2];
        String[][] players=new String[2][5];
        int i=0;
        while ((input[i]!="end"))
        {
            input[i]= Main.scanner.nextLine();
            if (input[i]=="end")
            {
                break;
            }
            String [] helper=input[i].split(" ");
            convertSring(numbers,helper);
            if (helper[1]=="snake")
            {
               Snake snake=new Snake(numbers[0],numbers[1]);
               if(!Snake.LegalSnake(snake,snakeboard,ladderboard))
               {
                   continue;
               }
               else {
                   Snake.add_snake(snakeboard,counter1,snake);
                   counter1=counter1+2;
               }

            }
            else {
                if (helper[1]=="ladder")
                {

                    Ladder ladder=new Ladder(numbers[0],numbers[1]);
                    if(!Ladder.LegalLadder(ladder,snakeboard,ladderboard))
                    {
                        continue;
                    }
                    else {
                        Ladder.add_ladder(snakeboard,counter1,ladder);
                        counter2=counter2+2;
                    }

                }
            }


        }


    }
    public static void convertSring(int [] numbers,String [] helper)
    {

        try {
            numbers[0] = Integer.parseInt(helper[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        try {
            numbers[1] = Integer.parseInt(helper[3]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
