package SongList;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import Class.Song;

public class DisplaySong {
	public static void displaysong() {
		Iterator<Entry<String, List<Song>>> ite = SongList.map.entrySet().iterator();
		while (ite.hasNext()) {
			Entry<String, List<Song>> en = ite.next();
			String key = en.getKey();
			System.out.println("当前播放列表为：" + key);
			List<Song> song = en.getValue();
			for (int i = 0; i < song.size(); i++) {
				System.out.print("歌曲Id：" + song.get(i).getId());
				System.out.print("歌曲Name：" + song.get(i).getName());
				System.out.print("歌曲Singer：" + song.get(i).getSinger() + "\n");
			}
		}
	}

}
