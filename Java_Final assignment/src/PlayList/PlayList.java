package PlayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import Class.Song;
import MainList.MainList;
import SongList.SongList;

public class PlayList {
	public static List<String> playlistname = new ArrayList<String>();
	public static Scanner input = new Scanner(System.in);
			static AddList add = new AddList();

	public static void playlist() {
		choice();
	}

	

	public static void choice() {

		

		while (true) {
			DisplayList.displaylist();
			int choice = input.nextInt();
			switch (choice) {
			case 1:// 添加列表
				add.addlist();
				//AddList.addlist();
				break;
			case 2:// 删除列表
				DeleteList.deletelist();
				// DeleteList();
				continue;
			case 3:// 查询列表
				QueryList.queryList();
				// QueryList();
				continue;
			case 4:// 显示所有列表名
				DisplayList.displaylist();
				// DisplayList();
				continue;
			case 5:// 返回上一级菜单
				MainList.main(null);
				break;
			}
		}
	}
}
