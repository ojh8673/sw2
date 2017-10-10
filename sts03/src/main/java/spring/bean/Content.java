package spring.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Content {
	private String title;
	private String savename;
	private String filename;
	private String filetype;
	private long filelen;
	private String reg;
	public Content(ResultSet rs) throws SQLException{
		setTitle(rs.getString("title"));
		setSavename(rs.getString("savename"));
		setFilename(rs.getString("filename"));
		setFiletype(rs.getString("filetype"));
		setFilelen(rs.getLong("filelen"));
		setReg(rs.getString("reg"));
	}
	public Content() {
		super();
	}
	@Override
	public String toString() {
		return "Content [title=" + title + ", savename=" + savename + ", filename=" + filename + ", filetype="
				+ filetype + ", filelen=" + filelen + ", reg=" + reg + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSavename() {
		return savename;
	}
	public void setSavename(String savename) {
		this.savename = savename;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	public long getFilelen() {
		return filelen;
	}
	public void setFilelen(long filelen) {
		this.filelen = filelen;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
}
