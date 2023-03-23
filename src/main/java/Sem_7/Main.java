package Sem_7;

import Sem_7.controllers.NoteController;
import Sem_7.model.*;
import Sem_7.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("notes.txt");
        Repository repository = new RepositoryFile(fileOperation, new UserMapper());
        NoteController controller = new NoteController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}