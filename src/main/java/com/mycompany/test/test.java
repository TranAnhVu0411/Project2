package com.mycompany.test;
//
//import java.io.IOException;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.select.Elements;
//import com.mycompany.project.Control;
//import com.mycompany.project.News;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Map;
///**
// * This class is used get meta data from HTML using Jsoup.
// * @author w3spoint
// */
//public class test {
//  public static void main(String args[]) throws ParseException{
////    Document document;
////    try {
////    	//Get Document object after parsing the html from given url.
////	document = Jsoup.connect(
////          "https://www.w3spoint.com/jsoup-get-images-from-html-example/")
////           .get();
//// 
////	//Get description from document object.
////        Elements elm = 
////              document.select("meta[name=description]");
////	//Print description.
//////	System.out.println("Meta Description: " + description);
//// System.out.println(elm.get(0).attr("content"));
////	//Get keywords from document object.
////	String keywords = 
////                document.select("meta[name=keywords]").first()
////                .attr("content");
////	//Print keywords.
////	System.out.println("Meta Keyword : " + keywords);
//// 
////    } catch (IOException e) {
////	e.printStackTrace();
////    }
//Control control  = new Control();
////ArrayList<String> websiteList = new ArrayList<String>();
////        websiteList = control.getWebsite();
////        for(String i: websiteList){
////                System.out.println(i);
////        }
////
////  }
////News news = control.getNewsFromTitle("https://vnexpress.net/chua-tam-chuc-chat-kin-du-khach-4248332.html");
////System.out.println(news.Datetime);
//
//Date now= new Date();
////Calendar c1=Calendar.getInstance();
////c1.setTime(now);
//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
//String then = dateFormat.format(now);
//Date after = dateFormat.parse(then);
//System.out.println(then); 
//System.out.println(after);
//  }
//}

//import java.awt.BorderLayout;
//import java.awt.Desktop;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
///*from w  w w  . j a v a2s  .  co  m*/
//import javax.swing.JButton;
//import javax.swing.JFileChooser;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//
//public class test {
//  public static void main(String[] args) {
//    try {
//      File myObj = new File("E:\\Users\\Vu\\Documents\\vu.txt");
//      if (myObj.createNewFile()) {
//        System.out.println("File created: " + myObj.getName());
//      } else {
//        System.out.println("File already exists.");
//      }
//    } catch (IOException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//  }
//}

//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLConnection;
//
//public class test {
//   public static void main(String[] args) throws InterruptedException {
//      try {
//         URL url = new URL("http://www.google.com");
//         URLConnection connection = url.openConnection();
//         connection.connect();
//         System.out.println("Internet is connected");
//         Thread.sleep(10000);
//      } catch (MalformedURLException e) {
//         System.out.println("Internet is not connected");
//      } catch (IOException e) {
//         System.out.println("Internet is not connected");
//      }
//   }
//}

//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JWindow;
//import javax.swing.SwingConstants;
///* w  w w. j a  v  a  2s .c  o  m*/
//public class test extends JFrame {
//  public static void main(String args[]) {
//    JWindow window = new JWindow();
//    window.getContentPane().add(new JLabel("Loading", SwingConstants.CENTER));
//    window.setBounds(500, 150, 300, 200);
//    window.setVisible(true);
//    try {
//      Thread.sleep(0);
//    } catch (InterruptedException e) {
//    }
//    window.setVisible(false);
//    JFrame frame = new JFrame();
//    frame.add(new JLabel("Welcome Swing application..."));
//    frame.setVisible(true);
//    frame.setSize(300, 200);
//    window.dispose();
//  }
//}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class test {
    public static void main(String args[]) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String t = "Thứ năm, 13/5/2021, 20:29 (GMT+7)";
        int s=t.indexOf(",");
        int e = t.lastIndexOf(",");
        String time = t.substring(e+2, e+7)+":00";
        System.out.println(time);
        String date = t.substring(s+2, e);
        System.out.println(date);
        String datetime =date+" "+time;
//        String datetime = "20/5/2000 "+"0:0:0";
        Date d = dateFormat.parse(datetime);
        System.out.println(d);
//        String t="Hello world, my child";
//        System.out.println(t.contains("world, my"));
        /*ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        d.add(1);
        d.add(3);
        d.add(5);
        d.add(6);
        System.out.println(c);
        c.removeAll(d);
        System.out.println(c);
        c.addAll(d);
        System.out.println(c);*/
//        String a = "ads ljf";
//        System.out.println(a!="");
    }
}