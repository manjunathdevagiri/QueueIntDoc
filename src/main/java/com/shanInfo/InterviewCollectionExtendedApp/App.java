package com.shanInfo.InterviewCollectionExtendedApp;

import com.shanInfo.InterviewCollectionExtendedApp.entity.Interview;
import com.shanInfo.InterviewCollectionExtendedApp.entity.InterviewScheduler;
import com.shanInfo.InterviewCollectionExtendedApp.entityDoctor.Appointment;
import com.shanInfo.InterviewCollectionExtendedApp.entityDoctor.Doctor;

public class App {
    public static void main(String[] args) {
        InterviewScheduler scheduler=new InterviewScheduler();
        
        scheduler.scheduleInterview(new Interview(1, "Andy", 85, "10.00 AM"));
        scheduler.scheduleInterview(new Interview(2,"Charlie",68,"10.15 AM"));
        scheduler.scheduleInterview(new Interview(3, "Eren", 86, "10.25 AM"));
        
        scheduler.walkInCandidate(new Interview(4,"Deepa",91,"NOW"));
        
        System.out.println("\nFull SCHEDULE");
        scheduler.displaySchedule();
        
        System.out.println("\nWALK-IN");
        scheduler.displayWalkIns();
        
        System.out.println("\nTop PERFORMERS(Score>70)");
        scheduler.displayTopScorers(70);
        
        Appointment appo=new Appointment();
        
        appo.appointment(new Doctor(1, "Charlie", 12, 2));
        appo.appointment(new Doctor(2, "Andy", 18, 1));
        appo.appointment(new Doctor(3, "Benidict", 22, 3));
        appo.appointment(new Doctor(4, "Dreco", 80, 3));
        appo.appointment(new Doctor(5, "Franses", 12, 2));
        
        appo.consulted(new Doctor(6, "Eren", 50, 3));
        appo.consulted(new Doctor(7, "Mikasa", 40, 2));
        
        System.out.println("Appointment List");
        appo.displayAppointment();
        System.out.println("Consulted List");
        appo.displayConsulted();
        System.out.println("Emergency List 1->normal|2->moderate|3->Emergency");
        appo.displayPriority(3);
    }
}
