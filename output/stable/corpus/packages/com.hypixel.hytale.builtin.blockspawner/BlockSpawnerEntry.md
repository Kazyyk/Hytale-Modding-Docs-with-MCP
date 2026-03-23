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

Also in this package: BlockSpawnerPlugin, BlockSpawnerSystem, BlockSpawnerTable, MigrateBlockSpawner, RotationMode

Complete API:
  public String getBlockName()
  public Holder<ChunkStore> getBlockComponents()
  public BlockSpawnerEntry.RotationMode getRotationMode()
  public double getWeight()

Fields:
public static BuilderCodec<BlockSpawnerEntry> CODEC
public static final BlockSpawnerEntry[] EMPTY_ARRAY
private String blockName
private Holder<ChunkStore> blockComponents
private double weight
private BlockSpawnerEntry.RotationMode rotationMode
