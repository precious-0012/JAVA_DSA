public class SeriesSum{
    static int seriesSum(int n){
        //base case
        if(n==0){
            return 0;
        }
        //recursive work with self work
        if(n%2==0){
            return seriesSum(n-1)-n;
        }else{}    
        return seriesSum(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}