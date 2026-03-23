# ExtendFaceCommand

Type: class | Package: com.hypixel.hytale.builtin.buildertools.commands | Extends: AbstractCommandCollection

public class ExtendFaceCommand extends AbstractCommandCollection

Extrudes a block face outward from a specified position along a normal direction. Has two usage variants: a basic variant taking position, normal, tool param, shape range, and block type; and an extended variant that additionally accepts min/max region bounds. Validates the block type against the asset map.

## Command Registration

- **Name:** `extendface`
- **Game Mode:** Creative

## Arguments

x, y, z, normalX, normalY, normalZ, toolParam, shapeRange (Integer), blockType (String). Extended: + xMin, yMin, zMin, xMax, yMax, zMax (Integer)

## Execution

All builder tool commands validate that the player is in creative mode via `PrototypePlayerBuilderToolSettings.isOkayToDoCommandsOnSelection()` before executing. Operations are queued via `BuilderToolsPlugin.addToQueue()` for sequential execution on the world thread.

Also in this package: ClearBlocksCommand, ClearEditHistory, ClearEntitiesCommand, ContractSelectionCommand, CopyCommand, CopyRegionCommand, CutCommand, CutRegionCommand, DeselectCommand, EditLineCommand, EnvironmentCommand, ExpandCommand, ExtendFaceBasicCommand, ExtendFaceWithRegionCommand, FillCommand, FlipCommand, FlipWithDirectionCommand, GlobalMaskClearCommand, GlobalMaskCommand, GlobalMaskSetCommand (and 40 more)
