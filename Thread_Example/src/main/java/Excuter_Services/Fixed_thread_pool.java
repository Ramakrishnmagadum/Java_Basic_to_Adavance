package Excuter_Services;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fixed_thread_pool {
public static void main(String[] args) {
	ExecutorService service=Executors.newFixedThreadPool(10);
	for(int i=0;i<10;i++) {
		service.execute(new example());
	}
}
}

class example implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside");
	}
	
}
