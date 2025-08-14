# Task Tracker

## Project Overview
This project is a full-stack application built with Spring Boot (Java) and React with Vite, designed to track tasks (todos).

## Thought process and reasoning

### Backend
For the backend, I used Spring Boot and implemented some design patterns:
- **Service-Oriented Design:** The business logic is separated from the web layer. This allows for cleaner, more maintainable code and easier testing.
- **Repository Pattern:** This pattern abstracts the data access layer, decoupling business logic from the specifics of the database implementation. This makes it easier to swap out the database technology in the future if needed.
- **DTOs (Data Transfer Objects):** DTOs are used to control the data exposed to the client, preventing over-exposure of internal data and allowing for more flexible API contracts.

The backend structure was designed with the following folders:
- **Controllers**:  Contains the endpoints for the API.
- **Domain**: Entities and DTOs.
- **Mappers**: Used to convert between domain entities and DTOs.
- **Services**: Contains the main business logic of the application.
- **Repositories**: Responsible for data access, interacting with the database to perform CRUD operations on entities.

### Database
The application uses PostgreSQL as the database.

### Frontend
The frontend is a modern single-page application built with React and a fast development server provided by Vite. The configuration is designed to be flexible, using environment variables to correctly route API calls whether the application is running locally or inside a Docker container.

### Application Design
The application provides fundamental CRUD (Create, Read, Update, Delete) functionality for tasks. 

### API Endpoints

**Task list endpoints:**

| Method | Endpoint                | Description                                   |
|--------|-------------------------|-----------------------------------------------|
| GET    | /task-lists              | Get all task lists.                             |
| POST    | /task-lists       | Create a task list.|
| GET    | /task-lists/{task_list_id}          | Get a task list by its ID.             |
| PUT    | /task-lists/{task_list_id}          | Update a task list by its ID.                     |
| DELETE | /task-lists/{task_list_id}         | Delete a specific task list.                      |

**Task endpoints:**
| Method | Endpoint                | Description                                   |
|--------|-------------------------|-----------------------------------------------|
| GET    | /task-lists/{task_list_id}/tasks | Get all tasks.    |
| POST   | /task-lists/{task_list_id}/tasks               | Create a new task.                           |
| GET   | /task-lists/{task_list_id}/tasks/{task_id}               | Get a task by its ID.                           |
| PUT   | /task-lists/{task_list_id}/tasks/{task_id}                | Update a task by its ID.                           |
| DELETE   | /task-lists/{task_list_id}/tasks/{task_id}                | Delete a specific task.                           |

---

## Step-by-step guide to run
1) **Clone the repository**  Run the following command in your terminal:
  ```bash
  git clone https://github.com/ReneValjaots/task-tracker.git
  ```

2) **Move to directory**  Run the following command in your terminal:
  ```bash
  cd task_tracker
  ```

3) **Docker compose build**  Run the following command in your terminal:
  ```bash
  docker-compose up --build
  ```

4) **Application url** After the containers are running, the frontend should be accessible at: http://localhost:5173/
