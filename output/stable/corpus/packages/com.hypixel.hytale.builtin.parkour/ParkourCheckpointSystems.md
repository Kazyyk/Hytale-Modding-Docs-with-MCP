# ParkourCheckpointSystems

Type: class | Package: com.hypixel.hytale.builtin.parkour

public class ParkourCheckpointSystems

## Methods

- @Override public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)
- @Override public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)
- @Override public Query<EntityStore> getQuery()
- public Init(ComponentType<EntityStore, ParkourCheckpoint> parkourCheckpointComponentType)
- @Override public void onEntityAdded(@Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)
- @Override public void onEntityRemove(@Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)
- public Ticking(ComponentType<EntityStore, ParkourCheckpoint> parkourCheckpointComponentType,
            ComponentType<EntityStore, Player> playerComponentType,
            ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>> playerSpatialComponent)` |
| `@Override public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `@Override public` | `void` | `tick(float dt,
            int index,
            @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
            @Nonnull Store<EntityStore> store,
            @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `` | `` | `handleCheckpointUpdate(currentCheckpointByPlayerMap, startTimeByPlayerMap, player, playerUuid, parkourCheckpointIndex, lastIndex)` |
| `` | `private static void` | `handleCheckpointUpdate(@Nonnull Object2IntMap<UUID> currentCheckpointByPlayerMap,
            @Nonnull Object2LongMap<UUID> startTimeByPlayerMap,
            @Nonnull Player player,
            UUID playerUuid,
            int checkpointIndex,
            int lastIndex)` |

Also in this package: EnsureNetworkSendable, Init, ParkourCheckpoint, ParkourCommand, ParkourPlugin, Ticking
