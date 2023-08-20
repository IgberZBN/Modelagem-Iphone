package src.main.java.model.app;

import src.main.java.interfaces.TelephoneDevice;

public class Phone implements TelephoneDevice {
    @Override
    public void call(String name) {
        System.out.println("Calling "+name);
    }

    @Override
    public void answerCall() {
        System.out.println("Answering call");
    }

    @Override
    public void startVoiceEmail() {
        System.out.println("Starting voice email");
    }
}
