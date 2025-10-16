
import View.AppView;
import Controller.Control;


public class Main {
    public static void main(String[] args) {
        AppView view = new AppView();

        Control control = new Control(view);

        control.iniciar();
    }
}
