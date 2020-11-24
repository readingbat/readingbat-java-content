import com.github.pambrose.common.util.GitHubRepo
import com.github.pambrose.common.util.OwnerType.Organization
import com.github.readingbat.dsl.readingBatContent

val content2 =
  readingBatContent {
    repo =
        //if (isProduction())
      GitHubRepo(Organization, "readingbat", "readingbat-java-content")
    //else
    //  FileSystemSource("./")

    java {
      group("Boolean Expressions") {
        packageName = "boolean_exprs"
        description = "Basic boolean expressions"

        challenge("LessThan")
      }
    }
  }