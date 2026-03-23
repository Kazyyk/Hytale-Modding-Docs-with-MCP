# BlockModule.MigrateItemContainer

Type: class | Package: com.hypixel.hytale.server.core.modules.block | Extends: HolderSystem<ChunkStore>

public static class BlockModule.MigrateItemContainer extends HolderSystem<ChunkStore>

Migration system that runs on chunk load to handle legacy item container data format changes.

## Relationships

- Inner class of BlockModule

Also in this package: BlockEntity, BlockEntityPreprocessor, BlockModule, BlockReplaceEvent, BlockStateInfo, BlockStateInfoNeedRebuild, BlockStateInfoRefSystem, ItemContainerStateRefSystem, MigrateLaunchPad, MigrationSystem

Complete API:
  public void onEntityAdd(Holder<ChunkStore> holder, AddReason reason, Store<ChunkStore> store)
  public void onEntityRemoved(Holder<ChunkStore> holder, RemoveReason reason, Store<ChunkStore> store)
  public Query<ChunkStore> getQuery()
