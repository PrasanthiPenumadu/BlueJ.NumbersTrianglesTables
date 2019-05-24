


public class NumberUtilities {

    public static String getRange(int stop) {
         String x="";
        for(int i=0;i<stop;i++){
            x=x+i;
        }
        return x;
        
    }

    public static String getRange(int start, int stop) {
        String x="";
        for(int i=start;i<stop;i++){
            x=x+i;
        }
        return x;
    }


    public static String getRange(int start, int stop, int step) {
         String x="";
        for(int i=start;i<stop;i=i+step){
            x=x+i;
        }
        return x;
    }

    public static String getEvenNumbers(int start, int stop) {
         String x="";
        for(int i=start;i<stop;i++){
            if(i%2==0){
            x=x+i;
        }
       
    } return x;

}
    public static String getOddNumbers(int start, int stop) {
         String x="";
        for(int i=start;i<stop;i++){
            if(i%2==1){
            x=x+i;}
        }
        return x;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
         String x="";
        for(int i=start;i<=stop;i++){
            
          double y=Math.pow(i,exponent);
           int z=(int)y;
            x=x+z;
        }
        System.out.println(x);
        return x; 
    }
}
