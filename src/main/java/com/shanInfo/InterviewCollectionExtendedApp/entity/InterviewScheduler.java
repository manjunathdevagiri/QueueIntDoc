package com.shanInfo.InterviewCollectionExtendedApp.entity;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class InterviewScheduler {

	public Queue<Interview> scheduleQueue=new LinkedList<Interview>();
	public Deque<Interview> walkInDeque=new ArrayDeque<Interview>();
	public PriorityQueue<Interview> topPerformersQueue=new PriorityQueue<Interview>(
			(a,b)->Integer.compare(b.getScore(), a.getScore())
			);
	public void scheduleInterview(Interview i) {
		scheduleQueue.offer(i);
		topPerformersQueue.offer(i);
	}
	public void walkInCandidate(Interview i) {
		walkInDeque.addFirst(i);// urgent walk-in
		topPerformersQueue.offer(i);
	}
	public void displaySchedule() {
		System.out.println("Scheduled interviews(FIFO):");
		scheduleQueue.forEach(System.out::println);
	}
	public void displayWalkIns() {
		System.out.println("walk-in candidates(Deque):");
		walkInDeque.forEach(System.out::println);
	}
	public void displayTopScorers(int threshold) {
		System.out.println("shortlisted candidates(Score>)"+threshold+")");
		topPerformersQueue.stream().filter(i->i.getScore()>threshold)
		.sorted(Comparator.comparing(Interview::getCandidateName))
		.forEach(System.out::println);
	}
}
