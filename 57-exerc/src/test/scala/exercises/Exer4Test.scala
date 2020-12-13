package exercises

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import exercises.dto.Story

class Exer4Test extends FlatSpec with Matchers {
  "inserting all the inputs" should "format it into a stroy" in {
    val storyStr = Story("story", "tell", "short", "foolishly").toStory

    assert(storyStr == "Do you tell your short story foolishly? That's hilarious!")
  }
}
