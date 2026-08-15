public class bittodecimal {
    public static void main(String[] args){
    int arr[]={1,0,1};
    int decimal=0;
    for(int i=0;i<arr.length;i++){
        decimal=decimal*2+arr[i];
    }
    System.out.print(decimal);
    }

}
