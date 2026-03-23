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
