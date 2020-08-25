package duke.commands;

import duke.MessageManager;
import duke.TaskManager;
import duke.Ui;

public class ListCommand extends Command {

    public ListCommand(String input) {
        this.input = input;
        this.isExit = false;
    }
    @Override
    public void execute(TaskManager taskManager, Ui ui) {
        String message = MessageManager.getListMessage(taskManager);
        ui.sendMessage(message);
    }
}