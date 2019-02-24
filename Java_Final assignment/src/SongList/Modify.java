package SongList;

import java.util.List;
import java.util.Scanner;

import Class.Song;

public class Modify {
	public static void modify() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需要修改的歌曲所在列表：");
		String modifyname = input.next();
		System.out.println("请输入需要修改的歌曲ID");
		String modifyid = input.next();

		for (String key : SongList.map.keySet()) {
			if (key.equals(modifyname)) {
				List<Song> value = SongList.map.get(key);
				for (int i = 0; i < value.size(); i++) {
					if (modifyid.equals(value.get(i).getId())) {
						System.out.println("请输入新的歌曲ID：");
						String id = input.next();
						System.out.println("请输入新的歌曲Name：");
						String name = input.next();
						System.out.println("请输入新的歌曲singer");
						String singer = input.next();
						Song song = new Song(id, name, singer);
						value.set(i, song);
					}
				}
				SongList.map.remove(key);
				SongList.map.put(key, value);
			}
			else {
				System.out.println("修改失败");
			}
		}
	}

}
