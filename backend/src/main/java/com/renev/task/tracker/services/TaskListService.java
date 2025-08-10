package com.renev.task.tracker.services;

import com.renev.task.tracker.domain.entities.TaskList;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskListService {
    List<TaskList> listTaskLists();
    TaskList createTaskList(TaskList taskList);
    TaskList updateTaskList(UUID taskListId, TaskList taskList);
    Optional<TaskList> getTaskList(UUID id);
}
