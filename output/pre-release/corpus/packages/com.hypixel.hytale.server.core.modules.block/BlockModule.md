# BlockModule

Type: class | Package: com.hypixel.hytale.server.core.modules.block | Extends: JavaPlugin

public class BlockModule extends JavaPlugin

Core plugin module for the block entity system. Registers chunk store components (`BlockStateInfo`, `ItemContainerBlock`, `LaunchPad`, `RespawnBlock`, `BlockMapMarker`), their associated systems, spatial indexing for item container blocks, and block entity preprocessing during chunk load. Provides static accessors for looking up block entities by world coordinates.

## Static Methods

- public static BlockModule get()
- public static Ref<ChunkStore> ensureBlockEntity(WorldChunk chunk, int x, int y, int z)
- public static Ref<ChunkStore> getBlockEntity(World world, int x, int y, int z)
- public static <T extends Component<ChunkStore>> T getComponent(ComponentType<ChunkStore, T> componentType, World world, int x, int y, int z)

## Instance Methods

- public ComponentType<ChunkStore, BlockStateInfo> getBlockStateInfoComponentType()
- public ComponentType<ChunkStore, LaunchPad> getLaunchPadComponentType()
- public ComponentType<ChunkStore, RespawnBlock> getRespawnBlockComponentType()
- public ComponentType<ChunkStore, BlockMapMarker> getBlockMapMarkerComponentType()
- public ComponentType<ChunkStore, ItemContainerBlock> getItemContainerBlockComponentType()

## Inner Classes

- BlockModule.BlockEntityPreprocessor | class | Thread-local preprocessor for generating block entities during chunk load
- BlockModule.BlockStateInfo | class | Component tracking a block entity's position within its chunk
- BlockModule.BlockStateInfoNeedRebuild | class | Resource flag indicating spatial index needs rebuilding
- BlockModule.BlockStateInfoRefSystem | class | Ref system managing block entity add/remove in chunk component maps
- BlockModule.ItemContainerStateRefSystem | class | System for item container state tracking
- BlockModule.MigrateItemContainer | class | Migration system for item container block data

## Relationships

- Extends `JavaPlugin`
- Manages `ItemContainerBlock` and BlockReplaceEvent
