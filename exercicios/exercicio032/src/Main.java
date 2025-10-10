
import View.AppView;
import Control.Control;


public class Main {
    public static void main(String[] args) {
        AppView view = new AppView();

        Control control = new Control(view);

        control.iniciar();
    }
}
