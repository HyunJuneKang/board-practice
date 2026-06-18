import java.util.*;
public class BoardService {
    private List<Board> boards = new ArrayList<>();
    public List<Board> findAll() { System.out.println("[B버전] 게시글 목록 반환");
        return boards; }
    public Board       findById(int id) {
        return boards.stream()
                     .filter(b -> b.getId() == id)
                     .findFirst().orElse(null);
    }
}
