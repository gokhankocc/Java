package getterstterkullanim;

public class Category {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name +"!"; //burya eklediimiz �nkem ana fonksiyondaki butun category lerin namelerinin sonuna ekler..
	}

}
