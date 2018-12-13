//part (a)
public String decodeString(ArrayList<StringPart> parts){
    String temp = "";
    for( int i = 0, i< parts.size(), i++){
      int start = parts.get(i).getStart();
      int length = parts.get(i).getLength(); 
      temp += masterString.substring( start, start + length);
      }
    }
    return temp;
 // part (b)
 
public ArrayList<StringPart> encodeString(String word){
    ArrayList<StringPart> parts = new ArrayList<StringPart>();
    String temp = word:
    while( temp.length() != 0){
        StringParts n = findPart(word);
        parts.add(n);
        temp = temp.substring(n.getLength()); 
    return parts;
 }
