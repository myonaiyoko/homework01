package homework01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchText {

	public static void outputMatches(String pathname, String keyword){

		try{
			File file = new File(pathname);
			BufferedReader bufferdReader = new BufferedReader(new FileReader(file));

			String str = "";
			int i = 0;
			boolean exist = false;
			while((str = bufferdReader.readLine()) != null){
				i ++;
				if(str.indexOf(keyword) != -1){
					System.out.println(String.valueOf(i) + ":" + str);
					exist = true;
				}
			}
			if(exist == false){
				System.out.println("文字列が一致しませんでした。");
			}
			bufferdReader.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
