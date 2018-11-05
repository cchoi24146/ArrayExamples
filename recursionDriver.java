public class recursionDriver {
    public static void main(String[] args) {
        int c = counted(9);
        System.out.println(c);
        }
        public static int counted(int n) {
            if (n==0) 
            return 0;
            else if(n%2==0)
            return n-1;
            
            return n+counted(n-1);
    }
}