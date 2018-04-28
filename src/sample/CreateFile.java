package sample;



import javafx.util.Pair;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by mocha on 23/4/18.
 */
public class CreateFile {

    private Formatter x,y,z,a,b,c;
    int i = 0;
    //Lightings[] pairarray = new Lightings[10000];
    TreeMap<Integer, List<String>> sortTime = new TreeMap<Integer, List<String>>();

    public void create(){
        try{
            x = new Formatter("tempinstructions.tmp");
            y = new Formatter("buffer.tmp");
            z = new Formatter("delete.tmp");
            a = new Formatter("instructions.txt"); //THIS IS FOR SORTED
            b = new Formatter("history.log"); //TODO write history
            c = new Formatter("config.txt"); // THIS IS FOR LIGHT CONFIG
            System.out.println("Files created");
            //TODO: conduct overwrite check

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void appendData(String s) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("tempinstructions.tmp",true));
        writer.append(s);
        writer.append("\n");
        writer.flush();
        writer.close();
    }

    public void appendTemp(String s) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("buffer.tmp",true));
        writer.append(s);
        writer.append("\n");
        writer.flush();
        writer.close();
    }

    public void appendConfig(String s) throws IOException{
        //refreshConfig();
        BufferedWriter writer = new BufferedWriter(new FileWriter("config.txt", true));
        writer.append(s);
        writer.append("\n");
        writer.flush();
        writer.close();
    }
    public void refreshConfig(){
        try {
            PrintWriter instructpw = new PrintWriter("config.txt");
            instructpw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void sortAndPublish() throws IOException{
        try{
            PrintWriter instructpw = new PrintWriter("instructions.txt");
            instructpw.close();
            Map mp = new HashMap();
            Scanner scan = new Scanner(new File("tempinstructions.tmp"));
            BufferedWriter br = new BufferedWriter(new FileWriter("instructions.txt",true));
            BufferedReader bread = new BufferedReader(new FileReader("tempinstructions.tmp"));
            i = 0;
            while(scan.hasNext()){
                String line = scan.nextLine().toLowerCase();
//                Integer time1 = new Integer(line.substring(0, line.indexOf(" ")));
//                Integer time2 = new Integer(line.split("\\s+")[1]);
//                Integer time3 = new Integer(line.split("\\s+")[2]);
                String stringarray[] = line.split("\\s+");
                Integer condition = new Integer(stringarray[2]);
                if(condition == 0) {
                    Integer time3 = new Integer(stringarray[1]);
                    Integer temp = -(time3);
                    stringarray[1] = temp.toString();
                }
                List<String> executeList = null;
                Integer score = Integer.valueOf(stringarray[0]);
                if ((executeList = sortTime.get(score)) == null) { // if NOT,
                    executeList = new ArrayList<String>(1); // CREATE a new list
                    executeList.add(stringarray[1]);
                    sortTime.put(Integer.valueOf(stringarray[0]), executeList);
                } else { // if YES, ADD to the existing list
                   executeList.add(stringarray[1]);
                }
                i++;
            }

            for (Integer score : sortTime.keySet()) {
                for (String lantern : sortTime.get(score)) { // iterate over player list
                   // System.out.println(lantern+ " " + score);
                    Integer processing = new Integer(lantern);
                    if(processing < 0){
                        int temp = -processing;
                        br.append(score + " " + temp + " " + 0);
                        br.append("\n");
                    }else{
                        br.append(score + " " + processing + " " + 1);
                        br.append("\n");
                    }
                }
            }
            br.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}



