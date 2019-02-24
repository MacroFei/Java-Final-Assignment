package Class;

import java.util.Scanner;

class Father {
	private String song;

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	Father(String song) {
		this.setSong(song);
	}

	void show() {
		System.out.println("已输入歌曲名字");
	}
}

public class Test extends Father {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Test(String song, String id) {
		super(song);
		this.setId(id);
	}

	public void showtwo() {
		Scanner input = new Scanner(System.in);
		super.show();
		String name = this.getSong();
		System.out.println("已输入歌曲ID");
		String id = this.getId();
		System.out.println("歌曲ID：" + this.getId() + "  歌曲Name：" + this.getSong());
	}

}
