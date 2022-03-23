package site.metacoding.searchtest.domain.board;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardTbl, Integer> {
    
    @Query(value = "SELECT * FROM BoardTbl WHERE title LIKE %:keyword%", nativeQuery = true)
    List<BoardTbl> mSearch(@Param("keyword") String keyword); // 여러건이 될 수도 있기 때문에 리스트 타입으로 만듦
}
