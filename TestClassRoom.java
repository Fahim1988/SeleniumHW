package HomeWork4;

//OOP features included in this example encapsulation,abstraction,polymorphism,inheritance

public class TestClassRoom extends buildingClassRoom implements outlookOfClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classRoom PNT=new classRoom();
		classRoom PNT1=new classRoom("square.");
		classRoom PNT2=new classRoom(40, 50);
		weekendClass PNT3=new weekendClass();
		PNT3.students();
		PNT3.userPass("ghftjk");
		weekendClassID PNT4=new weekendClassID();
		PNT4.setStId(3713);
		System.out.println(PNT4.getStId());
		PNT4.studentForumTaskRatio(250, 25);
		buildingClassRoom PNT5=new TestClassRoom();
		PNT5.studentForumTaskRatio(250, 25);
		PNT5.projector();
		PNT5.ledMonitor();
		outlookOfClass PNT6=new TestClassRoom();
		PNT6.chair();
		PNT6.Tables();
		PNT6.pntLogo();
	}

	@Override
	public void projector() {
		System.out.println("Projector is in the process of being installed.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chair() {
		System.out.println("We have nicely furnished chairs.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String pntLogo() {
		String pnt="PNT";
		System.out.println("Our logo is "+pnt);
		
		// TODO Auto-generated method stub
		return pnt;
	}

	@Override
	public void Tables() {
		
		System.out.println("We have colorful Tables");
		// TODO Auto-generated method stub
		
	}

}
