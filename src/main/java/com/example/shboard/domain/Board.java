package com.example.shboard.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Board {
    /**
     * 번호
     * 제목
     * 내용
     * 글쓴이
     * 시간
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int boardNo;
    private String boardTitle;
    private String boardText;
    private String boardWriter;
    private LocalDateTime createdAt;



}
