package project7;

/**
 *
 * @author olamemuliri
 */
public class Utilities {
    
    
    public static long recursiveFib(int n){
        
        if (n <= 2)
            return 1;
        else
            return recursiveFib(n-1) + recursiveFib (n-2);
    }
    
    
    public static long iterativeFib(int n){
        
        long retainedVal;
        
        if (n <= 2) 
        {
            retainedVal = 1;
        }
        
        else {
            long olderValue = 1;
            long oldValue = 1;
            long newValue = 1;
            
            for (int i = 3; i <= n; i++) {
                newValue = oldValue + olderValue;
                olderValue = oldValue;
                oldValue = newValue;
            }
            retainedVal = newValue;
        }
        return retainedVal;
        
    }
    
}
