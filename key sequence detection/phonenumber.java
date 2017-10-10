// not compiling just yet...

import java.util.Scanner;
public class Phonenumber{
  public static void main(String arg[]){
    Scanner userInput = new Scanner(System.in);
    System.out.print("enter input");
    String phoneLetter = userInput.next().toLowerCase();
    String phoneNumber = "";
  }
  for(int i = 0; i<=9; i++){
    if(phoneLetter.charAt(i) == 'a' || phoneLetter.charAt(i) == 'b' || phoneLetter.charAt(i) == 'c'){
      phoneNumber += '2';
    } else if(phoneLetter.charAt(i) == 'd' || phoneLetter.charAt(i) == 'e' || phoneLetter.charAt(i) == 'f'){
      phoneNumber += '3';)
    }
    else if(phoneLetter.charAt(i) == 'g' || phoneLetter.charAt(i) == 'h' || phoneLetter.charAt(i) == 'i'){
      phoneNumber += '4';)
    }
    else if(phoneLetter.charAt(i) == 'j' || phoneLetter.charAt(i) == 'k' || phoneLetter.charAt(i) == 'l'){
      phoneNumber += '5';)
    }
    else if(phoneLetter.charAt(i) == 'm' || phoneLetter.charAt(i) == 'n' || phoneLetter.charAt(i) == 'o'){
      phoneNumber += '6';)
    }
    else if(phoneLetter.charAt(i) == 'p' || phoneLetter.charAt(i) == 'q' || phoneLetter.charAt(i) == 'r'){
      phoneNumber += '7';)
    }
    else if(phoneLetter.charAt(i) == 's' || phoneLetter.charAt(i) == 't' || phoneLetter.charAt(i) == 'u'){
      phoneNumber += '8';)
    }
    else if(phoneLetter.charAt(i) == 'v' || phoneLetter.charAt(i) == 'w' || phoneLetter.charAt(i) == 'x'){
      phoneNumber += '9';)
    }
    else if(phoneLetter.charAt(i) == 'y' || phoneLetter.charAt(i) == 'z'){
      phoneNumber += '0';)
    }
  }

else{
  System.out.print('invalid num');
  System.exit();
}

String first = phoneNumber.substring(0,2);
String second = phoneNumber.substring(3,5);
String last = phoneNumber.substring(6,9);
String final = '('+first+')+'second'+'last')';
System.out.print(final);

}
}
