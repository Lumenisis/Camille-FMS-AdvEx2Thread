import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTime {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		Thread thread = new Thread(new MonRunnable(df, 1000));
		thread.start();
	}

	private static class MonRunnable implements Runnable {
		private DateFormat df;
		private long delai;
		public MonRunnable(DateFormat df, long delai) {
			this.df = df;
			this.delai = delai;
		}

		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(delai);
					System.out.print(df.format(new Date()) + "\r");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}