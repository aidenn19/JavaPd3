class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // This example we are substituting all lower case 
    // letters to another lower case letter.
    char[] sub = new char[5];
    sub[0] = 'a';
    sub[1] = 'e';
    sub[2] = 'i';
    sub[3] = 'o';
    sub[4] = 'u';

    char[] sub2 = new char[5];
    sub2[0] = '\u2663';  // Club
    sub2[1] = '\u2660';  // Spade
    sub2[2] = '\u2665';  // Heart
    sub2[3] = '\u2666';  // Diamond
    sub2[4] = '\u2836';  // Bralle symbol

    
    // Encoding message
    String file = Input.readFile("test.txt");

    //substituion
    String encodedMsg1 = subEncryption(file,sub,sub2);
    Input.writeFile("Encode1.txt",encodedMsg1);

    // caesar cipher
    String encodedMsg2 = encode(encodedMsg1);
    Input.writeFile("Encode2.txt",encodedMsg2);

    // reverse
    String encodedMsg3 = reverse(encodedMsg2);
    Input.writeFile("Encode3.txt",encodedMsg3);

    
    // decoding message
    //String file2 = Input.readFile("Encode1.txt");
    
   
    //String decodedMsg2 = decode(decodedMsg1);
    //Input.writeFile("Decode2.txt", decodedMsg2);
    
    // String decodedMsg3 = subEncryption(decodedMsg2, sub2, sub);
    //Input.writeFile("Decode1.txt", decodedMsg3);
    
    
  }

// Level 1 reverse string
 String reverse(String txt){
    String bld ="";
    for(int x=0; x<= txt.length()-1; x++){
      bld = txt.charAt(x) + bld;
      print(bld);
      String decodedMsg1 = reverse( "Encode3.txt");
    Input.writeFile("Decode1.txt", decodedMsg1);
    
    }
    return bld;
  }


  
  
 
 //Level 2 Cipher encoding 
String encode(String txt){
  String bld="";
  int[] pattern = {3,5,7,5,3};
  int p = 0;

  for(int i=0;i<txt.length();i++){
    char c = txt.charAt(i);
    if(c >= 'a' && c <= 'z'){
      c = (char)(c + pattern[p]);
      p = (p + 1) % pattern.length;
      String encodedMsg2 = encode("Encode3.txt");
    Input.writeFile("Encode2.txt",encodedMsg2);
    }
    bld += c;
  }
  return bld;
}


  
  String decode(String txt){
    String bld="";
   
    return bld;
  }

 
  // Level 3 Substituion encoding
String subEncryption(String s, char[] sub, char[] sub2){
  String bld="";
  
  for(int i=0;i<s.length();i++){
    char c = s.charAt(i);
    boolean replaced = false;
     String encodedMsg1 = subEncryption("Encode3.txt",sub,sub2);
    Input.writeFile("Encode3.txt",encodedMsg1);

    for(int j=0;j<sub.length;j++){
      if(c == sub[j]){
        bld += sub2[j];
        replaced = true;
        break;
      }
    }

    if(!replaced){
      bld += c;
    }
  }
  return bld;
}


  }

