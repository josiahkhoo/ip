package duke.commands;

import duke.MessageManager;
import duke.TaskManager;
import duke.Ui;

public class ExitCommand extends Command {

    public ExitCommand(String input) {
        this.input = input;
        this.isExit = true;
    }

    @Override
    public void execute(TaskManager taskManager, Ui ui) {
        ui.sendMessage(MessageManager.getByeMessage());
    }
}