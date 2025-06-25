package kr.smhrd.lunch.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.lunch.Entity.User;

// 기존의 Spring은 로직을 처리하고 결과를 반환할 때 view의 이름으로 String 사용
// @Controller -> 화면을 반활할 수 있는 Controller

//그런데 화면이 아니라 데이터'만' 반환하는 컨트롤러가 있는데 이게 RestController이다.
@RestController
public class HelloController {
	
	// @PathVariable : url의 경로에 포함되어 전달되는 데이터를 변수와 바인딩 하기 위해 사용한다.
	//   ex) 메서드명 (@PathVariable("id") int id) 가져오는 id와 자바에서 사용할 변수 id 를 매핑
	@GetMapping("/hello/{id}")
	public User HelloRest(@PathVariable int id) {
		
		System.out.println("전달 받은 값 : "+id);
		// 데이터를 JSON 객체 형태로 반환하도록
		// data-bind -> 데이터를 map 혹은 list 형태로 리턴
		// JSON 객체 형태로 변화하여 화면에 반환 - >front와 back이 완전히 분리된다.
		
		// user -> 이름, 나이, 성별
		User user = new User("홍성재", 26, "남");
		// ArrayList -> 우리 팀원의 나머지 저장
		ArrayList<User> userList = new ArrayList<>();
		userList.add(user);
		userList.add(new User("곽희돈", 24, "남"));
		userList.add(new User("제갈태웅", 23, "남"));
		userList.add(new User("서명우", 25, "남"));
		
		//@PathVariable -> url로 넘어온 인덱스에 저장된 팀원을 '데이터 형태로' 전송, 해당 유저의 정보를 리턴
		
		return userList.get(id);
	}

}
