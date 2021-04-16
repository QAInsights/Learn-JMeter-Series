int total_occurence = vars.get("var2_matchNr") as int // Finds the total number of occurence from the regex

for (int i=1;i < total_occurence ;i++){
	def p = "var2_" + i	
	println vars.get(p) //Check the terminal/command output for the message
}
