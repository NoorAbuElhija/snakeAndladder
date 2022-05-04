public class Ladder {
    private int ladderLength;
    private int ladderbase;
    public Ladder (int length,int  squrenumber )
    {
        ladderLength=length;
        ladderbase=squrenumber;
    }
    public int getLadderLength()
    {
        return ladderLength;
    }
    public int getLadderbase()
    {
        return ladderbase;
    }

    public  static boolean LegalLadder(Ladder ladder, Snake []snakeBoard, Ladder[]ladderBoard)
    {

        if((ladder.ladderbase>100)||(ladder.ladderbase<1))
        {
            System.out.println("The square is not within the board's boundaries!");
            return false;
        }

        if (ladder.ladderbase+ ladder.ladderLength>100)
        {
            System.out.println("The ladder is too long!");
        }
        if(ladderBoard[ladder.ladderbase]!=null)
        {
            System.out.println("This square already contains a bottom of a ladder!");
            return false;
        }

        if (snakeBoard[ladder.ladderbase]!=null)
        {
            System.out.println("This square contains a head of a snake!");
            return false;
        }

        return true;

    }


}
