package app;

import model.TaskList;

public class Application {

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("Comprar leite");
        taskList.addTask("Estudar para o exame");
        taskList.addTask("Fazer exercícios");

        System.out.println("Você tem " + taskList.getTotalTasksNumber() + " tarefas na lista:");

        taskList.getTasksDescription();

        taskList.removeTask("Trabalhar");

        System.out.println("Agora você tem " + taskList.getTotalTasksNumber() + " tarefas na lista:");

        taskList.getTasksDescription();

        taskList.removeTask("Estudar para o exame");

        System.out.println("Agora você tem " + taskList.getTotalTasksNumber() + " tarefas na lista:");
    }
}
