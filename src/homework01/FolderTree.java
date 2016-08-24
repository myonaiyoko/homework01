package homework01;

import java.io.File;

public class FolderTree {

	/**
	 * 指定されたフォルダパス配下のフォルダとファイルをコンソール出力する
	 * @param pathname
	 */
	public static void outputTree(String pathname){
		System.out.println(pathname);
		getFolderFileList(pathname,"");
	}

	private static void getFolderFileList(String pathname,String header) {
			header += "   ";
		File file = new File(pathname);
		File files[] = file.listFiles();
		if(files == null) {
			return;
		}
		for(int i=0;i<files.length;i++) {
			if(files[i].toString().substring(0, 1) == "$"){
				return;
			}
			String outString = header ;
			outString += "└";
			String outpath = files[i].toString().replace(pathname, "").replace("\\", "");
			System.out.println(outString + outpath);
			if (files[i].isDirectory()) {
					getFolderFileList(files[i].toString(),header);
			}
		}
	}
}
