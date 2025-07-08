package com.shanInfo.InterviewCollectionExtendedApp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shanInfo.InterviewCollectionExtendedApp.entity.Interview;
import com.shanInfo.InterviewCollectionExtendedApp.entity.InterviewScheduler;


public class AppTest {

    InterviewScheduler scheduler=scheduler=new InterviewScheduler();
    
    @BeforeEach //its like constructor which initializes before test methods getting loaded
    public void setup() {
    	
    	scheduler.scheduleInterview(new Interview(1, "Andy", 85, "10.00 AM"));
    	scheduler.scheduleInterview(new Interview(2,"Charlie",68,"10.15 AM"));
    	scheduler.scheduleInterview(new Interview(3, "Eren", 86, "10.25 AM"));
    	scheduler.walkInCandidate(new Interview(4,"Deepa",91,"NOW"));
    }
    
    @Test
    public void testSchedularCoreFlow() {
       // assertTrue(true);
    	
    	
    	assertEquals("Andy", scheduler.scheduleQueue.peek().getCandidateName());
    	assertEquals("Deepa", scheduler.walkInDeque.peekFirst().getCandidateName());
    	assertEquals("Deepa", scheduler.topPerformersQueue.peek().getCandidateName());
    }
    
    @Test
    void testTopScoresAbove70() {
        List<String> exceptedNames = Arrays.asList("Andy" ,"Deepa","Eren");
        
        List<String> topScores = scheduler.topPerformersQueue.stream()
          .filter(i -> i.getScore() >70).map(Interview::getCandidateName)
          .sorted().toList();
        
        assertEquals(exceptedNames, topScores);
       }
    @AfterEach//this is used for cleaning the above constructor after completing the work
    public void testDown() {
    	scheduler=null;
    }
}
