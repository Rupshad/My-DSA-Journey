class SelectionSort{
    public void select(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }


    } 
    public static void main(String[] args) {
    SelectionSort s = new SelectionSort();
    int[] arr = {5, 3, 2, 4, 1};

    s.select(arr);

    for (int num : arr) {
        System.out.print(num + " ");
    }
}
}