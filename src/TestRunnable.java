import java.util.Collections;

public class TestRunnable implements Runnable {
	String [] str = {"!","\"","#","$","%","&","'","(",")","*"};
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print(str[i]);
			System.out.print(String.join("", Collections.nCopies( i + 1, "*")));
			System.out.println(str[i]);
		}
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start();
	}
}