package com.shanInfo.InterviewCollectionExtendedApp.entityDoctor;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import com.shanInfo.InterviewCollectionExtendedApp.entity.Interview;

public class Appointment {

	private Queue<Doctor> appointmentQueue=new LinkedList<Doctor>();
	private Deque<Doctor> patientConsulted=new ArrayDeque<Doctor>();
	private PriorityQueue<Doctor> emergency=new PriorityQueue<Doctor>(
			(a,b)->Integer.compare(b.getPatientcondition(), a.getPatientcondition())
			);
	
	
	public void appointment(Doctor d) {
		appointmentQueue.offer(d);
		emergency.offer(d);
	}
	public void consulted(Doctor d) {
		patientConsulted.addFirst(d);
		emergency.offer(d);
	}
	public void displayAppointment() {
		System.out.println("appointment FIFO");
		appointmentQueue.forEach(System.out::println);
	}
	public void displayConsulted() {
		System.out.println("Consulted patients");
		patientConsulted.forEach(System.out::println);
	}
	public void displayPriority(int prio) {
		System.out.println("Patient with Emergency:"+prio+"***");
		emergency.stream().filter(e->e.getPatientcondition()==prio)
		.sorted(Comparator.comparing(Doctor::getPatientName))
		.forEach(System.out::println);
	}
}
