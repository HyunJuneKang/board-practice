public class BoardValidator {
    public static void validate(Board board) {
        if (board.getTitle() == null || board.getTitle().isEmpty())
            throw new IllegalArgumentException("제목은 필수입니다.");
        if (board.getAuthor() == null || board.getAuthor().isEmpty())
            throw new IllegalArgumentException("작성자는 필수입니다.");
    }
}
