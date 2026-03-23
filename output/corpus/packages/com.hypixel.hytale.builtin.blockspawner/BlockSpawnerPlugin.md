# BlockSpawnerPlugin

Type: class | Package: com.hypixel.hytale.builtin.blockspawner | Extends: JavaPlugin

public class BlockSpawnerPlugin extends JavaPlugin

Plugin class that registers components, systems, and commands for the blockspawner subsystem.

## Fields

- private ComponentType<ChunkStore, BlockSpawner> blockSpawnerComponentType

## Methods

- public static BlockSpawnerPlugin get()
- super(init)
- @Override protected void setup()
- private static void validatePrefabBlock(@Nonnull PrefabBufferValidator.ValidateBlockEvent validateBlockEvent)
- public ComponentType<ChunkStore, BlockSpawner> getBlockSpawnerComponentType()
- public BlockSpawnerSystem()
- @Override public Query<ChunkStore> getQuery()
- @Override public void onEntityAdded(@Nonnull Ref<ChunkStore> ref, @Nonnull AddReason reason, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)
- @Override public void onEntityRemove(@Nonnull Ref<ChunkStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)
- @Override public void onEntityAdd(@Nonnull Holder<ChunkStore> holder, @Nonnull AddReason reason, @Nonnull Store<ChunkStore> store)
- @Override public void onEntityRemoved(@Nonnull Holder<ChunkStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<ChunkStore> store)
