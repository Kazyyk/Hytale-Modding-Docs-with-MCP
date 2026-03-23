# BaseHeightPositionProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders | Extends: PositionProviderAsset

public class BaseHeightPositionProviderAsset extends PositionProviderAsset

A position provider asset used in world generation to define placement positions.

## Fields

- private double minYRead
- private double maxYRead
- private String baseHeightName
- private PositionProviderAsset positionProviderAsset

## Methods

- @Override public PositionProvider build(@Nonnull PositionProviderAsset.Argument argument)
- return new BaseHeightPositionProvider(baseHeight, positionProvider, this.minYRead, this.maxYRead)
- @Override public void cleanUp()
