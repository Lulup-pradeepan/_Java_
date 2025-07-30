class Stu{
	int RollNumber;
	String Name;
	int m1,m2,m3;
	float avg;
	Stu(int RollNumber,String Name,int m1,int m2,int m3){
		this.RollNumber = RollNumber;
		this.Name = Name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public void CalculateAverage() {
		avg=(m1+m2+m3)/3;
	}
	public void DisplayDetails() {
		System.out.println("Roll Number:"+RollNumber);
		System.out.println("Name:"+Name);
		System.out.println("Mark 1:"+m1+"\tMark 2:"+m2+"\tMark 3:"+m3);
		System.out.println("Average:"+avg);
	}
}
public class StudentDemo {
	public static void main(String[]args) {
		Stu Student1=new Stu(1,"Sara",87,66,78);
		Student1.CalculateAverage();
		Student1.DisplayDetails();
		Stu Student2=new Stu(2,"Zerin",97,69,70);
		Student2.CalculateAverage();
		Student2.DisplayDetails();
		
	}

}
