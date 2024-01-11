package board.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import board.command.BoardCommand;
import board.domain.BoardDTO;
import board.repository.BoardRepository;

@Service
public class BoardService {
	@Autowired
	BoardRepository boardRepository;

	public void saveBoard(BoardCommand boardCommand) {
		BoardDTO boardDTO = new BoardDTO();
		BeanUtils.copyProperties(boardCommand, boardDTO);
		boardRepository.save(boardDTO);
	}

	public void getAllBoards(Model model) {
		List<BoardDTO> list = boardRepository.findAll();
		System.out.println(list.size());
		model.addAttribute("lists", list);
	}

	public void deleteById(String id) {
		boardRepository.deleteById(id);
	}
	public void getBoardById(String id, Model model) {
		Optional<BoardDTO> optionalBoard = boardRepository.findById(id);
        optionalBoard.ifPresent(board -> model.addAttribute("dto", board));
    }
}
