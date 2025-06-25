package kr.smhrd.lunch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.lunch.dto.GoodsDTO;
import kr.smhrd.lunch.service.GoodsService;

@CrossOrigin(origins = "http://3.35.235.250:5173")
@RestController
@RequestMapping("/api") //"/api"로 들어오는 애들을 매핑해주겠다는 뜻
public class GoodsController {
	
	@Autowired
	GoodsService goodsService;
	
	@GetMapping("/goods_list")
	public List<GoodsDTO> getGoodsList() {
//		System.out.println("\n\n[list 출력 컨트롤러]\n\n");
		
		// 2. Controller -> Service -> Repository
		List<GoodsDTO> result = goodsService.getGoodsList();
		
		return result;
	}
	
	@GetMapping("/goods_list/{id}")
	public GoodsDTO getGoodsDetail(@PathVariable int id) {
//		System.out.println("\n\n@@@@@@[goods 상세 "+id+"]@@@@@@\n\n");
		
		GoodsDTO goodsDetail = goodsService.getGoodsDetail(id);
		
		return goodsDetail;
	}
	
	

}
