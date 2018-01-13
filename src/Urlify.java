public class Urlify {
    public static String replaceSpaces(String str, int trueLength ){
        char[] str2 = str.toCharArray();
        int spaceCount  = 0, index, i = 0;
        for(i=0; i<trueLength; i++){
            if (str2[i] == ' '){
                spaceCount = spaceCount + 1;
            }
        }
        index = trueLength + spaceCount *2;
        char[] str3 = new char[index];
        if (trueLength < str2.length) str2[trueLength] = '\0';
        for(i = trueLength -1; i >=0; i--){
            System.out.println(i);
            if(str2[i]== ' '){
                str3[index -1] = '0';
                str3[index -2] = '2';
                str3[index -3] = '%';
                index = index - 3;
            }
            else{
                str3[index-1] = str2[i];
                index--;
            }
        }
        String string = String.valueOf(str3);
        return string;
    }

    public static void main(String[]args) {
        System.out.println(replaceSpaces("ab cd ee  ", 8));
    }
}
