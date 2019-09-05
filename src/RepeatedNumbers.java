public class RepeatedNumbers {
    public static void main(String [] args){
        for(int i=1; i<=9; i++){
            for(int repeat=1; repeat<=i; repeat++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
