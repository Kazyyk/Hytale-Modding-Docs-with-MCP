# PatternDirectionality

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.directionality | Extends: Directionality

public class PatternDirectionality extends Directionality

Concrete implementation extending `Directionality`.

## Fields

- rotations | List<PrefabRotation> | final List<PrefabRotation> field.
- south | PrefabRotation | final PrefabRotation field.
- north | PrefabRotation | final PrefabRotation field.
- east | PrefabRotation | final PrefabRotation field.
- west | PrefabRotation | final PrefabRotation field.
- southPattern | Pattern | final Pattern field.
- northPattern | Pattern | final Pattern field.
- eastPattern | Pattern | final Pattern field.
- westPattern | Pattern | final Pattern field.
- generalPattern | Pattern | final Pattern field.
- seedGenerator | SeedGenerator | final SeedGenerator field.

## Methods

- getGeneralPattern() | Pattern | public method.
- getReadRangeWith(@Nonnull Scanner scanner) | Vector3i | public method.
- getPossibleRotations() | List<PrefabRotation> | public method.
- getRotationAt(@Nonnull Pattern.Context context) | PrefabRotation | public method.
