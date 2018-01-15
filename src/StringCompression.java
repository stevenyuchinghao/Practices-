public class StringCompression {

    public static String stringCompress(String string1){

        Character current = null;
        Integer count = 0;
        String compressedString = "";
        for(int i=0; i<string1.length(); i++){
            if(current == null) {
                current = string1.charAt(i);
                count = 1;
            }
            else if(string1.charAt(i) == current){ // when already repeated
                count = count + 1;
                if(i == string1.length()-1){
                    compressedString = compressedString + current + count;
                }
            }
            else if(string1.charAt(i) != current){
                compressedString = compressedString + current + count;
                current = string1.charAt(i);
                count = 1;
                if(i == string1.length()-1){
                    compressedString = compressedString + current + count;
                }
            }

        }
        if(compressedString.length() >= string1.length()){
            return string1;
        }
        else return compressedString;
    }



    public static void main(String[]args) {
        System.out.print(stringCompress("paleeeeee"));


    }
}
