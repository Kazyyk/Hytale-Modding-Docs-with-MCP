# UnionPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class UnionPositionProvider extends PositionProvider

Provider supplying UnionPosition values based on context.

## Fields

- @Nonnull private final List<PositionProvider> positionProviders

## Methods

- public UnionPositionProvider(@Nonnull List<PositionProvider> positionProviders)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)
