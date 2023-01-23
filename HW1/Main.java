package HW1;

import java.util.*;

import HW1.Model.Model;
import HW1.Presenter.Presenter;
import HW1.View.FaceID;
import HW1.View.FingerPrint;
import HW1.View.Mode;
import HW1.View.Pin;
import HW1.View.Unlocker;

public class Main {
    public static void main(String[] args) {

        Model model = Model.creatModel();
        ArrayList<Unlocker> view = new ArrayList<>(Arrays.asList(
            new Mode(),
            new Pin(),
            new FingerPrint(),
            new FaceID()
        ));

        Presenter presenter = new Presenter(model, view);
        presenter.start();
    }
}
