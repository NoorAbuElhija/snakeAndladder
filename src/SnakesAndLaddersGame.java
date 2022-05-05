enum color {
    red,
    blue,
    green,
    yellow,
    orange
}

public class SnakesAndLaddersGame {
    private int lowest;
    private int higher;

    public SnakesAndLaddersGame(int lowest, int higher) {
        this.lowest = lowest;
        this.higher = higher;
    }

    public SnakesAndLaddersGame() {
        this(1, 6);
    }

    public int getLowest() {
        return lowest;
    }

    public int getHigher() {
        return higher;
    }

    public static void initializeGame() {
        Snake[] snakeboard = new Snake[101];
        Ladder[] ladderboard = new Ladder[101];
        int[] numbers = new int[2];
        int counter1 = 1;
        int counter2 = 1;
        System.out.println("Initializing the game...");
        String[] input = new String[2];
        String[][] players = new String[2][5];
        int i = 0;
        while ((input[0] != "end")) {
            input[0] = Main.scanner.nextLine();
            if (input[0] == "end") {
                break;
            }
            String[] helper = input[0].split(" ");
            convertSring(numbers, helper);
            if (helper[1] == "snake") {
                if (!Snake.LegalSnake(snakeboard[numbers[0]], snakeboard, ladderboard)) {
                    continue;
                }
                snakeboard[numbers[0]] = new Snake(numbers[0], numbers[1]);
            } else {
                if (helper[1] == "ladder") {

                    if (!Ladder.LegalLadder(ladderboard[numbers[0]], snakeboard, ladderboard)) {
                        continue;
                    }
                    ladderboard[numbers[1]] = new Ladder(numbers[0], numbers[1]);

                }

            }
        }


    }


    public static void convertSring(int[] numbers, String[] helper) {

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

