package com.wb.visionboardservice.app.boards;

import com.wb.visionboardservice.models.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@Component("boardsService")
public class BoardsService {

    @Autowired
    private BoardsRepository boardsRepository;

    public Board add(Board item) throws SQLException {
        return boardsRepository.add(item);
    }

    public List<Board> get() throws SQLException  {
        return boardsRepository.get();
    }

    public Board get(UUID id) throws SQLException  {
        return boardsRepository.get(id);
    }

    public void delete(UUID id) throws SQLException  {
        boardsRepository.delete(id);
    }

    public Board update(Board board) throws SQLException  {
        return boardsRepository.update(board);
    }
}
