package kr.smhrd.lunch.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "goods")
public class Goods {
	
	@Id
	private Integer Id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String price;
	
	@Column(name="is_new", nullable = false)
	private Boolean is_new;
	
	@Column(name="is_best", nullable = false)
	private Boolean is_best;
	
	@Column(nullable = false)
	private String main_thumb;
}
