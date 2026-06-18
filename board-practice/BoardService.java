import java.util.*;
public class BoardService {
    private List<Board> boards = new ArrayList<>();
    public List<Board> findAll() { return boards; }
    public Board       findById(int id) {
        return boards.stream()
                     .filter(b -> b.getId() == id)
                     .findFirst().orElse(null);
    }
}
