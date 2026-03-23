# BlockModule.ItemContainerStateRefSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.block | Extends: RefSystem<ChunkStore>

public static class BlockModule.ItemContainerStateRefSystem extends RefSystem<ChunkStore>

Ref system that watches for add/remove of item container blocks and triggers spatial resource rebuild.

## Relationships

- Inner class of BlockModule

Also in this package: BlockEntity, BlockEntityPreprocessor, BlockModule, BlockReplaceEvent, BlockStateInfo, BlockStateInfoNeedRebuild, BlockStateInfoRefSystem, MigrateItemContainer, MigrateLaunchPad, MigrationSystem

Complete API:
  public Query<ChunkStore> getQuery()
  public void onEntityAdded(Ref<ChunkStore> ref, AddReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public void onEntityRemove(Ref<ChunkStore> ref, RemoveReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public String toString()

Fields:
private static final Query<ChunkStore> query
