package com.aditya.jaca2;
//Java program to illustrate 

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Java.util.HashMap 

import java.util.HashMap;
import java.util.Map;

public class ioCollection {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		print(map);
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		System.out.println("Size of map is:- " + map.size());

		print(map);
		if (map.containsKey("vishal")) {
			Integer a = map.get("vishal");
			System.out.println("value for key" + " \"vishal\" is:- " + a);
		}

		map.clear();
		print(map);
	}

	public static void print(Map<String, Integer> map) {
		if (map.isEmpty()) {
			System.out.println("map is empty");
		}

		else {
			System.out.println(map);
		}
	}
}

// Write byte
class ioio {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("E:\\Programming\\adi.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

// Write String
class ioOut {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("E:\\Programming\\adi.txt");
			String s = "Hi Aditya.";

			// Converting String into byte array
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();

			System.out.println("Success...");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

// Read single character

class ioReadCharacter {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("E:\\Programming\\adi.txt");
			int i = fin.read();
			System.out.println((char) i);

			fin.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

// Read all characters

class ioReadAllCharacters {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("E:\\Programming\\adi.txt");

			int i = 0;

			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

// Write file using bufferReader

class ioBuffer {
	public static void main(String[] args) {
		try {
			FileOutputStream fin = new FileOutputStream("E:\\Programming\\adi.txt");
			BufferedOutputStream bo = new BufferedOutputStream(fin);

			String s = "welcome";

			byte b[] = s.getBytes();

			bo.write(b);
			bo.flush();
			bo.close();
			fin.close();

			System.out.println("Success...");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

// Read file using bufferReader

class iobuff {
	public static void main(String[] args) {
		try {

			FileInputStream fin = new FileInputStream(
					"C:\\Users\\Aditya\\Downloads\\Documents\\LoudCloud\\courses.csv");
			BufferedInputStream b = new BufferedInputStream(fin);

			int i;

			while ((i = b.read()) != -1) {
				System.out.print((char) i);
			}

			b.close();
			fin.close();

		} catch (Exception e) {

			System.out.println(e);

		}
	}
}



class Hello {

    public static void main(String[] args) {

        String csvFile = "C:\\Users\\Aditya\\Downloads\\Documents\\LoudCloud\\courses.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            FileWriter csvWriter = new FileWriter("C:\\Users\\Aditya\\Downloads\\Documents\\LoudCloud\\newcourses.csv");


            br = new BufferedReader(new FileReader(csvFile));
            int i=0;
            while ((line = br.readLine()) != null) {
                if(i==0){
                    i=1;
                    csvWriter.append(line);
                    csvWriter.append("\n");
                    continue;
                }
                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                String[] Date=country[4].split("/");
                String yy=Date[2];
                String dd=Date[1];
                String mm=Date[0];

                country[4]=yy+"/"+mm+"/"+dd;
                for(int a=0; a<5; a++){
                        csvWriter.append(country[a]);
                    csvWriter.append(",");

                }
                csvWriter.append("\n");
            }
            csvWriter.flush();
            csvWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}