# PrototypePlayerBuilderToolSettings.FluidChange

Type: record | Package: com.hypixel.hytale.builtin.buildertools

public record FluidChange(int x, int y, int z, int fluidId, byte fluidLevel)

Inner record of PrototypePlayerBuilderToolSettings that stores a fluid position and state for clipboard transform operations. Created during selection copy/transform when fluid data is captured from the selection region. Coordinates are relative to the selection anchor.

## Record Components

- x | int | X coordinate relative to the selection anchor.
- y | int | Y coordinate relative to the selection anchor.
- z | int | Z coordinate relative to the selection anchor.
- fluidId | int | Numeric fluid type ID.
- fluidLevel | byte | Fluid level at this position.

## Related Types

- PrototypePlayerBuilderToolSettings -- enclosing class
- PrototypePlayerBuilderToolSettings.EntityChange -- companion record for entity data

Also in this package: Action, ActionEntry, BlockColorEntry, BlockColorIndex, BlocksSampleData, BuilderState, BuilderToolsConfig, BuilderToolsPacketHandler, BuilderToolsPlugin, BuilderToolsSystems, BuilderToolsUserData, BuilderToolsUserDataSystem, CachedAccessor, CopyCutSettings, EditOperation, EnsureBuilderTools, EntityChange, PrefabCopyException, PrefabPasteEventSystem, PrototypePlayerBuilderToolSettings (and 2 more)
