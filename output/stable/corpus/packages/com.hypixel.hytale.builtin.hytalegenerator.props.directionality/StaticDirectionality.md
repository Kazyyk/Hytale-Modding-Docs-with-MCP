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
