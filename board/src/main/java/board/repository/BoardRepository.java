package board.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import board.domain.BoardDTO;

public interface BoardRepository  extends MongoRepository<BoardDTO, String>{
	void deleteById(String id);
}
