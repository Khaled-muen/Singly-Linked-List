package Single_Linked_List;

public class Run {
    public static void main(String[] args) {
        SList<String> singleList = new SList<String>();
        singleList.addElementFirst("khaled");
        singleList.addElementFirst("Ahmed");
        singleList.addElementFirst("Saed");
        singleList.addElementFirst("hssian");
        singleList.addElementFirst("Mohsen");
        singleList.addElementLast("saied");
         System.out.println("This is first element inside Slist : " +singleList.getFirstElement());
         System.out.println("This is last element inside Slist : " +singleList.getLastElement());
         singleList.printAllElement();
         singleList.removeAnInternalNode("Saed");
         singleList.printAllElement();
         System.out.println(singleList.search("Mohsen"));
         singleList.printSize();
         singleList.addNodeAfterSpecificElement("Mohsen", "lama");
         singleList.printAllElement();
         singleList.printSize();
         singleList.removeFromFist();
         singleList.printSize();
         singleList.printAllElement();
         singleList.removeFromLast();
         singleList.printAllElement();

    }
}
