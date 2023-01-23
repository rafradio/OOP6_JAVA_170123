package HW1.Presenter;

import java.util.*;
import HW1.Model.Model;
import HW1.View.Unlocker;

public class Presenter {
    public ArrayList<Unlocker> view;
    public Model model;

    public Presenter(Model model, ArrayList<Unlocker> view) {
        this.model = model;
        this.view = view;
    }

    public void start() {

        Scanner in = new Scanner(System.in);
        System.out.println(this.model.getSb().toString());
        int clientChoise = Integer.parseInt(in.next());

        String result = this.view.get(clientChoise - 1).unlockeThisPhone();
        System.out.println(result);
    }
}
