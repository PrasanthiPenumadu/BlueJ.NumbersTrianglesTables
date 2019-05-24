 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String x="";
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
            x=x+String.format("%3d |",i*j);
        }x=x+"\n";
        
    }
        
        System.out.println(x);
        return x;
        
    }

    public static String getLargeMultiplicationTable() {
        String x="";
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
          x=x+String.format("%3d |",i*j);
        }x=x+"\n";
        
    }
        
        System.out.println(x);
        return x;
    }

    public static String getMultiplicationTable(int tableSize) {
        String x="";
        for(int i=1;i<=tableSize;i++){
            for(int j=1;j<=tableSize;j++){
            x=x+String.format("%3d |",i*j);
        }x=x+"\n";
        
    }
        
        System.out.println(x);
        return x;
    }
}
