package exercises

import exercises.dto.Story

object Exer4 extends App {
    println("Enter a noun:")
    val noun = readLine
    println("Enter a verb:")
    val verb = readLine
    println("Enter a adjective:")
    val adjective = readLine
    println("Enter a adverb:")
    val adverb = readLine

    val story = Story(noun,verb,adjective,adverb)
    println(story.toStory)
    
}
