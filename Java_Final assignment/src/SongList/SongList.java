package SongList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import Class.Song;
import MainList.MainList;

public class SongList {
	static File file = new File("test1.txt");
	public static Map<String, List<Song>> map = new HashMap<String, List<Song>>();
	static Scanner input = new Scanner(System.in);

	public static void choice() {
		while (true) {
			System.out.println("请选择：\n"+
					" 1: 将歌曲添加到播放列表\n" +
					" 2: 通过歌曲id查询播放列表中的歌曲\n" + 
					" 3: 修改播放列表中的歌曲\n"+ 
					" 4: 删除播放列表中的歌曲\n" + 
					" 5: 显示播放列表中的所有歌曲\n" + 
					" 6: 导出歌单\n" + 
					" 7: 返回上一级菜单\n");
			int choise = input.nextInt();
			switch (choise) {

			case 1:// 将歌曲添加到播放列表。
				AddList.addlist();
				break;
			case 2:// 通过歌曲id查询播放列表中的歌曲
				QuerySong.querysong();;
				break;
			case 3:// 修改播放列表中的歌曲
				Modify.modify();;
				break;
			case 4:// 删除播放列表中的歌曲
				Delete.delete();;
				break;
			case 5:// 显示播放列表中的所有歌曲
				DisplaySong.displaysong();
				break;
			case 6:// 导出歌单
				Export.export();;
				break;
			case 7:// 返回上一级菜单
				MainList.main(null);
				break;
			} // show();
		}
	}
}

