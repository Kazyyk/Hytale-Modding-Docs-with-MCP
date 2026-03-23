# CreateWarpWhenTeleporterPlacedSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.teleporter.system | Extends: RefChangeSystem<ChunkStore, PlacedByInteractionComponent>

public class CreateWarpWhenTeleporterPlacedSystem extends RefChangeSystem<ChunkStore, PlacedByInteractionComponent>

## Fields

- @Nonnull private final ComponentType<ChunkStore, PlacedByInteractionComponent> placedByInteractionComponentType
- @Nonnull private final ComponentType<ChunkStore, Teleporter> teleporterComponentType
- @Nonnull private final ComponentType<ChunkStore, BlockModule.BlockStateInfo> blockStateInfoComponentType
- @Nonnull private final ComponentType<EntityStore, PlayerRef> playerRefComponentType
- @Nonnull private final Query<ChunkStore> query

## Constructors

- public CreateWarpWhenTeleporterPlacedSystem(@Nonnull ComponentType<ChunkStore, PlacedByInteractionComponent> placedByInteractionComponentType,
        @Nonnull ComponentType<ChunkStore, Teleporter> teleporterComponentType,
        @Nonnull ComponentType<ChunkStore, BlockModule.BlockStateInfo> blockStateInfoComponentType,
        @Nonnull ComponentType<EntityStore, PlayerRef> playerRefComponentType)` |

## Methods

- public void onComponentAdded(@Nonnull Ref<ChunkStore> ref,
        @Nonnull PlacedByInteractionComponent placedBy,
        @Nonnull Store<ChunkStore> chunkStore,
        @Nonnull CommandBuffer<ChunkStore> commandBuffer)` |
| `public static` | `void` | `createWarp(@Nonnull WorldChunk worldChunk, @Nonnull BlockModule.BlockStateInfo blockStateInfo, @Nonnull String name)` |
| `public` | `void` | `onComponentSet(@Nonnull Ref<ChunkStore> ref,
        @Nullable PlacedByInteractionComponent oldComponent,
        @Nonnull PlacedByInteractionComponent newComponent,
        @Nonnull Store<ChunkStore> store,
        @Nonnull CommandBuffer<ChunkStore> commandBuffer)` |
| `public` | `void` | `onComponentRemoved(@Nonnull Ref<ChunkStore> ref,
        @Nonnull PlacedByInteractionComponent component,
        @Nonnull Store<ChunkStore> store,
        @Nonnull CommandBuffer<ChunkStore> commandBuffer)` |
| `@Nonnull @Override public` | `ComponentType<ChunkStore, PlacedByInteractionComponent>` | `componentType()` |
| `@Nonnull @Override public` | `Query<ChunkStore>` | `getQuery()` |

Also in this package: ClearUsedTeleporterSystem, TurnOffTeleportersSystem

Complete API:
  public void onComponentAdded(Ref<ChunkStore> ref, PlacedByInteractionComponent placedBy, Store<ChunkStore> chunkStore, CommandBuffer<ChunkStore> commandBuffer)
  public static void createWarp(WorldChunk worldChunk, BlockModule.BlockStateInfo blockStateInfo, String name)
  public void onComponentSet(Ref<ChunkStore> ref, PlacedByInteractionComponent oldComponent, PlacedByInteractionComponent newComponent, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public void onComponentRemoved(Ref<ChunkStore> ref, PlacedByInteractionComponent component, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
  public ComponentType<ChunkStore,PlacedByInteractionComponent> componentType()
  public Query<ChunkStore> getQuery()

Fields:
private final ComponentType<ChunkStore,PlacedByInteractionComponent> placedByInteractionComponentType
private final ComponentType<ChunkStore,Teleporter> teleporterComponentType
private final ComponentType<ChunkStore,BlockModule.BlockStateInfo> blockStateInfoComponentType
private final ComponentType<EntityStore,PlayerRef> playerRefComponentType
private final Query<ChunkStore> query
