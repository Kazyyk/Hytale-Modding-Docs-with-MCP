# BuilderToolsSystems

Type: class | Package: com.hypixel.hytale.builtin.buildertools

public class BuilderToolsSystems

Container class for ECS systems related to builder tools. Contains the EnsureBuilderTools inner class, which is an `EntityStore` holder system that populates newly added player entities with builder tool items.

## Inner Types

- EnsureBuilderTools -- `HolderSystem<EntityStore>` that ensures builder tool items are in the player's tools inventory on entity add

## Related Types

- BuilderToolsPlugin -- registers `EnsureBuilderTools` as an entity store system during setup
- BuilderToolsUserDataSystem -- companion system that ensures `BuilderToolsUserData` component

Also in this package: Action, ActionEntry, BlockColorEntry, BlockColorIndex, BlocksSampleData, BuilderState, BuilderToolsConfig, BuilderToolsPacketHandler, BuilderToolsPlugin, BuilderToolsUserData, BuilderToolsUserDataSystem, CachedAccessor, CopyCutSettings, EditOperation, EnsureBuilderTools, EntityChange, FluidChange, PrefabCopyException, PrefabPasteEventSystem, PrototypePlayerBuilderToolSettings (and 2 more)
