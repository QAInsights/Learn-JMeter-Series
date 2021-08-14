// This script converts date time format to current time in milliseconds

import java.text.SimpleDateFormat

// date time format in string
String myDate = "2021-08-25T06:00:03Z";

// defining simple date format
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-DD-MM'T'hh:mm:ss'Z'");

// parsing the date time
Date date = sdf.parse(myDate);

// getting time in milliseconds for a given date time
long millis = date.getTime();
println("Time in milliseconds for a given input: " + millis)

// getting current time in milliseconds
def now = System.currentTimeMillis()
println("Current time in milliseconds: " + now)

// printing the difference
println("The difference is: " + now-millis)
