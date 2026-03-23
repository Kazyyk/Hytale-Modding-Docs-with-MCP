# CachedPositionProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders | Extends: PositionProviderAsset

public class CachedPositionProviderAsset extends PositionProviderAsset

A position provider asset used in world generation to define placement positions.

## Fields

- private PositionProviderAsset childAsset
- private int sectionSize
- private int cacheSize

## Methods

- @Override public PositionProvider build(@Nonnull PositionProviderAsset.Argument argument)
- return new CachedPositionProvider(childPositions, this.sectionSize, this.cacheSize, false)
- @Override public void cleanUp()
