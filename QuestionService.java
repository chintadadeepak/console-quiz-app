
import java.util.Scanner;

public class QuestionService {
    Question questions[] = new Question[5];
    Scanner scanner = new Scanner(System.in);

    public QuestionService() {
        String questionsTitles[] = { "what is size of int", "what is size of char", "what is size of long",
                "what is size of float", "what is size of byte" };
        String[][] questionOptions = { { "1", "2", "4", "8" }, { "1", "2", "4", "8" }, { "1", "2", "4", "8" }, { "1",
                "2", "4", "8" }, { "1", "2", "4", "8" } };
        String[] answers = { "4", "2", "8", "4", "1" };
        for (int i = 1; i <= 5; i++)
            questions[i - 1] = new Question(i, questionsTitles[i - 1], questionOptions[i - 1], answers[i - 1]);
    }

    public void playQuiz() {
        String response;
        int score = 0;
        for (Question question : questions) {
            System.out.println("Question no : " + question.getId());
            System.out.println(question.getQuestion());
            for (int i = 0; i < question.getOptions().length; i++)
                System.out.println(question.getOptions()[i]);
            response = scanner.next();
            if (response.equals(question.getAnswer()))
                score++;
        }
        System.out.println("your score is : " + score);
    }
}
