# CopyCutSettings

Type: class | Package: com.hypixel.hytale.builtin.buildertools

public class CopyCutSettings

Defines bitflag constants that control what data is included in copy/cut clipboard operations. Flags are combined with bitwise OR to specify which elements (blocks, entities, fluids, etc.) are copied or cut.

## Constants

- NONE | 0 | No flags set.
- CUT | 2 | Cut mode -- clears the source region after copying.
- EMPTY | 4 | Include empty/air blocks in the clipboard.
- BLOCKS | 8 | Include block data in the clipboard.
- ENTITIES | 16 | Include entities in the clipboard.
- TINT_MAP | 32 | Include tint color data in the clipboard.
- KEEP_ANCHORS | 64 | Preserve prefab anchor entities during the operation.
- FLUIDS | 128 | Include fluid data in the clipboard.

## Usage

These flags are passed to `BuilderState.copyOrCut()` and related clipboard methods. Commands like `CopyCommand` and `CutCommand` compose the appropriate flag combination based on their command-line flags (e.g., `--noEntities`, `--onlyEntities`, `--empty`, `--keepanchors`).

## Related Types

- BuilderToolsPlugin.BuilderState -- uses these flags in copy/cut operations
- BuilderToolsPlugin -- owns the builder state that performs clipboard operations

Also in this package: Action, ActionEntry, BlockColorEntry, BlockColorIndex, BlocksSampleData, BuilderState, BuilderToolsConfig, BuilderToolsPacketHandler, BuilderToolsPlugin, BuilderToolsSystems, BuilderToolsUserData, BuilderToolsUserDataSystem, CachedAccessor, EditOperation, EnsureBuilderTools, EntityChange, FluidChange, PrefabCopyException, PrefabPasteEventSystem, PrototypePlayerBuilderToolSettings (and 2 more)

Fields:
public static final int NONE
public static final int CUT
public static final int EMPTY
public static final int BLOCKS
public static final int ENTITIES
public static final int TINT_MAP
public static final int KEEP_ANCHORS
public static final int FLUIDS
