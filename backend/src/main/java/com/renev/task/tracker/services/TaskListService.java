package com.renev.task.tracker.services;

import com.renev.task.tracker.domain.entities.TaskList;

import java.util.List;

public interface TaskListService {
    List<TaskList> listTaskLists();
    TaskList createTaskList(TaskList taskList);
    TaskList updateTaskList(TaskList taskList);
}
