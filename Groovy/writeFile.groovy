/*
  Write text to a file
*/

def myDir = System.getProperty("user.dir")
def myFile = "\\testdata.txt"
print(myDir)

File fileName = new File(myDir + myFile)
fileName.write("test");
