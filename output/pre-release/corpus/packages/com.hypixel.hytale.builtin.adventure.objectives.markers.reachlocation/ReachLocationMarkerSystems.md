# ReachLocationMarkerSystems

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.markers.reachlocation

public class ReachLocationMarkerSystems

## Methods

- public EnsureNetworkSendable(@Nonnull ComponentType<EntityStore, ReachLocationMarker> reachLocationMarkerComponentType,
- @Nonnull ComponentType<EntityStore, NetworkId> networkIdComponentType)
- @Override public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)
- @Override public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)
- @Override public Query<EntityStore> getQuery()
- public EntityAdded(@Nonnull ComponentType<EntityStore, ReachLocationMarker> reachLocationMarkerComponent,
- @Nonnull ComponentType<EntityStore, TransformComponent> transformComponentType)
- @Override public void onEntityAdded(@Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)
- @Override public void onEntityRemove(@Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)
- public Ticking(@Nonnull ComponentType<EntityStore, ReachLocationMarker> reachLocationMarkerComponent,
            @Nonnull ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>> playerSpatialComponent,
            @Nonnull ComponentType<EntityStore, TransformComponent> transformComponentType,
            @Nonnull ComponentType<EntityStore, UUIDComponent> uuidComponentType)` |
| `@Override public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `@Override public` | `boolean` | `isParallel(int archetypeChunkSize, int taskCount)` |
| `@Override public` | `void` | `tick(float dt,
            int index,
            @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
            @Nonnull Store<EntityStore> store,
            @Nonnull CommandBuffer<EntityStore> commandBuffer)` |

Also in this package: EnsureNetworkSendable, EntityAdded, ReachLocationMarker, ReachLocationMarkerAsset, Ticking

Fields:
private static final HytaleLogger LOGGER
private static final ThreadLocal<Set<UUID>> THREAD_LOCAL_TEMP_UUIDS
