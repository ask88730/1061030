public class mynewshit {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("輸入數字");
        int a = sc.nextInt();

        if ((a > 100) || (a<0))
             {
                System.out.println("輸入錯誤:" + a);
            }
        else {
            if (a < 60)
            {
                    System.out.println("不及格" + a);
                }
                else
                    {
                    System.out.println("恭喜過關唷:" + a);
                }
            }


    }
}

