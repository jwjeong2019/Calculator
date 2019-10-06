package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import board.dto.BoardDTO;
import sqlMap.MybatisManager;

public class BoardDAO {
	public List<BoardDTO> list() {
		System.out.println("ssssss2");
		SqlSession session = MybatisManager.getInstance().openSession();
		List<BoardDTO> list = session.selectList("board.list");
		System.out.println("ssssss3");
		session.close();
		
		return list;
	}
	public BoardDTO info(int num) {
		SqlSession session = MybatisManager.getInstance().openSession();
		BoardDTO dto = session.selectOne("board.info", num);
		session.close();
		return dto;
	}
}
