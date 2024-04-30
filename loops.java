public class loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i);
                System.out.print("---");
                System.out.print(j);
                System.out.println();
            }
        }
        String[][] fruits = {{"mango", "orange"}, {"pearl", "kachew"}};
        Integer [][] twoD = new Integer[2][3];
        for (int i = 0; i < 2; i++) {
            String[] singleDim = fruits[i];
            for (int j = 0; j < 3; j++) {
                twoD[i][j] = j;
                System.out.println(j);
            }
        }
    }
}
