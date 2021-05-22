import java.util.Random;
import java.util.stream.IntStream;

public class SudokuGrid {
    private int[] randomRow = {0,0,0,0,0,0,0,0,0};
    private final Random rand;
    private int modif;
    private int[][] mainGrid;

    public SudokuGrid() {
        rand = new Random();
        modif = 1;
        randomiseRow();
        mainGrid = new int[9][];
        for (int i = 0; i<9; i++) {
            int[] smallGrid = new int[9];
            for (int j = 1; j<=9; j++) {
                int num = randomRow[j-1];
                int index = j + modif;
                while(index >=9) {
                    index = index - 9;
                }


                smallGrid[index] = num;
            }
            mainGrid[i] = smallGrid;
            modif = modif + 3;
            if(modif >=9) {
                modif = modif - 10;
            }
        }
    }

    private void randomiseRow() {
        for(int i = 0; i < 9; i++) {
            boolean seeding = true;
            do {
                int seed = this.rand.nextInt(9) + 1;
                if(!IntStream.of(this.randomRow).anyMatch(x -> x == seed)) {
                    this.randomRow[i] = seed;
                    seeding = false;
                }
            } while(seeding);

        }
    }

    public void print() {
        System.out.println("-----------" + "|" + "-----------" + "|" + "-----------");
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j<9; j++) {
                System.out.print(" " + this.mainGrid[i][j]);
                if(j == 8) {
                    System.out.println();
                } else {
                    System.out.print(" |");
                }
            }
            if(i == 2 || i == 5 || i == 8) {
                System.out.println("-----------" + "|" + "-----------" + "|" + "-----------");
            }
        }
    }
}
