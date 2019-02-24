package Class;

public class Song  implements Vip {
	

	public void vip() {
		System.out.println("Hello Vip");
	}
	public void show() {
		System.out.println("Id:"+this.getId()+"  Name:"+this.getName()+"  Singer:"+this.getSinger());
	}
	
	
	private String id;
	private String name;
	private String singer;
	
	
	public Song(String id , String name , String singer ) {
		this.id = id;
		this.name = name;
		this.singer = singer;
	}
	
	public Song (String id , String name ) {
		this.setId(id);
		this.setName(name);
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	

}
