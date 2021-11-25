package com.bima.service;

import java.util.List;

import com.bima.model.ThreadModel;

public interface IThreadService {
	ThreadModel addThread(ThreadModel newThread);

	List<ThreadModel> listofThread();

	ThreadModel detailThread(ThreadModel newDetailThread);

	ThreadModel updateThread(ThreadModel newUpdateThread);

}
