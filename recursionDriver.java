public class RecursionDriver {
    public static void main(String[] args) {
        int c = counted(9);
        System.out.println(c);
        }
        
        public static int counted(int n) {
        if (n<=0) 
            return 0;
        if (n%2==0)
            return n+counted(n-2);
        if (n%2==1){
            n-=1;
            return n+counted(n-2);
        }            

            return 0;
    }
}