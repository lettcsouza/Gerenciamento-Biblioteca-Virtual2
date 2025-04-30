class BubbleSort {

    public static int comparacoes = 0;

    public static String[] order(String[] oldArr){
        comparacoes = 0;
        String[] arr = oldArr.clone();
        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                comparacoes++;
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

