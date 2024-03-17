package org.example;

public class Logic {
    Questions questions = new Questions();
    Answer answer = new Answer();


    public void logicGame() {


        questions.partOneFirstQuestions();
        String chooseString = Util.inputString("Написать ответ");
        if (chooseString.equals("Да")){
            answer.partOneAnsverOne();
        }else {
            answer.partOneAnsverTwo();
        }
        String chooseStringPartTwo = Util.inputString("Написать ответ");
        if (chooseStringPartTwo.equals("Нет")){

        }

    }


}
