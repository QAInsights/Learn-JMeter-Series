@Grapes([
    @Grab(group='com.google.code.gson', module='gson', version='2.9.0'),
    @Grab(group='org.json', module='json', version='20220320')
])

import com.google.gson.Gson; 
import com.google.gson.GsonBuilder; 
import org.json.JSONObject;

class PerformanceTestingTool {
    public String name;
    public boolean opensource;

    PerformanceTestingTool (String name, boolean opensource) {
        this.name = name;
        this.opensource = opensource;
    }
    PerformanceTestingTool(){
    }
}

PerformanceTestingTool javaBased = new PerformanceTestingTool();
javaBased.name = "JMeter";
javaBased.opensource = true;

GsonBuilder gsonBuilder = new GsonBuilder();
Gson gson = gsonBuilder
	 .setPrettyPrinting()
	 .disableHtmlEscaping()
	 .create();

// Converting a Java object into JSON
log.info gson.toJson(javaBased);

// Converting JSON into Java object
JSONObject tools = new JSONObject();
tools.put("name","Locust");
tools.put("opensource", true);

PerformanceTestingTool pythonBased = gson.fromJson(String.valueOf(tools), PerformanceTestingTool.class);

log.info pythonBased.name + "-" + pythonBased.opensource;

// Converting back to JSON
log.info gson.toJson(pythonBased);
