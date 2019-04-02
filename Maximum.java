
public class Maximum {
   static int greatest(int a[]){
        int g=a[0];
        for(int m:a){
            if(m>g){
                g=m;
            }
        }
        return g;
    }
    public static void main(String[] args) {
        int a[]={5,61,2,3,9,7};
       int b= greatest(a);
        System.out.println("Greatest value : "+b);
        
        int d[]={5,6,2};
       int c= greatest(d);
        System.out.println("Greatest value : "+c);
    }
}
