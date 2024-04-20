package com.example.simplequiz


// TODO (STEP 5: Create a Constants Object.)
// START
object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWER: String = "correct_answers"

    // TODO (STEP 6: Create a list of questions using the Question data model class. And add all the flag images to the drawable folder to add it in the list.)
    // START
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What endangered species is this creature?",
            R.drawable.tasmanian_devil,
            "Tasmanian Devil", "Platypus",
            "Tiger", "Rhinocerus", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What endangered species is this creature?",
            R.drawable.arroyo_toad,
            "Asian Elephant", "Blue Whale",
            "Arroyo Toad", "Tarsier", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What endangered species is this creature?",
            R.drawable.tiger,
            "Marine Otter", "Okapi",
            "Spider Monkey", "Tiger", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What endangered species is this creature?",
            R.drawable.spider_monkey,
            "Basking Shark", "Spider Monkey",
            "Bush Elephant", "Otter", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What endangered species is this creature?",
            R.drawable.african_bush_elephant,
            "Tiger", "Rhinocerus",
            "African Bush Elephant", "Okapi", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What endangered species is this creature?",
            R.drawable.okapi,
            "Okapi", "Galapagos Sealion",
            "African Wild Dog", "Egyptian Vulture", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What endangered species is this creature?",
            R.drawable.egyptian_vulture,
            "Okapi", "Elephant",
            "Egyptian Vulture", "Tiger", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What endangered species is this creature?",
            R.drawable.basking_shark,
            "Tiger", "Okapi",
            "Spider Monkey", "Basking Shark", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What endangered species is this creature?",
            R.drawable.african_wild_dog,
            "Arroyo Toad", "African Wild Dog",
            "Marine Otter", "Spider monkey", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What endangered species is this creature?",
            R.drawable.galapagos_sea_lion,
            "Galapagos Sealion", "Bush Elephant",
            "Tasmanian Devil", "Dodo", 1
        )

        questionsList.add(que10)

        return questionsList
    }
    // END
    var MAX_PROGRESS_VALUE = 10
}
// END
