package nyc.c4q;

/**
 * Created by Millochka on 1/22/17.
 */
public class Linked_List {
    public static void main(String[] args) {

        Node list = new Node("Apple");
        list.next = new Node("Orange");
        list.next.next = new Node("Banana");
        list.next.next.next = new Node("Carrot");
        list.next.next.next.next = new Node("Beet");
        System.out.print(searchLinkedList(list, "Pear"));


    }

   public static int listLength(Node list){

       int count=0;
       Node currentNode = list;


       while (currentNode!=null){

           currentNode=currentNode.next;
           count ++;

       }



       return count;

    }

    public static boolean searchLinkedList(Node list, Object target){
        Node currentNode = list;
        boolean result = false;

        while (currentNode!=null){

            if(list.value.equals(target)){
                return !result;
            }
            currentNode=currentNode.next;


        }

        return result;


    }


}
