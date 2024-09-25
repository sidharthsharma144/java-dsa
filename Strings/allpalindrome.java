import java.util.Scanner;
class allpalindrome {
    public static boolean checkPallindromicString(String substr){
        int left=0;
        int right=substr.length()-1;

        while(left<right){
            if(substr.charAt(left)!=substr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }return true;
    }
    
    public static void  allPallindromicString(String str){
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<=n;j++){
                String substr=str.substring(i,j);
                
                if(checkPallindromicString(substr) && substr.length()>1){
                   count=count+1;
                  
                }
            }
        }System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        allPallindromicString(str);;;
    }
}
