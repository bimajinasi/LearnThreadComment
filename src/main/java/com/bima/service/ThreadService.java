package com.bima.service;

import java.util.ArrayList;
import java.util.List;

import com.bima.model.ThreadModel;

public class ThreadService implements IThreadService {

	private List<ThreadModel> listThread = new ArrayList<ThreadModel>();

	@Override
	public ThreadModel addThread(ThreadModel newThread) {
		// TODO Auto-generated method stub
		listThread.add(newThread);
		return newThread;
	}

	@Override
	public List<ThreadModel> listofThread() {
		// TODO Auto-generated method stub
		return listThread;
	}

	@Override
	public ThreadModel detailThread(ThreadModel newDetailThread) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ThreadModel updateThread(ThreadModel newUpdateThread) {
		// TODO Auto-generated method stub
		return null;
	}

}
