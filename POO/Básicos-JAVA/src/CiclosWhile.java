public class CiclosWhile {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i ++;
            if ( i % 2 == 0 ) {
                System.out.print(i + "-");
                if (i == 100){
                    break;
                }
            }
        }
    }
}

