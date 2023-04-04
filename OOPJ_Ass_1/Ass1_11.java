public class Ass1_11 {
    public static void main(String[] args) {
      char a=args[0].charAt(0);
       int b = (int)a;
       char [] arr= new char[1];
       arr[0]=args[0].charAt(0); 
          if(b>=48 && b<57){
              for(int i=48;i<57;i++){
                  if(b==i){
                      System.out.println(i);
                      System.out.println(Character.codePointAt(arr, 0));
                  }
              }
      }
      if(a>=65 && a<=122){
         if (Character.isLowerCase(arr[0])){
          System.out.println(Character.toUpperCase(arr[0]));
          System.out.println(Character.codePointAt(arr, 0));
          
         }
         if (Character.isUpperCase(arr[0])){
          System.out.println(Character.toLowerCase(arr[0]));
          System.out.println(Character.codePointAt(arr, 0));
          
         }
      }
    }  
  }
