 
 class Array{
    public static void main(String args[]){
      // 宣言して代入するパターン
      //   String[] arr;
      //         arr = new String[3];
       
      //          arr[0] = "sato";
      //          arr[1] = "ssuzuki";
      //          arr[2] = "takahasi";
       
      //          System.out.println(arr[0]);
      //          System.out.println(arr[1]);
      //          System.out.println(arr[2]);

      // 宣言代入同時パターン
      // String[] arr = {"sato","suzuki","tanaka"};

      // System.out.println(arr[0]);
      // System.out.println(arr[1]);
      // System.out.println(arr[2]);

      // 多次元配列
         String[][] arr;
         arr = new String[2][2];
         // String[][] arr = {{"kinjyo","simizu"},{"yamazato","gima"}} 省略VER。
         arr[0][0] = "kinjyo";
         arr[0][1] = "simizu";
         arr[1][0] = "yamazato";
         arr[1][1] = "gima";

         System.out.println(arr[0][0]);
         System.out.println(arr[0][1]);
         System.out.println(arr[1][0]);
         System.out.println(arr[1][1]);
         
    }
 }