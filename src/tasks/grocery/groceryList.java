package tasks.grocery;
//1. addGroceryItem
//2. printGroceryList
//3. removeGroceryItem
//4. modifyGroceryItem
//5. searchItem
import java.util.ArrayList;
import java.util.Scanner;
public class groceryList {
    //field
    private ArrayList<String> groceryList = new ArrayList<>();

    //adding a new item to the list
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    //print all list items
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        //to show all elements in my list
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //remove grocery item (we will remove by index)
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            groceryList.remove(position);
            System.out.println(item + " was deleted");
        }else{
            System.out.println("Item is not in the list");
        }

    }

    //modify grocery list item
    public void modifyGroceryItem(int position, String newItem){
        if ((position >= 0) && (position < groceryList.size())){
            groceryList.set(position, newItem);
            System.out.println("Grocery item was modified");
        }else {
            System.out.println("Items position is not valid");
        }
    }

    //search item in the list
    public boolean searchItem(String searchItem){
        return findItem(searchItem) >= 0;
    }

    //delete all items
    public void deleteAllItems(){
        groceryList.clear();
        System.out.println("All items in the list are deleted");
    }

    //method for returning items index
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

}
