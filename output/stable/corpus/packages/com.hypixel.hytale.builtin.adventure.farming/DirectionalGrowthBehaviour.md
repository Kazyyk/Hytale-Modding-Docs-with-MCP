# DirectionalGrowthBehaviour

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.stages.spread | Extends: SpreadGrowthBehaviour

public class DirectionalGrowthBehaviour extends SpreadGrowthBehaviour

A spread growth behaviour that places blocks at randomized positions within configurable horizontal and vertical ranges from the source. Supports weighted random block type selection and vertical direction constraints (`UPWARDS`, `DOWNWARDS`, `BOTH`). Validates placement against block physics before placing.

## Fields

- protected IWeightedMap<DirectionalGrowthBehaviour.BlockTypeWeight> blockTypes
- protected IntRange horizontalRange
- protected IntRange verticalRange
- protected DirectionalGrowthBehaviour.VerticalDirection verticalDirection

## Methods

- public IWeightedMap<DirectionalGrowthBehaviour.BlockTypeWeight> getBlockTypes()
- public IntRange getHorizontalRange()
- public IntRange getVerticalRange()
- public DirectionalGrowthBehaviour.VerticalDirection getVerticalDirection()
- public void execute(@Nonnull ComponentAccessor<ChunkStore> componentAccessor, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int worldX, int worldY, int worldZ, float newSpreadRate)

## Inner Classes

- BlockTypeWeight | class | Weighted block type entry for spread selection.
- VerticalDirection | enum | Direction constraint for vertical spread.
