# FieldFunctionOccurrencePositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class FieldFunctionOccurrencePositionProvider extends PositionProvider

Provider supplying FieldFunctionOccurrencePosition values based on context.

## Constants

- public static final double FP_RESOLUTION

## Fields

- @Nonnull private final Density field
- @Nonnull private final PositionProvider positionProvider
- @Nonnull private final SeedGenerator seedGenerator

## Methods

- public FieldFunctionOccurrencePositionProvider(@Nonnull Density field, @Nonnull PositionProvider positionProvider, int seed)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)
