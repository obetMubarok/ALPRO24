package HASH;
class Myhash{
    int array[];
    int maxSize;

    public Myhash(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
    }
    
    public int hashFunction(int key){
        return key%maxSize;
    }
    public void insert(int key){
        int index = hashFunction(key);
        while(array[index] !=0)
            index++;
        array[index] = key;
    }
    public boolean find(int key){
        int index = hashFunction(key);
        while(array[index] != key){
            index++;
            if(array[index] == 0)
                break;
        }
        return (array[index] == key);
    }
}
public class DemoHash {
    public static void main(String[] args) {
        Myhash my = new Myhash(10);
        my.insert(20);//0
        my.insert(40);//1
        my.insert(10);//2
        
        System.out.println(my.find(100));
    }
}
