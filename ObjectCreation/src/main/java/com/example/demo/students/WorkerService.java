package com.example.demo.students;

import org.springframework.stereotype.Service;

@Service
public class WorkerService {
	public Worker allWorker(String workerName, String workerAge, String workerAddress ,Student ss,Staff st) {
		Worker wk = new Worker();

		wk.setWorkerName(workerName);
		wk.setWorkerAge(workerAge);
		wk.setWorkerAddress(workerAddress);
		
		
		wk.setSs(ss);
		wk.setSt(st);
return wk;
	}

}
