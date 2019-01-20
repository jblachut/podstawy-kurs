package _10_swing;
// tworzymy zdarzenie listener czyli co się stanie po wykonaiu jakiegoś zdarzenia
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MojListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("blaaaa");
    }
}
