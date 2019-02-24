package SongList;

import java.io.FileWriter;
import java.io.IOException;

public class Export {
	public static void export() {
		try {
			FileWriter fw = new FileWriter(SongList.file);
			for (String v : PlayList.PlayList.playlistname) {
				fw.write(v + "\r\n");
			}
			fw.close();
			System.out.println("写入成功");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
