package at.kradev.spring.labor14_num2.db;

import at.kradev.spring.labor14_num2.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
	public List<Post> findPostsByUserId (Integer id);
}
