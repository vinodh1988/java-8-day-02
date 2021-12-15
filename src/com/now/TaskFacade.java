package com.now;

public class TaskFacade {
     public static void TaskExecutor(Task task) {
    	 System.out.println("############# Starting the Task ##############");
    	 task.task();
    	 System.out.println("############  Finishing the Task ##############");
     }
}
