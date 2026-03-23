# Directionality

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.directionality

public abstract class Directionality

Class in the directionality subsystem.

## Methods

- getRotationAt(@Nonnull Pattern.Context var1) | PrefabRotation | public method.
- getGeneralPattern() | Pattern | public method.
- getReadRangeWith(@Nonnull Scanner var1) | Vector3i | public method.
- getPossibleRotations() | List<PrefabRotation> | public method.
- noDirectionality() | Directionality | static public method.

Known subclasses: PatternDirectionality, RandomDirectionality, StaticDirectionality

Also in this package: OrthogonalDirection, PatternDirectionality, RandomDirectionality, RotatedPosition, RotatedPositionsScanResult, StaticDirectionality

Complete API:
  public abstract PrefabRotation getRotationAt(Pattern.Context var1)
  public abstract Pattern getGeneralPattern()
  public abstract Vector3i getReadRangeWith(Scanner var1)
  public abstract List<PrefabRotation> getPossibleRotations()
  public static Directionality noDirectionality()
