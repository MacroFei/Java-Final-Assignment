package SongList;

import java.util.List;
import java.util.Scanner;

import Class.Song;

public class QuerySong {
	public static void querysong() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需要查询的歌曲所在的列表：");
		String queryname = input.next();
		System.out.println("请输入需要查询的歌曲ID");
		String queryid = input.next();

		for (String key : SongList.map.keySet()) {
			if (key.equals(queryname)) {
				List<Song> value = SongList.map.get(key);
				for (int i = 0; i < value.size(); i++) {
					if (queryid.equals(value.get(i).getId())) {
						System.out.println("歌曲ID：" + value.get(i).getId());
						System.out.println("歌曲name：" + value.get(i).getName());
						System.out.println("歌曲singer：" + value.get(i).getSinger());
					}
				}
			}
		}
	}
}
