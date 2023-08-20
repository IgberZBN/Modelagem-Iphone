package src.main.java.model.Iphones;

import src.main.java.model.app.AppleMusic;
import src.main.java.model.app.Phone;
import src.main.java.model.app.Safari;

public class Iphone2017 {
    public static void main(String[] args) {
        AppleMusic appleMusic = new AppleMusic();
        Phone phone = new Phone();
        Safari safari = new Safari();

        //Apple music
        appleMusic.selectMusic("Everlong");
        appleMusic.play();
        appleMusic.stop();

        //Phone
        phone.answerCall();
        phone.startVoiceEmail();
        phone.call("Igber");

        //Safari
        safari.addNewTab();
        safari.viewPage();
        safari.refreshPage();
    }
}
