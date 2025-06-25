package kr.smhrd.lunch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.lunch.Entity.Goods;
import kr.smhrd.lunch.Entity.GoodsDetail;
import kr.smhrd.lunch.dto.GoodsDTO;
import kr.smhrd.lunch.repository.GoodsDetailRepository;
import kr.smhrd.lunch.repository.GoodsRepository;

@Service
public class GoodsService {

	@Autowired
	GoodsRepository goodsRepository;
	@Autowired
	GoodsDetailRepository goodsDetailRepository;
	
	public List<GoodsDTO> getGoodsList() {
		List<Goods> list = goodsRepository.findAll();
		List<GoodsDTO> listDto = new ArrayList<>();
		for(Goods item: list) {
			GoodsDTO dto = new GoodsDTO();
			dto.setId(item.getId());
			dto.setName(item.getName());
			dto.setPrice(item.getPrice());
			dto.setIs_best(item.getIs_best());
			dto.setIs_new(item.getIs_new());
			dto.setMain_thumb(item.getMain_thumb());
			listDto.add(dto);
		}
		return listDto;
	}
	
	public GoodsDTO getGoodsDetail(int id) {
		Goods goods = goodsRepository.findById(id).orElse(null);
		GoodsDetail detail = goodsDetailRepository.findById(id).orElse(null);
		
		if(goods == null || detail == null)
			return null;
		
		GoodsDTO dto = new GoodsDTO();
		dto.setId(goods.getId());
		dto.setName(goods.getName());
		dto.setPrice(goods.getPrice());
		dto.setIs_best(goods.getIs_best());
		dto.setIs_new(goods.getIs_new());
		dto.setMain_thumb(goods.getMain_thumb());
		dto.setDetail(detail);
		
		return dto;
	}
	
}
