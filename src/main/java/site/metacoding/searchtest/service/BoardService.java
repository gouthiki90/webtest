package site.metacoding.searchtest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.searchtest.domain.board.BoardRepository;
import site.metacoding.searchtest.domain.board.BoardTbl;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository; // 의존성 주입
    
    public List<BoardTbl> 검색하기(String keyword){ // SELECT니까 어노테이션 필요 없음
        System.out.println(keyword);
        List<BoardTbl> result = boardRepository.mSearch(keyword); // 변수에 담기
        System.out.println(result);
        return result;
    }
}
