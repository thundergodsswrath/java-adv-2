import annotations.NotNull;
import annotations.StringLength;

/**
 * The ProjectTask class represents a project task (created by PM) with a title and description.
 * It uses custom annotations to enforce validation constraints.
 */
public class ProjectTask {

  @NotNull
  String title;

  @StringLength(min = 1, max = 256)
  String description;

  public ProjectTask(String title, String description) {
    this.title = title;
    this.description = description;
  }
}