import java.util.*;


import java.io.*;

public class ReadFile extends StudentGPA
{
	private static  String name;
    private static  int id;
    private static  Double gpa;
    public Double getGpa() {
        return gpa;}
public ReadFile(int id, String name, double gpa) {
		super(id, name, gpa);
		// TODO Auto-generated constructor stub
	}

public static void main(String args[])throws IOException{
String content = new String();
int count=1;
File file = new File("students.in");
LinkedList<String> list = new LinkedList<String>();

 try {Scanner sc = new Scanner(new FileInputStream(file));
 while (sc.hasNextLine()){
	 content = sc.nextLine();
	 list.add(content);
	 StringBuffer sb = new StringBuffer();
	 for(int i=0; i<content.length(); i++)
	    {
	        if(Character.isDigit(content.charAt(i)))
	            sb.append(content.charAt(i));
	    }
	 }
	 sc.close();

	
 
}catch(FileNotFoundException fnf){
fnf.printStackTrace();
}
catch (Exception e) {
e.printStackTrace();
System.out.println("\nProgram terminated Safely...");
}


Iterator i = list.iterator();
while (i.hasNext()) {
System.out.print("Node " + (count++) + " : ");
System.out.println(i.next());
}
 }

 }