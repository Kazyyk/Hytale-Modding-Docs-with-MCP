# TurnOffTeleportersSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.teleporter.system | Extends: RefSystem<ChunkStore>

public class TurnOffTeleportersSystem extends RefSystem<ChunkStore>

## Fields

- public static final Query<ChunkStore> QUERY

## Methods

- @Override public void onEntityAdded(@Nonnull Ref<ChunkStore> ref, @Nonnull AddReason reason, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)
- @Override public void onEntityRemove(@Nonnull Ref<ChunkStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)
- public static void updatePortalBlocksInWorld(World world)
- private static void updatePortalBlockInWorld(Ref<ChunkStore> ref, ComponentAccessor<ChunkStore> store)
- public static void updatePortalBlockInWorld(ComponentAccessor<ChunkStore> store, Teleporter teleporter, BlockModule.BlockStateInfo blockStateInfo)
- @NullableDecl @Override public Query<ChunkStore> getQuery()

Also in this package: ClearUsedTeleporterSystem, CreateWarpWhenTeleporterPlacedSystem

Complete API:
  public void onEntityAdded(Ref<ChunkStore> ref, AddReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public void onEntityRemove(Ref<ChunkStore> ref, RemoveReason reason, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public static void updatePortalBlocksInWorld(World world)
  private static void updatePortalBlockInWorld(Ref<ChunkStore> ref, ComponentAccessor<ChunkStore> store)
  public static void updatePortalBlockInWorld(ComponentAccessor<ChunkStore> store, Teleporter teleporter, BlockModule.BlockStateInfo blockStateInfo)
  public Query<ChunkStore> getQuery()

Fields:
public static final Query<ChunkStore> QUERY
