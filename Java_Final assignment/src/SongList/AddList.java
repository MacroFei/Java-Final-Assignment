package SongList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Class.Song;

public class AddList {
	public static void addlist() {
		Scanner input = new Scanner(System.in);
		System.out.println("当前歌曲列表为：");
		for (String v : PlayList.PlayList.playlistname) {
			System.out.println(v);
		}
		System.out.println("请选择需要添加歌曲的列表：");
		String addlist = input.next();

		int num = -1;
		for (int i = 0; i < PlayList.PlayList.playlistname.size(); i++) {
			if (addlist.equals(PlayList.PlayList.playlistname.get(i))) {
				num = i;
			}
		}
		if (num == -1) {
			System.out.println("当前列表不存在");
			SongList.choice();
		}

		System.out.println("请输入需要添加的歌曲数量：");
		int songnum = input.nextInt();
		List<Song> list = new LinkedList<Song>();
		for (int i = 0; i < songnum; i++) {
			System.out.println("请分别输入歌曲的Id，Name，Singer");
			System.out.println("请输入第" + (i + 1) + "首歌曲的id：");
			String id = input.next();
			System.out.println("请输入第" + (i + 1) + "首歌曲的name：");
			String name = input.next();
			System.out.println("请输入第" + (i + 1) + "首歌曲的singer：");
			String singer = input.next();
			Song song = new Song(id, name, singer);
			list.add(song);
		}
		if (SongList.map.containsKey(addlist)) {
			for (String key : SongList.map.keySet()) {
				if (key.equals(addlist)) {
					List<Song> value = SongList.map.get(key);
					if (value.size() == 0) {
						SongList.map.put(addlist, list);
					} else {
						value.addAll(list);
						SongList.map.put(addlist, value);
					}
				}
			}
		} else {
			SongList.map.put(addlist, list);
		}

	}
}
