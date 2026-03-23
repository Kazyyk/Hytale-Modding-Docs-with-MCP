# FieldFunctionOccurrencePositionProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders | Extends: PositionProviderAsset

public class FieldFunctionOccurrencePositionProviderAsset extends PositionProviderAsset

A position provider asset used in world generation to define placement positions.

## Fields

- private String seed
- private DensityAsset densityAsset
- private PositionProviderAsset positionProviderAsset

## Methods

- @Override public PositionProvider build(@Nonnull PositionProviderAsset.Argument argument)
- return new FieldFunctionOccurrencePositionProvider(functionTree, positionProvider, intSeed)
- @Override public void cleanUp()
