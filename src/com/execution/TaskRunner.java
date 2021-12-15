package com.execution;

import com.now.TaskFacade;
import com.system.KeyOperations;
import com.system2.DevopsFactory;

public class TaskRunner {
        public static void main(String[] args) {
			TaskFacade.TaskExecutor(KeyOperations::coding);
			TaskFacade.TaskExecutor(KeyOperations::documenting);
			TaskFacade.TaskExecutor(KeyOperations::bundling);
			TaskFacade.TaskExecutor(KeyOperations::building);
			
			TaskFacade.TaskExecutor(DevopsFactory.getInstance("CICD")::perform);
			TaskFacade.TaskExecutor(DevopsFactory.getInstance("SCM")::perform);
			TaskFacade.TaskExecutor(DevopsFactory.getInstance("DOCKER")::perform);
			
			TaskFacade.TaskExecutor(()->{
				System.out.println("Perform this too please.....!!!");
			});
			
		}
}
