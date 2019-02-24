package PlayList;

import java.util.Scanner;

public class DeleteList {
	DeleteList(){
		 deletelist();
	}
	
	public static void deletelist() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需要删除的列表名：");
		String deletelist = input.next();
		for (int i = 0; i < PlayList.playlistname.size(); i++) {
			if (deletelist.equals(PlayList.playlistname.get(i))) {
				PlayList.playlistname.remove(i);
			}
		}
	}
}
