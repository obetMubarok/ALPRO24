package BST;
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

class MyBST{
    Node root;
    public void insert(int key){
        Node newNode = new Node(key);
        if(root == null){//jika BST kosong
            root = newNode;
        }else{//jika BST berisi
            Node current = root;
            while(true){
                if(key> current.data){
                    if(current.right == null){
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }else{
                    if(current.left == null){
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                }
            }
        }
    }
    public boolean find(int data){
            Node current = root;
            boolean result = false;
            while(current !=null){
                if(data == current.data){//jika ketemu
                    result = true;
                    break;
                }
                else if(data > current.data){
                    current = current.right;//belok kanan
                }else{
                    current = current.left;//belok kiri
                }
            }
            return result;
        }
}

public class DemoBST {
    public static void main(String[] args) {
        MyBST my = new MyBST();
        my.insert(50);
        my.insert(60);
        my.insert(20);
        
        System.out.println(my.find(60));
    }
}
