package HomeWork4;

public abstract class buildingClassRoom extends weekendClassID{
	public abstract void projector();
	public void ledMonitor() {
		System.out.println("our classroom has 72 inch led  hd monitor for projection.");
	}
	@Override
	public double studentForumTaskRatio(int a,int b) {
		double Ratio=a/b+8;
		System.out.println("Ratio is : "+Ratio);
		return Ratio;
		
		
	}

}
