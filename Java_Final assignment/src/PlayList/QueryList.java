package PlayList;

import java.util.List;
import java.util.Scanner;

import Class.Song;
import SongList.SongList;

public class QueryList {
	QueryList(){
		queryList();
	}
	public static void queryList() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需要查询的列表名：");
		String querylist = input.next();

		for (String key : SongList.map.keySet()) {
			if (key.equals(querylist)) {
				List<Song> value = SongList.map.get(key);
				for (int i = 0; i < value.size(); i++) {
					System.out.print("歌曲ID：" + value.get(i).getId());
					System.out.print("歌曲name：" + value.get(i).getName());
					System.out.print("歌曲singer：" + value.get(i).getSinger() + "\r\n");
				}
			}
		}
	}
}
