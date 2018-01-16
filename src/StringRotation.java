public class StringRotation {
    public static boolean isRotation(String string1, String string2){
        if(string1.length() == string2.length() && string1.length() >0){
            String s1s1 = string1 + string1;
            return s1s1.toLowerCase().contains(string2.toLowerCase());
        }
        return false;

    }
    public static void main(String args[]){
        System.out.println(isRotation("waterbed","erbedwat"));
    }
}
