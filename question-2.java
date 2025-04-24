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
     * Complete the 'preprocessDate' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY dates as parameter.
     */

    public static List<String> preprocessDate(List<String> dates) {
        return dates.stream()
            .map(Result::convertDate)
            .collect(Collectors.toList());
    }
    
    public static String convertDate(String date){
        Map<String, String> monthMapping = Map.ofEntries(
            Map.entry("Jan", "01"),
            Map.entry("Feb", "02"),
            Map.entry("Mar", "03"),
            Map.entry("Apr", "04"),
            Map.entry("May", "05"),
            Map.entry("Jun", "06"),
            Map.entry("Jul", "07"),
            Map.entry("Aug", "08"),
            Map.entry("Sep", "09"),
            Map.entry("Oct", "10"),
            Map.entry("Nov", "11"),
            Map.entry("Dec", "12")
        );
        
        String[] separatedDate = date.split(" ");
        String cleanDay = separatedDate[0].replaceAll("[^0-9]", "");
        if (cleanDay.length() == 1) {
            cleanDay = "0" + cleanDay;
        }
        String month = monthMapping.get(separatedDate[1]);
        String year = separatedDate[2];
        
        return year + "-" + month + "-" + cleanDay;
    }

}