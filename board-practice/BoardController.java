public class BoardController {
    private BoardService boardService = new BoardService();

    public void list() {
        boardService.findAll().forEach(System.out::println);
    }
}

    public void detail(int id) {
        System.out.println(boardService.findById(id));
    }
