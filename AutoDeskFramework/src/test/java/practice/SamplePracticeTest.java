package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.autodest.genericUtils.ExcelUtility;
import com.autodest.genericUtils.IConstant;

public class SamplePracticeTest {
	
  public static void main(String[] args) {
     String var = "welcome to india welcome india";
     String[] arr = var.split(" ");
     
     HashSet<String> set = new HashSet<String>();
     for(int s=0 ;s <arr.length ; s++) {
    	 set.add(arr[s]);
     }
     for(String str : set) {
    	 System.out.println(str+"===>"+getWordCout(str, var));
     }
    
}
  
  public static int getWordCout(String word ,String completeWord) {
	  int count = 0;
	  String[] arr1 = completeWord.split(" ");
	    for(int j=0 ; j<arr1.length ; j++) {
	    	if(word.equals(arr1[j])) {
	    		count++;
	    	}
	    }
	return count;
  }

}
