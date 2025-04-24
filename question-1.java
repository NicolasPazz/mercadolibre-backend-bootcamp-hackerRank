import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMinFlips' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING pwd as parameter.
     */

    public static int getMinFlips(String pwd) {
    // Write your code here
        int pwdLength = pwd.length();
        int changes = 0;
        
        for (int i = 0; i < pwdLength; i+=2){
            String evenSubString = pwd.substring(i,i+2);
            
            if (!evenSubString.equals("00") && !evenSubString.equals("11")) {
                changes += 1;
            }
        }
        return changes;
    }
    

}