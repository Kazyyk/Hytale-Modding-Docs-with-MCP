# ColumnRandomScanner

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.scanners | Extends: Scanner

public class ColumnRandomScanner extends Scanner

## Fields

- private final int minY
- private final int maxY
- private final boolean isRelativeToPosition
- private final double baseHeight
- private final int resultsCap
- private final SeedGenerator seedGenerator
- private final ColumnRandomScanner.Strategy strategy
- private final SpaceSize scanSpaceSize

## Methods

- @Override @Nonnull public List<Vector3i> scan(@Nonnull Scanner.Context context)
- @Nonnull private List<Vector3i> scanPickValid(@Nonnull Scanner.Context context)
- @Nonnull private List<Vector3i> scanDartThrow(@Nonnull Scanner.Context context)
- @Override @Nonnull public SpaceSize scanSpace()

## Inner Types

- `ColumnRandomScanner.Strategy`
