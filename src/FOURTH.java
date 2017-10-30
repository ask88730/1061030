public class FOURTH {
    public static void main (String[] args){
        java.util.Scanner sc = new  java.util.Scanner(System.in);
        int a =sc.nextInt();
        int b = a/10;
        switch (b){
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("B");
                break;
            case 8:
                System.out.println("C");
               break;
            case 7:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }
    }
}
