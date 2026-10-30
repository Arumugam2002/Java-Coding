package com.quizconsoleapp;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];


    public QuestionService()
    {
        questions[0] = new Question(1, "What is the most security provided language", "Java", "C++", "Python",".Net", "Java");
        questions[1] = new Question(2, "What is the language used in AI", "Java", "C++", "Python",".Net", "Python");
        questions[2] = new Question(3, "What is the language derived from C ", "Java", "C++", "Python",".Net", "C++");
        questions[3] = new Question(4, "What is the language used in windows operating system", "Java", "C++", "Python",".Net", ".Net");
        questions[4] = new Question(5, "Who founded Amazon", "Jeff Bezos", "Elon Musk", "Mark Zuckerburg","Steve Jobs", "Jeff Bezos");
    }

    public void playQuiz()
    {

        int i = 0;

        for(Question q : questions)
        {
            System.out.println("Question Id:- " + q.getId());
            System.out.println("Question:- " +q.getQuestion());
            System.out.println("Option 1:- " +q.getOpt1());
            System.out.println("Option 2:- " +q.getOpt2());
            System.out.println("Option 3:- " +q.getOpt3());
            System.out.println("Option 4:- " + q.getOpt4());
            //System.out.println("Answer:- " + q.getAnswer());

            Scanner sc = new Scanner(System.in);

           selection[i] = sc.nextLine();
           i++;


            System.out.println();
            System.out.println();
        }

        for(String s : selection)
        {
            System.out.println(s);
        }

//        for(Question q : questions)
//        {
//            System.out.println(q.toString());
//        }


    }

    public void printScore() {

        int score = 0;

        for(int i=0; i < questions.length;i++)
        {
                Question question = questions[i];
                String actualAnswer = question.getAnswer();

                String userAnswer = selection[i];

                if(actualAnswer.equals(userAnswer))
                {
                    score++;
                }
        }

        System.out.println("Your Score is:- " + score);
    }
}
