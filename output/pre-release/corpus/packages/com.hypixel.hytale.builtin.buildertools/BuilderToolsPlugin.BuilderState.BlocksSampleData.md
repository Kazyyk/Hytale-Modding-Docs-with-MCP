# BuilderToolsPlugin.BuilderState.BlocksSampleData

Type: class | Package: com.hypixel.hytale.builtin.buildertools

public static class BlocksSampleData

Inner class of BuilderState that accumulates block sampling data during editing operations. Used to determine the majority block type in a region (including and excluding air).

## Fields

- mainBlock | int | 0 | Block ID of the most common block (including air).
- mainBlockCount | int | 0 | Count of the most common block (including air).
- mainBlockNotAir | int | 0 | Block ID of the most common non-air block.
- mainBlockNotAirCount | int | 0 | Count of the most common non-air block.

## Related Types

- BuilderToolsPlugin.BuilderState -- enclosing class
- BuilderToolsPlugin.BuilderState.SmoothSampleData -- companion class for smooth sampling

Also in this package: Action, ActionEntry, BlockColorEntry, BlockColorIndex, BuilderState, BuilderToolsConfig, BuilderToolsPacketHandler, BuilderToolsPlugin, BuilderToolsSystems, BuilderToolsUserData, BuilderToolsUserDataSystem, CachedAccessor, CopyCutSettings, EditOperation, EnsureBuilderTools, EntityChange, FluidChange, PrefabCopyException, PrefabPasteEventSystem, PrototypePlayerBuilderToolSettings (and 2 more)

Fields:
public int mainBlock
public int mainBlockCount
public int mainBlockNotAir
public int mainBlockNotAirCount
