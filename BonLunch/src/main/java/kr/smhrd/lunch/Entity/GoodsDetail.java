package kr.smhrd.lunch.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "goods_detail")
public class GoodsDetail {
	
	// 연관관계 설정이 가능하다.
	// Goods의 속성과 Goods_detail 속성을 연결하기 위한 관계 설정 어노테이션
	//  @OneToOne, @JoinColumn("goods_id")

	@Id
	private Integer goods_id;
	
	@Column(nullable = false)
	private String sub_thumb;
	
	@Column(name = "txt")
	private String txt;
	
	@Column(name = "summary")
	private String summary;
	
}
