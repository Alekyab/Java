/**
 * 
 */
package com.cloudwick.training.core.assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import com.cloudwick.alekya.simple;

/**
 * @author alekya
 *
 */
public class MapReduce {

public static void main(String[] args) {
	HashMap<String, Integer> dictionary = new HashMap<String, Integer>();
	
	FileReader file;
	BufferedReader buffer = null;
	String line = null;
	try {
		file = new FileReader("serialize.txt");
		buffer = new BufferedReader(file);
		while ((line = buffer.readLine()) != null) {
			System.out.println(line);
			String[] words = line.split(" ");
			
			for(String word:words)
			{
				if(dictionary.containsKey(word))
				{
					
					dictionary.put(word ,dictionary.get(word)+1);
				}
				else
				{
					dictionary.put(word, 1);
				}
			}
			
			FileWriter outputFile;	
			try {
				
				outputFile = new FileWriter("Mapreduce.txt");
				BufferedWriter buffer1 = new BufferedWriter(outputFile);
				for(Entry<String, Integer> set: dictionary.entrySet())
				{
				buffer1.write(set.getKey()+ " "+ set.getValue()+"\n");
				buffer1.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
}
