// This script converts 12hr time format to 24 hr format

import java.text.DateFormat
import java.text.SimpleDateFormat

String input = "10:22 PM";
DateFormat inputFormat = new SimpleDateFormat("hh:mm aa");
DateFormat outputformat = new SimpleDateFormat("HH:mm");
Date date;
String output;

try{
    date = inputFormat.parse(input);
    output = outputformat.format(date);
    System.out.println("The 24hr output is: " + output);
}
catch (Exception e){
    println(e.stackTrace);
}

