package PlayList;

import java.util.Scanner;


public class AddList {

	public static void addlist() {
		System.out.println("请输入需要添加的列表名：");
		PlayList playlist = new PlayList();
		Scanner input = new Scanner(System.in);
		//System.out.println("请输入需要添加的列表名：");
		
		String addlist = input.next();
		int i = 0;
		playlist.playlistname.add(addlist);

	}
}
