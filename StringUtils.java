class StringUtils{
  static boolean containsChar(String word, char letter){
    for(int i = 0; i < word.length(); i++){
      if(word.charAt(i) == letter){
        return true;
      }
    }

    return false;
  }

  static String reverse(String word){
  String reversedString = "";

   for(int i = 0; i < word.length(); i++){
     reversedString = word.charAt(i) + reversedString;
    }

    return reversedString;
  }

  static String replaceAll(String word, char target, char value){
  String replacedString = "";

   for(int i = 0; i < word.length(); i++){
    if(word.charAt(i) == target){
      replacedString += value;
      continue;
    }

     replacedString += word.charAt(i);
    }

    return replacedString;
  }


}