package homework01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TextEncodeUTF8 {

	public static void encodeUTF8(String pathname){
		String Enc = getEncording(pathname);
		try{
			File rFile = new File(pathname);
			BufferedReader bufferedReader =
					new BufferedReader(new InputStreamReader(new FileInputStream(rFile),Enc));

			File wFile = new File(getOutFileName(pathname));
			PrintWriter printWriter =
					new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(wFile),"UTF-8")));
			String str;
			while((str = bufferedReader.readLine()) != null){
				printWriter.println(str);
			}
			printWriter.close();
			bufferedReader.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch (IOException e) {
			System.out.println(e);
		}
	}

	/**
	 * 引数をもとにファイル名+"utf-8"+拡張子を返す
	 * @param pathname
	 * @return ファイル名+"utf-8"+拡張子
	 */
	private static String getOutFileName(String pathname){
		if(pathname == null){
			return null;
		}
		int point = pathname.lastIndexOf(".");
		String returnValue;
		if(point >= 0){
			returnValue = pathname.substring(0,point)+ ".utf-8" + pathname.substring(point,pathname.length() );
//			return pathname.substring(0,point)+ "utf-8" +
//					pathname.substring(point,pathname.length() - point);
			return returnValue;
		} else {
			return pathname + "uft-8";
		}
	}

	private static String getEncording(String pathname){
		String returnValue = null;
		try{
			File rFile = new File(pathname);
			BufferedReader bufferedReader =
					new BufferedReader(new FileReader(rFile));
			String str = bufferedReader.readLine();
			bufferedReader.close();

			if (str.equals(new String(str.getBytes("Shift_JIS"),"Shift_JIS"))){
				returnValue = "UTF-8";
			}else if(str.equals(new String(str.getBytes("UTF-8"),"UTF-8"))){
				returnValue = "Shift_JIS";
			}
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch (IOException e) {
			System.out.println(e);
		}
		return returnValue;
	}
}
