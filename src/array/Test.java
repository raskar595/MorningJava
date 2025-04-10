package array;

class Check extends Thread{
	public void run() {
		 while (Test.flag) { /* Busy-wait loop */ }
         System.out.println("Reader Thread: Detected flag change");
	}
}

public class Test {

	 static volatile boolean flag = true;

    public static void main(String[] args) {
    	
        Thread writer = new Thread(() -> {
            try { 
            	Thread.sleep(1000); 
            } 
            catch (InterruptedException ignored) {
            	ignored.printStackTrace();
            }
            System.out.println("Writer Thread: Changing flag to false");
            flag = false; // Change is visible to all threads
        });

        Check reader = new Check();

        writer.start();
        reader.start();
    }

}
