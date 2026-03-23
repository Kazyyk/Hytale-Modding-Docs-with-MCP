# HotbarSwitchCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class HotbarSwitchCommand extends AbstractPlayerCommand

Saves or loads a hotbar slot configuration. Takes a hotbar slot index (0-9, validated) and a `--save` flag to switch between save and load mode. Delegates to `HotbarManager.saveHotbar()` or `loadHotbar()`.

## Command Registration

- **Name:** `hotbar`
- **Game Mode:** Creative

## Arguments

hotbarSlot (Integer, 0-9, required). Flag: save

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand (and 40 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<Integer> hotbarSlotArg
private final FlagArg saveInsteadOfLoadArg
