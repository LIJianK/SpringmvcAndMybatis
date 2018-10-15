package com.pro.dao;

import java.util.List;

import com.pro.domain.Task;

public interface TaskDao {

	public void addTask(Task task);
	public void deleteTask(int taskId);
	public void updateTask(Task task);
	public List<Task> findTaskAll();
}
