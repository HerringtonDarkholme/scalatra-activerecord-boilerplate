import org.scalatra.LifeCycle
import com.github.aselab.activerecord.scalatra._
import javax.servlet.ServletContext
import controllers._

class ScalatraBootstrap extends ActiveRecordLifeCycle {
  override def init(context: ServletContext) {
    super.init(context)
    context mount (new WordController, "/word/*")
    context mount (new MainController, "/*")
  }
}

