# BoundPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class BoundPositionProvider extends PositionProvider

Provider supplying BoundPosition values based on context.

## Fields

- @Nonnull private final PositionProvider positionProvider
- private final Bounds3d bounds

## Methods

- public BoundPositionProvider(@Nonnull PositionProvider positionProvider, @Nonnull Bounds3d bounds)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)
