package src.main.java.model.app;

import src.main.java.interfaces.InternetBrowser;

public class Safari implements InternetBrowser {
    @Override
    public void viewPage() {
        System.out.println("Opening page");
    }

    @Override
    public void addNewTab() {
        System.out.println("Creating new tab");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page");
    }
}
