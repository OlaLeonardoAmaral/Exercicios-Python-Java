package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	public Date moment;
	public String title;
	public String content;
	public Integer likes;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	List<Coments> coments = new ArrayList<>();

	public Post(String title) {
		
		this.title = title;
	}
	
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Coments> getComents() {
		return coments;
	}

	public void addComment(Coments text) {
		coments.add(text);
	}
	
	public void removeComment(Coments text) {
		coments.remove(text);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " Likes - " + sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Coments s : coments) {
			sb.append(s.getText() + "\n");
		}
		return sb.toString();
	}
}
