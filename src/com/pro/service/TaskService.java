package com.pro.service;

import java.util.List;

import com.pro.domain.Task;

public interface TaskService {

	public void addTask(Task task);
	public void deleteTask(int taskId);
	public void updateTask(Task task);
	public List<Task> findTaskAll();
}
