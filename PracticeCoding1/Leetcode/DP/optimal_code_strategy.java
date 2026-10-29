public class optimal_code_strategy {
    public static void main(String[] args){
    int[] arr = {1,2,3,4};
    System.out.println(optimal_game(arr,0,arr.length-1));
}
    private static  int optimal_game(int[] arr , int i  , int j ){
        if(i>=j){
            return 0;
        }
        if(i+1==j){
            return Math.max(arr[i], arr[j]);
        }
        int x = arr[i] + Math.min(optimal_game(arr , i+2,j),optimal_game(arr,i+1,j-1));
        int y = arr[j] + Math.min(optimal_game(arr, i+1,j-1), optimal_game(arr,i,j-2));
        return Math.max(x,y);
    }
}
