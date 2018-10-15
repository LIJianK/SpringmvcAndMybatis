package com.pro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.pro.domain.Task;
import com.pro.service.TaskService;
import com.pro.service.TaskServiceImpl;

@Controller
@RequestMapping("/task")
public class TaskController {

	@RequestMapping("/findTaskAll")
	public ModelAndView findTaskAll(HttpServletResponse response){
		
		ModelAndView mav = new ModelAndView();
		TaskService taskService = new TaskServiceImpl();
		List<Task> taskList = taskService.findTaskAll();
		mav.addObject("taskList", taskList);
		/*String jsonString = JSON.toJSONString(taskList);
		try {
			PrintWriter writer = response.getWriter();
			writer.write(jsonString);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		mav.setViewName("task/showAllTask");
		return mav;
	}
	
	@RequestMapping("/deleteTask")
	public String deleteTask(int taskId){
		TaskService taskService = new TaskServiceImpl();
		taskService.deleteTask(taskId);
		return "redirect:/task/findTaskAll";
	}
	
	@RequestMapping("/addTask")
	public String addTask(Task task){
		TaskService taskService = new TaskServiceImpl();
		taskService.addTask(task);
		return "redirect:/task/findTaskAll";
	}
	
	@RequestMapping("/updateTask")
	public String updateTask(Task task){
		TaskService taskService = new TaskServiceImpl();
		taskService.updateTask(task);
		return "redirect:/task/findTaskAll";
	}
	
	/**
	 * 转add
	 */
	@RequestMapping("/toFromAdd")
	public ModelAndView toFromAdd(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("task/addTask");
		return mav;
	}
	
	/**
	 * 转update
	 */
	@RequestMapping("/toFromUpdate")
	public ModelAndView toFromUpdate(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("task/updateTask");
		return mav;
	}
}
