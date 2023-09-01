package com.example.myquiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Which footballer is there in the given image?",
            R.drawable.messi,
            " Mesut Ozil","Lionel Messi"," MO Salah","Bernardo Silva",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Which footballer is there in the given image?",
            R.drawable.cristiano,
            "Robert Lewandowski"," Wayne Rooney","Cristiano Ronaldo","Karim Benzema",
            3
        )
        questionsList.add(que2)


        val que3 = Question(
            3, "Which footballer is there in the given image?",
            R.drawable.pele,
            "Garrincha","Pele","Ferenc Puskas","De Stefano",
            2
        )
        questionsList.add(que3)


        val que4 = Question(
            4, "Which footballer is there in the given image?",
            R.drawable.maradona,
            " Mario Kempes","Roberto Baggio","Diego Maradona"," Michele Platini",
            3
        )
        questionsList.add(que4)


        val que5 = Question(
            5, "Which footballer is there in the given image?",
            R.drawable.cruyff,
            " Franz Beckanbauer","Gerd Muller","Bobby Charlton","Johann Cruyff",
            4
        )
        questionsList.add(que5)


        val que6 = Question(
            6, "Who won 2022 Qatar World Cup?",
            R.drawable.worldcup,
            "Argentina","Portugal","France","England",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "Who won 2023 Champions League Trophy?",
            R.drawable.championsleague,
            "Inter Milan","FC BAYERN","Real Madrid","Manchester City",
            4
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "Who won Euro 2020 Championship?",
            R.drawable.euro,
            "England","Spain","France","Italy",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "Who won Copa America 2020 Trophy?",
            R.drawable.copa,
            "Brazil","Uruguay","Argentina","Chile",
            3
        )
        questionsList.add(que9)







        return questionsList
    }
}