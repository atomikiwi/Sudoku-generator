public class MainApp {
    public static void main(String[] args) {
        long initTime = java.lang.System.currentTimeMillis();
        SudokuGrid testing = new SudokuGrid();
        testing.print();
        System.out.println("Le programme s'est executé en " + (java.lang.System.currentTimeMillis() - initTime) + "ms." );
    }
}
