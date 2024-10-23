package SORTING;
class SimpleSort{
    int[] array;
    int size;
    int nItem = 0;

    public SimpleSort(int size) {//digunakan memberikan nilai var class
        this.size = size;
        array = new int[size];
    }
    
    public void insert(int newData){
        array[nItem++] = newData;
    }
    public void swap(int indexX, int indexY){
        int temp = array[indexX];
        array[indexX] = array[indexY];
        array[indexY] = temp;
    }
    public void display(){
        for(int i=0; i<nItem;i++){
            System.out.print(array[i]+" ");
        }
    }
    public void bubbleSort(){
        for(int j=size-1; j>0; j--){
        for(int i=0; i<j;i++){
            if(array[i]>array[i+1]){
                swap(i,i+1);
            }
        }
        }
    }
    public void selectionSort(){
        int start = 0;
        int max;
        for(int i=size-1; i>0; i--){
            max = i;
            for(int j=i; j>=0; j--){
                if(array[j] > array[max])
                    max = j;
            }
            swap(i, max);
            System.out.print((++start)+" : ");
            display();
            System.out.println("");
        }
        
    }
    public void insertionSort(){
        int temp, i, j;
        for(i=1; i<nItem; i++){
            temp = array[i];
            for(j=i; j>0; j--){
                if(array[j-1]>temp){
                    array[j] = array[j-1];//geser ke kanan
                }else{
                    break;
                }
            }
            array[j] = temp;
        }
    }
    public void quickSort(int low, int hight){
        if(low < hight){
        int pi = partition(low, hight);
        quickSort(low, pi-1);
        quickSort(pi+1, hight);
        }
    }
    public int partition(int low, int hight){
        int pivot = array[hight];
        int swpIndex = low;
        for(int i=low; i<hight; i++){
            if(array[i] < pivot){
                swap(swpIndex, i);
                swpIndex++;
            }
        }
        swap(swpIndex,hight);
        return swpIndex;
    }
    
}
public class DemoSorting {
    public static void main(String[] args) {
        SimpleSort ss = new SimpleSort(10);
        ss.insert(20);//0
        ss.insert(100);//1
        ss.insert(50);
        ss.insert(40);
        ss.insert(30);
        ss.insert(90);
        ss.insert(10);
        ss.insert(60);
        ss.insert(80);
        ss.insert(70);//9
        
        ss.quickSort(0, 9);
        ss.display();
        
        
    }
}
