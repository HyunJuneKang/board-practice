public class BoardController {
    private BoardService boardService = new BoardService();

    public void list() {
        boardService.findAll().forEach(System.out::println);
    }
}
