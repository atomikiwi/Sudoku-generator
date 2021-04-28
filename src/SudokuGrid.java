public class SudokuGrid {
    private int[][] data;

    public SudokuGrid() {
        //grille principale
        int modif = 0;
        int[][] mainGrid = new int[9][];
        for (int i = 0; i<9; i++) {
            int[] smallGrid = new int[9];
            for (int j = 1; j<=9; j++) {
                smallGrid[j-1] = j+modif;
                modif++;
                if(modif == 9) {
                    modif = 0;
                }
            }
            mainGrid[i] = smallGrid;
        }
        this.data = mainGrid;
    }

    public void Print() {
        System.out.println("-----------" + "|" + "-----------" + "|" + "-----------");
        for(int i = 0; i < 9; i = i+3) {
            for(int j = 0; j<9; j = j+3) {
                System.out.println(" " + this.data[i][j] + " | " + this.data[i][j+1] + " | " + this.data[i][j+2] + " |" +
                        " " + this.data[i+1][j] + " | " + this.data[i+1][j+1] + " | " + this.data[i+1][j+2] + " |" +
                        " " + this.data[i+2][j] + " | " + this.data[i+2][j+1] + " | " + this.data[i+2][j+2] + " ");
            }
            System.out.println("-----------" + "|" + "-----------" + "|" + "-----------");
        }
    }
}
