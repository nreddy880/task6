package t6;

public class Collection {
	public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList<Integer>();
 
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List after addition of elements:");
        System.out.println(list);
         
        //Remove elements from index
        list.remove(2);
        System.out.println("List after remove:");
        System.out.println(list);
         
        //Get element with index
        System.out.println("List values at particular indexes:");
        System.out.println(list.get(0) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println("Size of list:");
        System.out.println(list.size());
    }
}


