package models.news;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;
import utils.StringUtils;

@Entity
@Table(name="news_category")
/**
 * 新闻分类管理
 * @author zhangpeng
 *
 */
public class NewsCategory extends Model{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	public long id;
	@Column
	public String nc_id;
	@Column
	public String nc_pid;
	@Column
	public String nc_name;
	@Column
	public String nc_desc;
	@Column
	public String nc_meta_title;
	@Column
	public String nc_meta_keyword;
	@Column
	public String nc_meta_content;
	@Column
	public int nc_sort; 
	
	public Model.Finder<Long, NewsCategory> find = new Model.Finder<Long, NewsCategory>(Long.class, NewsCategory.class);
	
	/**
	 * 添加新闻分类
	 * @param nc
	 */
	public void AddNewsCategory(NewsCategory nc){
		nc.nc_id = StringUtils.getMengCode();
		nc.save();
	}
	
	/**
	 * 修改新闻分类
	 * @param nc
	 */
	public void ModifyNewsCategory(NewsCategory nc){
		nc.update();
	}
	
	
	
	
}
