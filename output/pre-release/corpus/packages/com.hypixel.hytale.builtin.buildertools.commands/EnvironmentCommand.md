# EnvironmentCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractPlayerCommand

public class EnvironmentCommand extends AbstractPlayerCommand

Sets the environment for the selection area by looking up an `Environment` asset by name. Validates the environment name against the asset map and provides fuzzy-match suggestions on failure.

## Command Registration

- **Name:** `environment`
- **Game Mode:** Creative

## Aliases

`setenv`, `setenvironment`

## Arguments

environment (String, required)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand, GlobalMaskSetCommand (and 42 more)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private final RequiredArg<String> environmentArg
