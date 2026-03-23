# BaseHeightPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class BaseHeightPositionProvider extends PositionProvider

Provider supplying BaseHeightPosition values based on context.

## Fields

- @Nonnull private final double baseHeight
- private final double maxYInput
- private final double minYInput
- @Nonnull private final PositionProvider positionProvider

## Methods

- public BaseHeightPositionProvider(double baseHeight, @Nonnull PositionProvider positionProvider, double minYInput, double maxYInput)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)
