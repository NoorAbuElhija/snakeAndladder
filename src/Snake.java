public class Snake {
  private int snakeHead;
  private int snakeLong;
  public Snake(int start,int Long)
  {
      snakeHead=start;
      snakeLong=Long;
  }
 public int getSnakeHead()
  {
      return snakeHead;
  }
  public int getSnakeLong()
  {
      return snakeLong;
  }

  public  static boolean LegalSnake(Snake snake, Snake []snakeBoard, Ladder[]ladderBoard)
  {
      if((snake.snakeHead<100)||(snake.snakeHead<1))
      {
          System.out.println("The square is not within the board's boundaries!");
          return false;
      }
      if(snake.snakeHead==100)
      {
          System.out.println("You cannot add a snake in the last square!");
          return false;

      }
      if (snake.snakeHead- snake.snakeLong<1)
      {
      System.out.println("The snake is too long!");
      }

      if (snakeBoard[snake.snakeHead]!=null)
      {
          System.out.println("This square already contains a head of a snake !");
          return false;
      }
      if(ladderBoard[snake.snakeHead]!=null)
      {
          System.out.println("This square contains a bottom of a ladder !");
          return false;
      }
      return true;

  }



}
