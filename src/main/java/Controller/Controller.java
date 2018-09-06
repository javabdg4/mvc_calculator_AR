package Controller;

import Model.Model;
import View.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.addMultiplyListener(new MultiplyListener());
    }

    class MultiplyListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            userInput = view.getUSerInput();
            System.out.println(userInput);
            model.multiply(userInput);
            view.setTotal(model.getValue());

        }
    }

    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.reset();
            view.reset();
        }
    }

}
