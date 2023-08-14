public class XORProblems {
    public static void main(String[] args) {
        
        //Find only non repeating element in array where every element repeat twice
        int []a={5,4,1,4,3,5,1};
        int result=0;
        for (int i=0;i<a.length;i++){
            result=a[i]^result;
        }
        System.out.println(result);


    }
}
