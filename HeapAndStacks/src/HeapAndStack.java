public class HeapAndStack {
	
	int x = 5 ;
	
	void setX() {
		x = 7;
	}
}

class App{
	
	public static void main(String[] args) {
		
		HeapAndStack hs = new HeapAndStack();
		
		new HeapAndStack();
		
		HeapAndStack hs2;
		
		hs2 = new HeapAndStack();
		
		System.out.println(hs.x);
		
		hs = hs2;
		
		hs2.x = 7;
		
		System.out.println(hs2.x);
		
		HeapAndStack hs3 = hs2;
		
		hs2 = null;
		
		System.out.println(hs2.x);
		
		
				
		
	}
}