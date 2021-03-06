package notebook;

import java.util.Calendar;  
import java.util.GregorianCalendar;  
/**
 * 工具类（时间）
 * 线程加锁休眠
 * @author daisy
 *
 */
public class Clock extends Thread{  
    public void run() {  
        while (true) {  
            GregorianCalendar time = new GregorianCalendar();  
            int hour = time.get(Calendar.HOUR_OF_DAY);  
            int min = time.get(Calendar.MINUTE);  
            int second = time.get(Calendar.SECOND);  
            NotepadMainFrame.label1.setText("    当前时间：" + hour + ":" + min + ":" + second);  
            try {  
                Thread.sleep(1000);  
            } catch (InterruptedException exception) {  
            }  
  
        }  
    }  
}  
