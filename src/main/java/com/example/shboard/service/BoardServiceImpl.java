package com.example.shboard.service;

import com.example.shboard.domain.Board;
import com.example.shboard.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository boardRepository){
        this.boardRepository=boardRepository;
    }

    @Override
    public int writeBoard(Board board) {
        return 0;
    }

    @Override
    public List<Board> findBoardAll() {
        return null;
    }
}
