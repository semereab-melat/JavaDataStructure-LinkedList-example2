
import java.util.*;
class Main {
  public static void main(String[] args) {
    
    //Complete Q2 here

        List<String> StrList = new LinkedList<String>(Arrays.asList("Mary", "John", "Shane", "Seamus", "James"));
        //Create a sublist of StrList from index 1 to index 4
        List<String> subList = new LinkedList<String>();
        //Collections.copy(subList, StrList);
        subList = StrList.subList(1, 4);
        System.out.println("Orginal list of Strings:\n" + StrList);
        System.out.println("The sublist from index 1 to 4:\n" + subList);

        //Reverse StrList
        Collections.reverse(StrList);
        System.out.println("List after reversing\n" + StrList);
        //Sort the list

        Collections.sort(StrList);
        System.out.println("List after sorting:\n" + StrList);
        //Create a list of strings called CopyStrList and Copy the contents of StrList into CopyStrList

        //I use clone();
        LinkedList CopyStrList = new LinkedList();
        CopyStrList = (LinkedList) ((LinkedList)StrList).clone();
        System.out.println("Copied List \n" + CopyStrList);
        //Shuffle CopyStrList
        Collections.shuffle(CopyStrList);
        System.out.println("List after shuffling\n" + CopyStrList);
        //Search for the location of Shane
        int indexOf = StrList.indexOf("Shane");
        System.out.println("Shane found in location: " + (indexOf+1));
    
  }
}