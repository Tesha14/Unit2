package cosmodrome;
public class Cosmodrome {
    public void launch(IStart iStart) {
        if (!iStart.checkBeforeStart()) {
            System.out.println("Предстартовая проверка провалена" + "\n");
        } else {
            System.out.println("Предстартовая проверка пройдена");
            iStart.setEngineStaet();
            iStart.setStart();
        }
    }
}
