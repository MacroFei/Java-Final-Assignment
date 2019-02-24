package SongList;

import java.util.List;
import java.util.Scanner;

import Class.Song;

public class Delete {
	public static void delete() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需要删除的歌曲所在列表：");
		String deletename = input.next();
		System.out.println("请输入需要删除的歌曲ID");
		String deleteid = input.next();

		for (String key : SongList.map.keySet()) {
			if (key.equals(deletename)) {
				List<Song> value = SongList.map.get(key);
				for (int i = 0; i < value.size(); i++) {
					if (deleteid.equals(value.get(i).getId())) {
						value.remove(i);
					}
				}
				SongList.map.remove(key);
				SongList.map.put(key, value);
			}
		}
	}

}
