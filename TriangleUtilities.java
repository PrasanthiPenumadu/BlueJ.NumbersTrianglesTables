 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String x="";
        for(int i=0;i<numberOfStars;i++)
        x=x+"*";
        return x;
    }
    
    public static String getTriangle(int numberOfRows) {
        String x="";
        for(int i=0;i<numberOfRows;i++){
            for(int j=0;j<=i;j++){
            x=x+"*";
            }x=x+"\n";
        }
        System.out.println(x);
        return x;
    }


    public static String getSmallTriangle() {
        String x="";
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
            x=x+"*";
            }x=x+"\n";
        }
        System.out.println(x);
        return x;
    }

    public static String getLargeTriangle() {
        String x="";
        for(int i=0;i<9;i++){
            for(int j=0;j<=i;j++){
            x=x+"*";
            }x=x+"\n";
        }
        System.out.println(x);
        return x;
    }
}
