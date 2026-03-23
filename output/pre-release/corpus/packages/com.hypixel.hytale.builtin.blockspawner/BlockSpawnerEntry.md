# BlockSpawnerEntry

Type: class | Package: com.hypixel.hytale.builtin.blockspawner | Implements: IWeightedElement

public class BlockSpawnerEntry implements IWeightedElement

Implements `IWeightedElement`.

## Fields

- @Nonnull public static BuilderCodec<BlockSpawnerEntry> CODEC
- private String blockName
- private Holder<ChunkStore> blockComponents
- private double weight
- private BlockSpawnerEntry.RotationMode rotationMode

## Methods

- public String getBlockName()
- public Holder<ChunkStore> getBlockComponents()
- public BlockSpawnerEntry.RotationMode getRotationMode()
- @Override public double getWeight()

## Enum Constants

- `NONE`
- `RANDOM`
- `INHERIT`
