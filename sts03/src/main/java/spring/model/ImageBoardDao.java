package spring.model;

import java.util.List;

import org.springframework.stereotype.Repository;

import spring.bean.Content;

@Repository
public interface ImageBoardDao {
	//3가지 : 추가, 목록, 1개정보 추출
	void insert(Content content);
	List<Content> list();
	Content get(String savename);
}
