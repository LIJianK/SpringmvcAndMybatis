package com.pro.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.pro.dao.TaskDao;
import com.pro.domain.Task;
import com.pro.util.DbHelper;

public class TaskServiceImpl implements TaskService {

	public void addTask(Task task) {

		SqlSession sqlSession = null;
		
		try {
			sqlSession = DbHelper.getSqlSession();
			TaskDao taskDao = sqlSession.getMapper(TaskDao.class);
			taskDao.addTask(task);
			sqlSession.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
	}

	public void deleteTask(int taskId) {
		
		SqlSession sqlSession = null;
		
		try {
			sqlSession = DbHelper.getSqlSession();
			TaskDao taskDao = sqlSession.getMapper(TaskDao.class);
			taskDao.deleteTask(taskId);
			sqlSession.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}

	}

	public List<Task> findTaskAll() {

		SqlSession sqlSession = null;
		List<Task> taskList = null;
		
		try {
			sqlSession = DbHelper.getSqlSession();
			TaskDao taskDao = sqlSession.getMapper(TaskDao.class);
			taskList = taskDao.findTaskAll();
			sqlSession.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		return taskList;
	}

	public void updateTask(Task task) {

		SqlSession sqlSession = null;
		
		try {
			sqlSession = DbHelper.getSqlSession();
			TaskDao taskDao = sqlSession.getMapper(TaskDao.class);
			taskDao.updateTask(task);
			sqlSession.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}

	}

}
