package com.wb.visionboardservice.app.boards;

import com.wb.visionboardservice.models.Board;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component("boardsRepository")
public class BoardsRepository {

    static Logger log = LogManager.getLogger(BoardsRepository.class);

    public Board add(Board board) throws SQLException  {
        log.info("FW - add boards");
        return new Board(null, "board name 1", "board description");
    }

    public List<Board> get()  throws SQLException {
        log.info("FW - get boards");
        var boards = new ArrayList<Board>();
        var b = new Board(null, "board name 1", "board description");
        boards.add(b);

        return boards;
    }

    public Board get(UUID id) throws SQLException  {
        log.info("FW - get board by id");
        return new Board(null, "board name 1", "board description");
    }

    public void delete(UUID id) throws SQLException  {
        log.info("FW - delete board by id");
    }

    public Board update(Board board) throws SQLException {
        log.info("FW - update board");
        return new Board(null, "board name 1", "board description");
    }
}
