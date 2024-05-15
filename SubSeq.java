//Print all the subsequences of a string 

public class SubSeq {
    public static void printSubSeq(String str, int idx, String res){
        if(idx==str.length()){
            System.out.println(res);
            return;
        }

        //choose
        printSubSeq(str, idx+1, res+str.charAt(idx));

        //don't choose
        printSubSeq(str, idx+1, res);
    }
    public static void main(String[] args) {
        String str1 = "abc";
        printSubSeq(str1, 0, " ");
    }
}
