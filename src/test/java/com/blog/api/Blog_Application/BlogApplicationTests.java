package com.blog.api.Blog_Application;

import com.blog.api.Blog_Application.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

	@Autowired
	private UserRepo userRepo;
	@Test
	void contextLoads() {
	}
	@Test
	public void repoTest () {
		String clasName = this.userRepo.getClass().getName();
		String packName = this.userRepo.getClass().getPackageName();
		System.out.println(clasName);
		System.out.println(packName);
	}
}
