package twowaylinkedlist;

public class twoWayList {
    private Link first;
    private Link last;
    public twoWayList(){
        first=null;
        last=null;
    }
    public boolean isEmpty(){
        return first==null;
    }
    public void addtoFirst(long dd){
        Link newNode=new Link(dd); 
        if(isEmpty()){
            last=newNode;
        }else{
            first.prev=newNode;
        }
        newNode.after=first;
        first= newNode;
    }
    public void addtoLast(long dd){
        Link newNode=new Link(dd);
        if(isEmpty()){
            first=newNode;
        }else{
            last.after=newNode;
            newNode.prev=last;
        }
        last= newNode;
    }
    public Link deleteFirstdata(){
        Link sub=first;
        if(first.after==null){
            last=null;
        }else{
            first.after.prev=null;
        }
        first=first.after;
        return sub;
    }
    public Link deleteLastData(){
        Link sub=last;
        if(first.after==null){
            first=null;
        }else{
            last.prev.after=null;
        }
        last=last.prev;
        return sub;
    }
    public String print() {
                String strprint="";
		Link dynamic = first; 
		while (dynamic!= null) 
		{       
                        long print=dynamic.data;
			dynamic = dynamic.after; 
                        strprint += " ["+print+"] ";
		}
		return strprint;
	}
    
    
}
