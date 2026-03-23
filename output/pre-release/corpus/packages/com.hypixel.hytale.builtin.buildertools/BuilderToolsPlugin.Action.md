# BuilderToolsPlugin.Action

Type: enum | Package: com.hypixel.hytale.builtin.buildertools | Extends: java.lang.Enum

public static enum Action

Enum of action types used by the undo/redo system in BuilderToolsPlugin.BuilderState. Each action type identifies the kind of editing operation that was performed, paired with its snapshots in an ActionEntry.

## Enum Constants

- EDIT | A brush tool edit operation.
- EDIT_SELECTION | An edit operation that modified the selection.
- EDIT_LINE | A line drawing operation.
- CUT_COPY | The copy phase of a cut operation.
- CUT_REMOVE | The removal phase of a cut operation.
- COPY | A clipboard copy operation.
- PASTE | A clipboard paste operation.
- CLEAR | A clear/delete operation.
- ROTATE | A clipboard rotation operation.
- FLIP | A clipboard flip/mirror operation.
- MOVE | A move operation.
- STACK | A stack operation.
- SET | A set (fill all blocks) operation.
- REPLACE | A replace operation.
- EXTRUDE | An extrude/extend face operation.
- UPDATE_SELECTION | A selection bounds update.
- WALLS | A walls operation.
- HOLLOW | A hollow operation.
- LAYER | A layer operation.

## Usage

The `ROTATE` action has special handling during undo/redo: entity refs from the previous rotation are cleaned up before restoring the snapshot. See ActionEntry.restore() for details.

## Related Types

- BuilderToolsPlugin.ActionEntry -- pairs an action with snapshots
- BuilderToolsPlugin.BuilderState -- uses these actions in its undo/redo queues

Known implementors: ActionBase, WeightedAction

Also in this package: ActionEntry, BlockColorEntry, BlockColorIndex, BlocksSampleData, BuilderState, BuilderToolsConfig, BuilderToolsPacketHandler, BuilderToolsPlugin, BuilderToolsSystems, BuilderToolsUserData, BuilderToolsUserDataSystem, CachedAccessor, CopyCutSettings, EditOperation, EnsureBuilderTools, EntityChange, FluidChange, PrefabCopyException, PrefabPasteEventSystem, PrototypePlayerBuilderToolSettings (and 2 more)

Complete API:
  public Message toMessage()

Fields:
private final String translationKey
