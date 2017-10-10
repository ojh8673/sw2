package spring.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import spring.bean.Content;

@Repository("imageBoardDao")
public class ImageBoardDaoImpl implements ImageBoardDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insert(Content content) {
		String sql = "insert into imageboard values(?, ?, ?, ?, ?, sysdate)";
		Object[] args = {
			content.getTitle(), content.getSavename(), 
			content.getFilename(), content.getFiletype(),
			content.getFilelen()
		};
		jdbcTemplate.update(sql, args);
	}

	@Override
	public List<Content> list() {
		String sql = "select * from imageboard order by reg desc";
		RowMapper<Content> mapper = (rs, index)->{
			return new Content(rs);
		};
		return jdbcTemplate.query(sql, mapper);
	}

	@Override
	public Content get(String savename) {
		String sql = "select * from imageboard where savename=?";
		ResultSetExtractor<Content> extractor = rs->{
			if(rs.next()) return new Content(rs);
			else return null;
		};
		return jdbcTemplate.query(sql, extractor, savename);
	}
	
	
	
}
