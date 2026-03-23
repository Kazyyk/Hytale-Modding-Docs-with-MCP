# RandomDirectionality

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.directionality | Extends: Directionality

public class RandomDirectionality extends Directionality

Concrete implementation extending `Directionality`.

## Fields

- rotations | List<PrefabRotation> | final List<PrefabRotation> field.
- pattern | Pattern | final Pattern field.
- seedGenerator | SeedGenerator | final SeedGenerator field.

## Constructors

- RandomDirectionality(@Nonnull Pattern pattern, int seed) | Creates a new RandomDirectionality instance.

## Methods

- getGeneralPattern() | Pattern | public method.
- getReadRangeWith(@Nonnull Scanner scanner) | Vector3i | public method.
- getPossibleRotations() | List<PrefabRotation> | public method.
- getRotationAt(@Nonnull Pattern.Context context) | PrefabRotation | public method.
