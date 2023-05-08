import java.io.*;
import java.util.*;
public class lab7 {
   
    static float[] sort(float[] arr, int l) {
        for (int i = 0; i < l; i++) {
            for (int s = 0; s < l - i - 1; s++) {
                if (arr[s] >= arr[s + 1]) {
                    float temp = arr[j];
                    arr[s] = arr[s + 1];
                    arr[s + 1] = temp;
                }
            }
        }
        return (arr);
    }
    
    static float mean(float[] arr, int l) {
        float sum = 0;
        for (int i = 0; i < l; i++) {
            sum += arr[i];
        }
        float mean = sum / l;
        return mean;
    }
    
    static float median(float[] arr1, int l) {
        float[] arr = sort(arr1, l);
        float median = 0;
        for (int i = 0; i < l; i++) {
            if (l % 2 == 0) {
                float m = (arr[(l / 2) - 1] + arr[(l / 2)]);
                median = m / 2;
            } else {
                median = arr[(l - 1) / 2];
            }
        }
        return median;
    }
    
    static float mode(float[] arr, int l) {
        int max = 0;
        float mode = 0;

        for (int i = 0; i < l; i++) {
            int count = 0;
            for (int s = i + 1; s < l; s++) {
                if (arr[i] == arr[s]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                mode = arr[i];
            }
        }
        if (max == 1) {
            mode = 0;
        }
        return mode;
    }
    
    static float max(float[] arr, int l) {
        float[] arr1 = sort(arr, l);
        float max = arr1[l - 1];
        return max;
    }
   
    static float min(float[] arr, int l) {
        float[] arr1 = sort(arr, l);
        float min = arr1[0];
        return min;
    }
    
    static String[][] summary(float[][] para, int l) {
        String[][] arr = new String[5][5];
        String[] arr1 = { "MEAN", "MEDIAN", "MODE", "MAX", "MIN" };
        arr[0] = arr1;
        for (int i = 0; i < 4; i++) {
            String[] sum = { mean(para[i], l) + "", median(para[i], l) + "", mode(para[i], l) + "", max(para[i], l) + "",
                    min(para[i], l) + "" };
            arr[i + 1] = sum;
        }
        return arr;
    }

static String display(String[][] arr, String s) {
    
    String[] arr1 = {"PARAMETER", "SEPAL LENGTH", "SEPAL WIDTH", "PETAL LENGTH", "PETAL WIDTH"};
    
    String b = "|";
    
    String str = String.format("%s%s%s", "-".repeat(40), s, "-".repeat(40));
    
    str += "\n";
    
    for (int i = 0; i < 5; i++) {
        
        str += b + String.format("%-13s", arr1[i]) + b;
        
        for (int s = 0; s < 5; s++) {
           
            str += String.format("%-13s", arr[i][j]) + b;
        }
        
        str += "\n";
    }
    
    System.out.println(str);
    
    return str;
}


public static void main(String[] args) {
    
    String[][] arr = new String[1024][6];
   
    int n = 0;
    try {
       
        File obj = new File("Iris.csv");
       
        Scanner scan = new Scanner(obj);
        
        while (scan.hasNextLine()) {
           
            String s = scan.nextLine();
            
            arr[n] = s.split(",");
            
            n++;
        }
        
        scan.close();
    } catch (Exception io) {
        
        System.out.println(io.getMessage());
    }
    
    n--;
   
    float[] sepallength = new float[n];
    float[] sepwid = new float[n];
    float[] petlen = new float[n];
    float[] petwid = new float[n];
    
    String[] species = new String[n];
    
    float[][] total = {sepallength, sepwid, petlen, petwid};
   
    float[][] setosa =new float[4][n];
    float[][] versicolor =new float[4][n]; 
    float[][] virginica =new float[4][n]; 
    for(int i = 0; i < n; i++){
        
        sepallength[i] = Float.parseFloat(arr[i + 1][1]);
        sepwid[i] = Float.parseFloat(arr[i + 1][2]);
        petlen[i] = Float.parseFloat(arr[i + 1][3]);
        petwid[i] = Float.parseFloat(arr[i + 1][4]);
        
        species[i] = arr[i + 1][5].split("-")[1];
    }
    int setCount = 0; 
    int verCount = 0; 
    int virCount = 0; 
    for(int i = 0; i < n; i++){
        if(species[i].equals("setosa")){
            
            for(int j = 0; j < 4; j++){
                setosa[j][setCount] = total[j][i];
            }
            setCount++; 
        }
        else if(species[i].equals("versicolor")){
            
            for(int s = 0; s < 4; s++){
                versicolor[s][verCount] = total[s][i];
            }
            verCount++; 
        }
        else if(species[i].equals("virginica")){
            
            for(int s = 0; s < 4; s++){
                virginica[s][virCount] = total[s][i];
            }
            virCount++; 
        }
    }
    

    String str = display(summary(total,n),"TOTAL")+display(summary(setosa,setCount),"SETOSA")+
                    display(summary(versicolor,verCount),"VERSICOLOR")+
                    display(summary(virginica,virCount),"VIRGINICA");
  
    try {
        FileWriter writer = new FileWriter("Output.txt");
        writer.write(str);
        writer.close();
        System.out.println("Output written to file 'output.txt'");
    } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }
}
}    