package kr.smhrd.lunch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.smhrd.lunch.Entity.Goods;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Integer> {
	
}
