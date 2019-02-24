package MainList;

import java.util.Scanner;

import Class.Song;
import Class.Test;

public class MainList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("1.播放器列表 2.播放器列表管理 3.退出程序");
			int Choice = input.nextInt();
			switch (Choice) {
			case 1:
				PlayList.PlayList.playlist();
				break;
			case 2:
				SongList.SongList.choice();
				break;
			case 3:
				System.out.println("程序结束");
				System.exit(0);
			case 4:
				System.out.println("测试类输出:");
				Test test = new Test("测试ID", "测试Name");
				test.showtwo();
				
			}
		}
	}
}
