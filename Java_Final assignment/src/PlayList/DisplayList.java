package PlayList;

public class DisplayList {

	DisplayList() {
		displaylist();
	}

	public static void displaylist() {
		if (PlayList.playlistname.isEmpty()) {
			System.out.println("歌单为空");
		} else {
			System.out.println("当前列表为：");
		}
		for (String v : PlayList.playlistname) {
			System.out.println(v);
		}
		System.out.println("1.添加播放列表 2.删除播放列表 3.通过名字查询播放列表 4.显示所有列表名字 5.返回上一级菜单");
	}
}

