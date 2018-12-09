//part (a)
public String decodeString(ArrayList<StringPart> parts){
    String temp = "";
    int start = 0;
    int length = 0;
    for( int i = 0, i< parts.size(), i++){
      start = parts.get(i).getStart();
      if( start != -1){
        length = parts.get(i).getLength(); 
        temp = masterString.substring( start, start + length);
      }
    }
    return temp;
 // part (b)
 public ArrayList<StringPart> encodeString(String word){
    ArrayList<StringPart> parts = new ArrayList<StringPart>();
    String temp = "":
    for(int i =0; i< word.length; i++){
      temp = word.substring(i,i+1);
      parts.add( masterString.findPart( temp));
    }
    return parts;
 }
