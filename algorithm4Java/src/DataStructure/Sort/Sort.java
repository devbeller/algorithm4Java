package DataStructure.Sort;

public class Sort implements SortInterface {
    @Override
    public void insertSort() {

    }

    @Override
    public void shellSort() {

    }

    @Override
    public void BubbleSort(int arr[]) {
        int temp;
        //外层循环控制趟数
        for (int i=arr.length -1;i>0 ;i--){
            //内层循环控制每一趟内的交换
            for (int j= 0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /*
      减少数据交换的冒泡排序
     */
    @Override
    public void SpuerBubbleSortSpuer(int[] arr) {

    }

    @Override
    public void quickSort(int first, int end) {

    }

    @Override
    public void selectSort() {

    }

    @Override
    public void heapSort() {

    }

    @Override
    public void mergeWithRecursiveSort() {

    }

    @Override
    public void mergeNoRecursiveSort() {

    }

    @Override
    public void SortResultPrint() {

    }
}
