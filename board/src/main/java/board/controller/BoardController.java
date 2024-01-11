package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import board.command.BoardCommand;
import board.service.BoardService;

@Controller
public class BoardController {
	@Autowired 
	BoardService boardService;
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("boardList")
	public String boardList(Model model) {
		boardService.getAllBoards(model);
		return "boardList";
	}
	@RequestMapping(value="boardWrite",method=RequestMethod.GET)
	public String boardWrite() {
		return "boardForm";
	}
	@RequestMapping(value="boardRegist", method=RequestMethod.POST)
	public String boardRegist(BoardCommand boardCommand) {
		boardService.saveBoard(boardCommand);
		return "redirect:boardList";
	}
	@GetMapping("boardDetail")
	public String boardDetail(@RequestParam(value="num") String id,
			Model model) {
		boardService.getBoardById(id, model);
		return "boardInfo";
	}
	@GetMapping("boardUpdate")
	public String boardUpdate(@RequestParam(value="num") String id,
			Model model) {
		boardService.getBoardById(id, model);
		return "boardModifyForm";
	}
	@PostMapping("boardModify")
	public String boardModify(BoardCommand boardCommand) {
		boardService.saveBoard(boardCommand);
		return "redirect:boardDetail?num="+boardCommand.getId();
	}
	@RequestMapping(value="boardDel" ,method = RequestMethod.GET)
	public String boardDel(@RequestParam(value="num") String id) {
		boardService.deleteById(id);
		return "redirect:boardList";
	}
}
