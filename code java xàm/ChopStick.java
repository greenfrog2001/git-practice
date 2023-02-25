
 package chuong10; 

 public class ChopStick { 
	boolean available; 
	ChopStick() {
	available = true; 	}

	public synchronized void takeup(int philo_num, String side) {
	while (!available) {
	try {
	System.out.println("Philosopher " + philo_num + " is waiting for the " + side + " chopstick");
	wait();
	} catch (InterruptedException e) {
	}
	}
	System.out.println("Philosopher " + philo_num + " is taking up the " + side + " chopstick");
	available = false;
	}
		public synchronized void putdown(int philo_num, String side) {	
		System.out.println("Philosopher " + philo_num + " is putting	down	the	"	+	side	+	"	chopstick");
		available = true;	
		notify();	
		}	
	}		
