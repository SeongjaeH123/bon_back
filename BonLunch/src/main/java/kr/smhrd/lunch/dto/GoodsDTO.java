package kr.smhrd.lunch.dto;

import kr.smhrd.lunch.Entity.GoodsDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GoodsDTO {

	private Integer Id;
	private String name;
	private String price;
	private Boolean is_new;
	private Boolean is_best;
	private String main_thumb;
	
	private GoodsDetail detail;
	//리액트에서 이중 객체의 형태로 반환하도록 이렇게 한다.
	
}
