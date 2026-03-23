# StaticDirectionality

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.directionality | Extends: Directionality

public class StaticDirectionality extends Directionality

Concrete implementation extending `Directionality`.

## Fields

- possibleRotations | List<PrefabRotation> | final List<PrefabRotation> field.
- rotation | PrefabRotation | final PrefabRotation field.
- pattern | Pattern | final Pattern field.

## Constructors

- StaticDirectionality(@Nonnull PrefabRotation rotation, @Nonnull Pattern pattern) | Creates a new StaticDirectionality instance.

## Methods

- getRotationAt(@Nonnull Pattern.Context context) | PrefabRotation | public method.
- getGeneralPattern() | Pattern | public method.
- getReadRangeWith(@Nonnull Scanner scanner) | Vector3i | public method.
- getPossibleRotations() | List<PrefabRotation> | public method.

Also in this package: Directionality, OrthogonalDirection, PatternDirectionality, RandomDirectionality, RotatedPosition, RotatedPositionsScanResult

Complete API:
  public PrefabRotation getRotationAt(Pattern.Context context)
  public Pattern getGeneralPattern()
  public Vector3i getReadRangeWith(Scanner scanner)
  public List<PrefabRotation> getPossibleRotations()

Fields:
private final List<PrefabRotation> possibleRotations
private final PrefabRotation rotation
private final Pattern pattern
