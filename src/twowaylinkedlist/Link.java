
package twowaylinkedlist;

public class Link {
    public long data;
    public Link prev;
    public Link after;
    public Link (Long data){
        this.data=data;
    }
    public String makeList() 
	{
       
		return data + " ";
	}
}
