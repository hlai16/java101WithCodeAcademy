public class StringMethods {
    public static void main(String[] args) {
      String str = "Hello World!";
      System.out.println(str.length()); 
  
      String name = "Code";
  name = name.concat("cademy");
      System.out.println(name); 
  
      String flavor1 = "Mango";
      String flavor2 = "Matcha";
      System.out.println(flavor1.equals(flavor2)); 
  
      String letters = "ABCDEFGHIJKLMN";
      System.out.println(letters.indexOf("C")); 
      System.out.println(letters.indexOf("EFG")); 
  
      String currency = "Yen";
      System.out.println(currency.charAt(2)); 
  
      String line = "It was the best of times, it was the worst of times.";
      System.out.println(line.substring(26)); 
      System.out.println(line.substring(7, 24)); 
  
      String input = "Cricket!";
      System.out.println(input.toUpperCase());
      System.out.println(input.toLowerCase()); 
  
    }
  }