package HomeWork4;

public class classRoom {
	
	public classRoom() {};
	public classRoom(String wall) {
		String wallShape=wall;
		System.out.println("The Shape of classroom is :"+wallShape);
	}
public classRoom(int students) {
	System.out.println("The classroom can hold "+students+"students");
	
}
public classRoom(int secA,int secB) {
	int total_st=secA+secB;
	System.out.println("Section A & B both have "+total_st+" Students.");
}
public classRoom(int c,int d,int e) {
	int total=c+d-e;
	System.out.println("classroo has "+total+" chair & tables.");
}

	
}
