# ClearUsedTeleporterSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.teleporter.system | Extends: EntityTickingSystem<EntityStore>

public class ClearUsedTeleporterSystem extends EntityTickingSystem<EntityStore>

## Fields

- @Nonnull public static final Duration TELEPORTER_GLOBAL_COOLDOWN
- @Nonnull private static final Set<Dependency<EntityStore>> DEPENDENCIES
- @Nonnull private final ComponentType<EntityStore, UsedTeleporter> usedTeleporterComponentType
- @Nonnull private final ComponentType<EntityStore, TransformComponent> transformComponentType
- @Nonnull private final ComponentType<EntityStore, TeleportRecord> teleportRecordComponentType
- @Nonnull private final ComponentType<EntityStore, Teleport> teleportComponentType
- @Nonnull private final ComponentType<EntityStore, PendingTeleport> pendingTeleportComponentType

## Constructors

- public ClearUsedTeleporterSystem(@Nonnull ComponentType<EntityStore, UsedTeleporter> usedTeleporterComponentType,
        @Nonnull ComponentType<EntityStore, TransformComponent> transformComponentType,
        @Nonnull ComponentType<EntityStore, TeleportRecord> teleportRecordComponentType,
        @Nonnull ComponentType<EntityStore, Teleport> teleportComponentType,
        @Nonnull ComponentType<EntityStore, PendingTeleport> pendingTeleportComponentType)` |

## Methods

- @Nonnull @Override public Set<Dependency<EntityStore>> getDependencies()
- @Override public void tick(float dt,
        int index,
        @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
        @Nonnull Store<EntityStore> store,
        @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `private` | `boolean` | `shouldClear(@Nonnull World world, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk)` |
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |

Also in this package: CreateWarpWhenTeleporterPlacedSystem, TurnOffTeleportersSystem

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  private boolean shouldClear(World world, int index, ArchetypeChunk<EntityStore> archetypeChunk)
  public Query<EntityStore> getQuery()

Fields:
public static final Duration TELEPORTER_GLOBAL_COOLDOWN
private static final Set<Dependency<EntityStore>> DEPENDENCIES
private final ComponentType<EntityStore,UsedTeleporter> usedTeleporterComponentType
private final ComponentType<EntityStore,TransformComponent> transformComponentType
private final ComponentType<EntityStore,TeleportRecord> teleportRecordComponentType
private final ComponentType<EntityStore,Teleport> teleportComponentType
private final ComponentType<EntityStore,PendingTeleport> pendingTeleportComponentType
