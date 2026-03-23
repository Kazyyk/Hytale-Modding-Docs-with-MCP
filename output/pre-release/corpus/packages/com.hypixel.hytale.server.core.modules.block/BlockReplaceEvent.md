# BlockReplaceEvent

Type: class | Package: com.hypixel.hytale.server.core.modules.block | Extends: EcsEvent

public class BlockReplaceEvent extends EcsEvent

ECS event fired when a block entity is being replaced by a new one. Carries the chunk reference, the self position (which can be updated via `next()` for filler blocks), and the new entity holder. Used by `ItemContainerSystems` to migrate item containers between old and new block entities.

## Constructors

- public BlockReplaceEvent(Ref<ChunkStore> chunkRef, int selfX, int selfY, int selfZ, Holder<ChunkStore> newEntity, int baseX, int baseY, int baseZ)

## Methods

- public Ref<ChunkStore> getChunkRef()
- public int getSelfX()
- public int getSelfY()
- public int getSelfZ()
- public Holder<ChunkStore> getNewEntity()
- public void next(int selfX, int selfY, int selfZ)

## Relationships

- Extends `EcsEvent`
- Dispatched by BlockEntity
- Handled by `ItemContainerSystems.OnReplaced` and `ItemContainerSystems.OnReplacedHolder`

Also in this package: BlockEntity, BlockEntityPreprocessor, BlockModule, BlockStateInfo, BlockStateInfoNeedRebuild, BlockStateInfoRefSystem, ItemContainerStateRefSystem, MigrateItemContainer, MigrateLaunchPad, MigrationSystem

Complete API:
  public Ref<ChunkStore> getChunkRef()
  public int getSelfX()
  public int getSelfY()
  public int getSelfZ()
  public Holder<ChunkStore> getNewEntity()
  public void next(int selfX, int selfY, int selfZ)

Fields:
private final Ref<ChunkStore> chunkRef
private int selfX
private int selfY
private int selfZ
private final Holder<ChunkStore> newEntity
private final int baseX
private final int baseY
private final int baseZ
