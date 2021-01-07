package DataStructure.Sort;

public interface SortInterface {

    public void insertSort();                    //插入排序
    public void shellSort();                     //希尔排序
    //冒泡排序
    public void BubbleSort(int arr[]);
    //优化版的冒泡排序
    public void SpuerBubbleSortSpuer(int arr[]);
    public void quickSort(int first, int end);    //快速排序
    public void selectSort();                    //简单选择排序
    public void heapSort();                      //堆排序
    public void mergeWithRecursiveSort();        //归并排序递归
    public void mergeNoRecursiveSort();          //归并排序非递归算法
    public void SortResultPrint();               //输出序列

}
