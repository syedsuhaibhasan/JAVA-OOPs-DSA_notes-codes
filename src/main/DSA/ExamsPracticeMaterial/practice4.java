package DSA;
public class practice4 {
    Node top = null;
 class Node{
     String name;
     String phone_number;
     String dialedAt;
     String receivedAt;
     Node next;
     Node(String name,String phone_number, String dialedAt, String receivedAt ){
     this.next=null;
     this.dialedAt=dialedAt;
     this.receivedAt=receivedAt;
     this.phone_number=phone_number;
     this.name=name;
     }
     
//     Node(String name,String phone_number, String receivedAt){
//     this.next=null;
//     this.receivedAt=receivedAt;
//     this.phone_number=phone_number;
//     this.name=name;
//     }
 }//END OF NODE CLASS
 
    public void push(String name,String phone_number, String dialedAt, String receivedAt){
    Node node = new Node(name,phone_number,dialedAt,receivedAt);
        if (top==null) {
            top=node;
        }
        else{
        node.next=top;
        top=node;
        }
    }
    
    public void getMostRecentCall(){
       System.out.println("\n------Most Recent Call information----");
        System.out.println(top.name);
        System.out.println(top.phone_number);
        System.out.println(top.dialedAt);
        System.out.println(top.receivedAt);
    }
    
    public void removeRecentCall(){
        if (top==null) {
            System.out.println("Stack underFlow");
        }else{
            System.out.println("-----CALL REMOVED----");
        System.out.println("Name: "+top.name);
        System.out.println("Phone number: "+top.phone_number);
        System.out.println("Dialed At: "+top.dialedAt);
        System.out.println("Received At: "+top.receivedAt);
        top=top.next;
        }
    }
    
    public void getAllTheCalls(){
    Node temp = top;
        System.out.println("********DISPLAY ALL CONTACTS*******");
    while(temp!=null){
        System.out.println("\n------Call information----");
        System.out.println("Name: "+temp.name);
        System.out.println("Phone number: "+temp.phone_number);
        System.out.println("Dialed At: "+temp.dialedAt);
        System.out.println("Received At: "+temp.receivedAt);
        temp=temp.next;
    }
    }
    
    public static void main(String[] args) {
        practice4 obj = new practice4();
        obj.push("Nabeel", "033332456", "24/6/2025", "-");
        obj.push("ahmed", "033816969", "-", "24/8/2025");
        obj.push("Visam", "(021)4432891", "39/8/2024", "-");
        obj.push("Wasiq", "+1789465132", "-", "24/8/2040");
        obj.getAllTheCalls();
        obj.getMostRecentCall();
        obj.removeRecentCall();
    }
}
