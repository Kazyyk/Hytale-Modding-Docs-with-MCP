# CopyCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class CopyCommand extends AbstractPlayerCommand

Copies the current selection to the clipboard. Supports flags for excluding entities (`--noEntities`), copying only entities (`--onlyEntities`), copying empty space (`--empty`), keeping prefab anchors (`--keepanchors`), and using the player position as anchor (`--playerAnchor`). An alternative usage variant accepts explicit min/max coordinates. Also provides static `copySelection()` utility methods for programmatic use.

## Command Registration

- **Name:** `copy`
- **Game Mode:** Creative

## Permission

`hytale.editor.selection.clipboard`

## Arguments

Flags: noEntities, onlyEntities, empty, keepanchors, playerAnchor. Variant: xMin, yMin, zMin, xMax, yMax, zMax (Integer)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand, GlobalMaskSetCommand (and 40 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static Vector3i getPlayerAnchor(Ref<EntityStore> ref, Store<EntityStore> store, boolean usePlayerAnchor)
  public static void copySelection(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public static void copySelection(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, BuilderToolsPlugin.BuilderState builderState, int settings)

Fields:
private static final Message MESSAGE_BUILDER_TOOLS_COPY_CUT_NO_SELECTION
private final FlagArg noEntitiesFlag
private final FlagArg entitiesOnlyFlag
private final FlagArg emptyFlag
private final FlagArg keepAnchorsFlag
private final FlagArg playerAnchorFlag
