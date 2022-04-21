package com.example.shboard.service;


import com.example.shboard.domain.Board;

import java.util.List;

public interface BoardService {
    /**
     * 글쓰기
     * param: Board
     * return: int
     */
    int writeBoard(Board board);
    /**
     * 글보기
     * param: x
     * return: List<Board>
     */
    List<Board> findBoardAll();

}
