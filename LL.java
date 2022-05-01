public class LL {
   node head;
    class node {
        String data;
        node next;

        public node(String data) {
            this.data = data;
            this.next = null;
        }
    }


public void start(String data) {
    node newNode=new node(data);
    if(head==null){
        head=newNode;
    }

    newNode.next=head;
    head=newNode;
}
public void last(String data){
    node newNode=new node(data);
        if(head==null){
            head=newNode;
           return;
        }
        node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
}
public void position(String data, int pos){
        node newNode=new node(data);
        int c=0;
        if (pos==1){
            newNode.next=head;
            head=newNode;
        }else {
            node temp = head;
            while (c < pos - 1) {
                temp = temp.next;
                c++;
            }
            node cur=temp.next;
            temp.next = newNode;
            newNode.next = cur;
        }
}

public void delete(){
        if (head==null){
            return;
        }
        head=head.next;
}

public void deletelast(){
        if(head==null){
            return;
        }
        node cur=head;
        node temp=null;
        while (cur.next!=null){
            temp=cur;
            cur=cur.next;
        }
        temp.next=null;

}
public node recursiverev(node head){
        if (head==null || head.next==null){
            return head;
        }
        node temp=recursiverev(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
}
public void print(){
        if (head==null){
            return;
        }
        node cur=head;
        while (cur!=null){
            System.out.print(cur.data+"-->");
            cur=cur.next;
        }
    System.out.println("null");
}

    public static void main(String[] args) {
LL l=new LL();
//l.start("T");
//l.start("A");
//l.start("N");
//l.start("u");
//l.start("J");
        l.last("T");
        l.last("A");
        l.last("N");
        l.last("U");
        l.last("J");
        l.print();
l.position("G",3);
l.print();
l.deletelast();
l.head=l.recursiverev(l.head);
l.print();
    }
}
