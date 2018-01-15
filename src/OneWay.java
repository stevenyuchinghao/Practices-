public class OneWay {
    public static boolean checkOneWay(String string1, String string2){
        // check the length
        if(string1.length() > string2.length()+2 || string1.length() < string2.length()-2){
            return false;
        }
        else if(string1.length()-string2.length() == 1){ //deletion
            int j=0;
            for(int i=0; i<string2.length(); i++){
                if(string2.charAt(i)!=string1.charAt(i+j)){
                    j=j+1;
                    if(string2.charAt(i)!=string1.charAt(i+j) || j>1){
                        return false;
                    }
                }
            }
        }
        else if(string1.length()-string2.length() == -1) { //insertion
            int j=0;
            for(int i=0; i<string1.length(); i++){
                if(string1.charAt(i)!=string2.charAt(i+j)){
                    j=j+1;
                    if(string1.charAt(i)!=string2.charAt(i+j) || j>1){
                        return false;
                    }
                }
            }
        }
        else if(string1.length() == string2.length()) { //replacement
            int j=0;
            for(int i=0; i<string1.length()-1; i++){
                if(string1.charAt(i+j)!=string2.charAt(i+j)){
                    j=j+1;
                    if(string2.charAt(i+j)!=string1.charAt(i+j) || j>1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[]args) {
        System.out.print(checkOneWay("pale","ple"));
        System.out.print(checkOneWay("pales","pale"));
        System.out.print(checkOneWay("pale","bale"));
        System.out.print(checkOneWay("pale","bake"));

    }
}
