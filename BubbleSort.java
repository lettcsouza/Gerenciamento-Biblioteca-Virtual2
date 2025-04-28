class BubbleSort {

    public static String[] order(String[] oldArr){
        String[] arr = oldArr.clone();
        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j].compareTo(arr[j + 1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
    
}

