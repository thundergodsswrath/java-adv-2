import annotations.MaxValue;
import annotations.MinValue;
import annotations.NotNull;

/**
 * The Relic class represents a relic with a name and an approx age.
 * It uses custom annotations to enforce validation constraints.
 */
public class Relic {

  @NotNull
  String name;

  @MinValue(100)
  @MaxValue(2_000_000_000)
  int age;

  public Relic(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
