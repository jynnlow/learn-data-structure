public class JumpingCloud {
  public static void main(String[] args) throws Exception {
    int[] clouds = {0,0,1,0,0,1,0};
    int[] clouds1 = {0,0,0,1,0,0};
    int result = jumpingCloud(clouds1);
    System.out.println(result);
  }

  public static int jumpingCloud(int[] c) {
    int minJump = 0;
    for ( int i = 0; i < c.length; i++){
        if(i < (c.length - 2)) {
            if (c[i+2] == 0){
                minJump++;
                i += 1;
            }else{
                minJump++;
            }
        }else if(i == c.length -2) {
            if (c[i+1] == 0) {
                minJump++;
            }       
        }
    }
    return minJump;
  }
}
