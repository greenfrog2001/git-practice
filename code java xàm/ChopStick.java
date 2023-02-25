/*
	* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
	* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template 4	
	* */
 package chuong10; 
 /**
	*
	* @author bajoe 
	* 
	*/
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
