public class Functions{
	public static void main(String agrs[]) {
String firstName ="Saran";
String lastName ="Sanjay";
String thirdName ="Saran Sanjay";
String fourthName ="      Saran Sanjay      ";
String result;
char secondResult;
boolean thirdResult;
int fourthResult;
String[] fifthResult;
char[] sixthResult;
//Concatenate Function
result = firstName.concat(lastName);
System.out.println(result);
result = firstName.concat("Sanjay");
System.out.println(result);
//CharAt Function
secondResult =firstName.charAt(2);
System.out.println(secondResult);
//Contain Function
thirdResult =firstName.contains("ran");
System.out.println(thirdResult);
thirdResult =lastName.contains("ran");
System.out.println(thirdResult);
//EndsWith Function
thirdResult= firstName.endsWith("aran");
System.out.println(thirdResult);
thirdResult= firstName.endsWith("Sara");
System.out.println(thirdResult);
//Equals Function
thirdResult=firstName.equals("Saran");
System.out.println(thirdResult);
thirdResult=firstName.equals(lastName);
System.out.println(thirdResult);
//IsEmpty Function
thirdResult = firstName.isEmpty();
System.out.println(thirdResult);
//IndexOf Function
fourthResult = firstName.indexOf("a");
System.out.println(fourthResult);
fourthResult = firstName.indexOf("a",2);
System.out.println(fourthResult);
fourthResult = thirdName.indexOf("a");
System.out.println(fourthResult);
//LastIndexOf Function
fourthResult = thirdName.lastIndexOf("a");
System.out.println(fourthResult);
//Length Function
fourthResult = thirdName.length();
System.out.println(fourthResult);
fourthResult = lastName.length();
System.out.println(fourthResult);
//Replace Function
result = firstName.replace(firstName, lastName);
System.out.println(result);
result = firstName.replace(firstName, thirdName );
System.out.println(result);
//Split Function
fifthResult = thirdName.split(" ");
for (String a : fifthResult) 
    System.out.println(a);
//SubString Function
result = firstName.substring(1,4);
System.out.println(result);
result = thirdName.substring(0,5);
System.out.println(result);
//ToCharArray Function
sixthResult = firstName.toCharArray();
System.out.println(sixthResult[0]);
//ToLowerCase Function
result = firstName.toLowerCase();
System.out.println(result);
//ToUpperCase Function
result = firstName.toUpperCase();
System.out.println(result);
//trim
result = fourthName .trim();
System.out.println(result);










	}
}
