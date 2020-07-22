package cn.wzzcd6.blog.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Blog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4499895741933066592L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	private String title;
	private String content;
	private Date createtime;
	private Integer account;
	private String cont;
	private Integer num;

}
