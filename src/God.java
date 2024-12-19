/**
 * The God class represents a god with a name, ability and power points.
 * It uses custom validation.
 */
public class God {

  String name;
  String ability;
  int powerPoints;

  public God(String name, String ability, int powerPoints) {
    this.name = name;
    this.ability = ability;
    this.powerPoints = powerPoints;
  }

  /**
   * Validates the fields of the God instance based on the constraints.
   *
   * @throws IllegalArgumentException if any validation constraint is violated
   */
  public void validate() {
    if (ability == null) {
      throw new IllegalArgumentException("Field 'ability' in class God cannot be null, it is a God! At least...");
    }
    if (name.length() < 2 || name.length() > 30) {
      throw new IllegalArgumentException("Field 'name' in class God must have length between 2 and 30.");
    }
    if (powerPoints < 10_000 || powerPoints > 100_000_000) {
      throw new IllegalArgumentException("Field 'powerPoint' in class God must be between 10 000 and 100 000 000");
    }
  }
}
