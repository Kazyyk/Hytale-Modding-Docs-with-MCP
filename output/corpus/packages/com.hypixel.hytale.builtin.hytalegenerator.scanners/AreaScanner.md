# AreaScanner

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.scanners | Extends: Scanner

public class AreaScanner extends Scanner

## Fields

- private final AreaScanner.ScanShape scanShape
- private final int range
- private final int resultCap
- private final Scanner childScanner
- private final List<Vector2i> scanOrder
- private final SpaceSize scanSpaceSize

## Methods

- @Override @Nonnull public List<Vector3i> scan(@Nonnull Scanner.Context context)
- @Override @Nonnull public SpaceSize scanSpace()

## Inner Types

- `AreaScanner.ScanShape`
- `AreaScanner.Verticality`
