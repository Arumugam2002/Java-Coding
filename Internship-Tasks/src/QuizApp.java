import java.util.*;

class Question {
    String question;
    String[] options;
    int correctAnswer; 

    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(
                "What is the capital of India?",
                new String[]{"Mumbai", "Delhi", "Kolkata", "Chennai"},
                1));
        questions.add(new Question(
                "Which language is used for Android development?",
                new String[]{"Python", "Java", "Swift", "C#"},
                1));
        questions.add(new Question(
                "Who is known as the father of Computers?",
                new String[]{"Charles Babbage", "Alan Turing", "Dennis Ritchie", "Bill Gates"},
                0));

        int score = 0;

       
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ". " + q.question);

          
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }

            
            System.out.print("Enter your answer (1-" + q.options.length + "): ");
            int answer = sc.nextInt() - 1;

           
            if (answer == q.correctAnswer) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.options[q.correctAnswer]);
            }
        }

      
        System.out.println("\n--- Quiz Finished ---");
        System.out.println("Your Score: " + score + "/" + questions.size());
        sc.close();
    }
}
