package com.quizconsoleapp;

public class QuestionService {

    Question[] questions = new Question[5];


    public QuestionService()
    {
        questions[0] = new Question(1, "What is the most security provided language", "Java", "C++", "Python",".Net", "Java");
        questions[1] = new Question(2, "What is the language used in AI", "Java", "C++", "Python",".Net", "Python");
        questions[2] = new Question(3, "What is the language derived from C ", "Java", "C++", "Python",".Net", "C++");
        questions[3] = new Question(4, "What is the language used in windows operating system", "Java", "C++", "Python",".Net", ".Net");
        questions[4] = new Question(5, "Who founded Amazon", "Jeff Bezos", "Elon Musk", "Mark Zuckerburg","Steve Jobs", "Jeff Bezos");
    }

    public void displayQuestions()
    {

        for(Question q : questions)
        {
            System.out.println("Question:- " +q.getQuestion());
            System.out.println("Option 1:- " +q.getOpt1());
            System.out.println("Option 2:- " +q.getOpt2());
            System.out.println("Option 3:- " +q.getOpt3());
            System.out.println("Option 4:- " + q.getOpt4());
            System.out.println("Answer:- " + q.getAnswer());

            System.out.println();
            System.out.println();
        }

        for(Question q : questions)
        {
            System.out.println(q.toString());
        }


    }
}
