class Book{
	String title,author;
	double price,totalvalue;
	int quantity;
	Book(String title,String author,double price,int quantity){
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public void TotalValue() {
		totalvalue=(price*quantity);
	}
	public void DisplayDetails() {
		System.out.println("Title:"+title+"\nAuthor:"+author);
		System.out.println("Price:"+price+"\nTotal Value:"+totalvalue);
		System.out.println("Quantity:"+quantity);
	
	}
}
public class BookStore {
	public static void main(String[]args) {
		Book B1=new Book("Wings of Fire","APJ AbdulKalam",500,1);
		B1.TotalValue();
		B1.DisplayDetails();
		Book B2=new Book("Mobidik","William",450,3);
		B2.TotalValue();
		B2.DisplayDetails();
	}

}
