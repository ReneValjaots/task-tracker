package com.renev.task.tracker.mappers;

import com.renev.task.tracker.domain.dto.TaskListDto;
import com.renev.task.tracker.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
