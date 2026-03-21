---
title: "buildertools"
kind: "index"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "protocol"
  - "buildertools"
  - "index"
---

**Package:** `com.hypixel.hytale.protocol.packets.buildertools`

Protocol packet and data structure types for the builder tools system. Includes packets for tool actions (selection, extrusion, clipboard, entity manipulation), argument structures for tool configuration, brush data, and supporting enums.

## Types

| Type | Kind | Description |
|---|---|---|
| [Axis](Axis.md) | enum | Axis enum representing the three spatial dimensions.... |
| [BrushAxis](BrushAxis.md) | enum | Brush axis selection for builder tool brush operations.... |
| [BrushOrigin](BrushOrigin.md) | enum | Origin point for brush placement in builder tools.... |
| [BrushShape](BrushShape.md) | enum | Shape presets for builder tool brush operations.... |
| [BuilderToolAction](BuilderToolAction.md) | enum | Actions available for the general builder tool packet.... |
| [BuilderToolArgGroup](BuilderToolArgGroup.md) | enum | Groups for builder tool arguments.... |
| [BuilderToolArgType](BuilderToolArgType.md) | enum | Type discriminator for builder tool argument values.... |
| [EntityToolAction](EntityToolAction.md) | enum | Actions for the entity tool packet.... |
| [BuilderToolArgUpdate](BuilderToolArgUpdate.md) | class | Updates a builder tool argument value by token, section, slot, and group.... |
| [BuilderToolEntityAction](BuilderToolEntityAction.md) | class | Sends an entity tool action (remove, duplicate, copy) for a specific entity.... |
| [BuilderToolExtrudeAction](BuilderToolExtrudeAction.md) | class | Extrudes a block face at a position along a normal direction.... |
| [BuilderToolGeneralAction](BuilderToolGeneralAction.md) | class | Sends a general builder tool action (selection, copy, undo/redo, tool mode toggl... |
| [BuilderToolHideAnchors](BuilderToolHideAnchors.md) | class | Instructs the client to hide all builder tool anchors. Contains no fields.... |
| [BuilderToolLaserPointer](BuilderToolLaserPointer.md) | class | Renders a laser pointer line between two 3D points for a player with configurabl... |
| [BuilderToolLineAction](BuilderToolLineAction.md) | class | Draws a line of blocks between two positions.... |
| [BuilderToolOnUseInteraction](BuilderToolOnUseInteraction.md) | class | Sent when the player uses a builder tool interaction at a block position. Includ... |
| [BuilderToolPasteClipboard](BuilderToolPasteClipboard.md) | class | Pastes the clipboard contents at the specified position.... |
| [BuilderToolRotateClipboard](BuilderToolRotateClipboard.md) | class | Rotates the clipboard by a specified angle around an axis.... |
| [BuilderToolSelectionToolAskForClipboard](BuilderToolSelectionToolAskForClipboard.md) | class | Requests the server to send the current clipboard data. Contains no fields.... |
| [BuilderToolSelectionToolReplyWithClipboard](BuilderToolSelectionToolReplyWithClipboard.md) | class | Server response containing clipboard block and fluid change data. Compressed pac... |
| [BuilderToolSelectionTransform](BuilderToolSelectionTransform.md) | class | Applies a transform (rotation and translation) to the current selection.... |
| [BuilderToolSelectionUpdate](BuilderToolSelectionUpdate.md) | class | Updates the selection region bounds.... |
| [BuilderToolSetEntityCollision](BuilderToolSetEntityCollision.md) | class | Sets collision properties on an entity by name.... |
| [BuilderToolSetEntityLight](BuilderToolSetEntityLight.md) | class | Sets light properties on an entity.... |
| [BuilderToolSetEntityPickupEnabled](BuilderToolSetEntityPickupEnabled.md) | class | Toggles pickup capability on an entity.... |
| [BuilderToolSetEntityScale](BuilderToolSetEntityScale.md) | class | Sets the scale of an entity.... |
| [BuilderToolSetEntityTransform](BuilderToolSetEntityTransform.md) | class | Sets the full transform (position and rotation) of an entity.... |
| [BuilderToolSetNPCDebug](BuilderToolSetNPCDebug.md) | class | Toggles NPC debug mode for a specific entity.... |
| [BuilderToolSetTransformationModeState](BuilderToolSetTransformationModeState.md) | class | Sets transformation mode state for the builder tool.... |
| [BuilderToolShowAnchor](BuilderToolShowAnchor.md) | class | Shows a builder tool anchor at a position with a label.... |
| [BuilderToolsSetSoundSet](BuilderToolsSetSoundSet.md) | class | Sets the sound set for builder tool operations by entity ID.... |
| [BuilderToolStackArea](BuilderToolStackArea.md) | class | Stacks the selection in a direction by a count.... |
| [BuilderToolState](BuilderToolState.md) | class | Server-to-client packet defining the full state of the builder tool including se... |
| [PrefabUnselectPrefab](PrefabUnselectPrefab.md) | class | Deselects the currently selected prefab. Contains no fields.... |
| [BuilderToolArg](BuilderToolArg.md) | class | Composite builder tool argument supporting multiple typed sub-arguments (bool, f... |
| [BuilderToolBlockArg](BuilderToolBlockArg.md) | class | Block argument for builder tools with an optional default value and pattern supp... |
| [BuilderToolBoolArg](BuilderToolBoolArg.md) | class | Boolean argument for builder tools with a default value.... |
| [BuilderToolBrushAxisArg](BuilderToolBrushAxisArg.md) | class | Brush axis argument for builder tools with a default `BrushAxis` value.... |
| [BuilderToolBrushData](BuilderToolBrushData.md) | class | Complete brush configuration data containing dimensions, shape, origin, rotation... |
| [BuilderToolBrushOriginArg](BuilderToolBrushOriginArg.md) | class | Brush origin argument with a default `BrushOrigin` value.... |
| [BuilderToolBrushShapeArg](BuilderToolBrushShapeArg.md) | class | Brush shape argument with a default `BrushShape` value.... |
| [BuilderToolFloatArg](BuilderToolFloatArg.md) | class | Float argument for builder tools with default, min, and max values.... |
| [BuilderToolIntArg](BuilderToolIntArg.md) | class | Integer argument for builder tools with default, min, and max values.... |
| [BuilderToolMaskArg](BuilderToolMaskArg.md) | class | Mask argument for builder tools with an optional default mask string.... |
| [BuilderToolOptionArg](BuilderToolOptionArg.md) | class | Option-list argument for builder tools with a default selection and array of opt... |
| [BuilderToolRotationArg](BuilderToolRotationArg.md) | class | Rotation argument with a default `Rotation` value.... |
| [BuilderToolStringArg](BuilderToolStringArg.md) | class | String argument for builder tools with an optional default value.... |
