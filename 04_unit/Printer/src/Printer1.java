public class Printer1 {
    String queue = "";
    int pendingPagesCount = 0;
    int allPages = 0;
    static int allAllPages = 0;

    public void append (String text){
        append (text, "");
    }
     public void append (String text, String name){
        append (text, name, 1);
     }
     public void append (String text, String name, int count){
        queue = queue + "\n" +text + "Name: " + name + " pgs: " + count;
         pendingPagesCount += count;
         allPages += count;
         allAllPages += count;
     }


     public int getPendingPagesCount(){
        return pendingPagesCount;
     }

    public int getAllPages(){
        return allPages;
    }

    public static int getAllAllPages(){
        return allAllPages;
    }

      public int sumPgs () {
              allPages = allPages + pendingPagesCount;
              return allPages;
      }

    public void clear () {
        queue = "";
        pendingPagesCount = 0;
        System.out.println("List is empty");
    }
    public void print(String ToPrint){
        System.out.println(ToPrint);
        if(queue.isEmpty()){
            System.out.println(" List is empty");
        }
        else {
            System.out.println(queue);
        }
        System.out.println("Pending pages count: " + pendingPagesCount);
        clear();
    }
}
   /*String queue = "";
    int totalCount = 0;

    public void append (String name){
       append (name, "");
    }

    public void append (String name, String text){
       append (name, text, 1);
    }

    public void append (String name, String text, int count){
        queue = "\n" + name + text + count + " pgs";
        totalCount += count;
    }

    public void  getTotalCount(int totalCount) {
        this.totalCount = totalCount;
        return;

    }

    public void clear (){
        queue = "";
        System.out.println("List is empty");
    }

    public void print(){
        System.out.println("Print list:");
        if(queue.isEmpty()) {
            clear();
        }
        else {
            System.out.println(queue);
            System.out.println("Total count pages: " + totalCount);
        }
        clear();
    } */