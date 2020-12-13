package exercises.dto

final case class Story(val noun: String, val verb: String, val adjective: String, val adverb: String) {
    def toStory: String = f"Do you $verb your $adjective $noun $adverb? That's hilarious!"
}