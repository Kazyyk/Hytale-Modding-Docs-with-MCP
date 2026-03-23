---
title: "BuilderToolsPacketHandler"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsPacketHandler"
api_surface: false
extends: ~
implements:
  - "SubPacketHandler"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "networking"
  - "packets"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public class BuilderToolsPacketHandler implements SubPacketHandler
```

Handles all client-to-server packets for the builder tools system. Registered as a sub-packet handler via `ServerManager.registerSubPacketHandlers()` during [BuilderToolsPlugin](BuilderToolsPlugin.md) setup. If the plugin is disabled at registration time, all builder tool packet IDs are registered as no-op handlers.

## Permission Model

All handlers require the base permission `hytale.editor.builderTools`. Some handlers require additional sub-permissions:

| Permission | Handlers |
|---|---|
| `hytale.editor.builderTools` | Entity actions, entity transforms, entity scale, transformation mode, prefab unselect, entity pickup, entity light, NPC debug, entity collision |
| `hytale.editor.brush.config` | Tool argument updates |
| `hytale.editor.brush.use` | On-use interaction (brush click), line action |
| `hytale.editor.selection.use` | Selection update |
| `hytale.editor.selection.modify` | Extrude action |
| `hytale.editor.selection.clipboard` | Rotate clipboard, paste clipboard, ask for clipboard, selection transform, stack area |
| `hytale.editor.history` | Undo/redo (via general action handler) |

When permission is denied, the player receives the `server.builderTools.usageDenied` translation message.

## Constructor

```java
public BuilderToolsPacketHandler(@Nonnull IPacketHandler packetHandler)
```

## Packet Handlers

### registerHandlers

```java
@Override
public void registerHandlers()
```

Registers all packet handlers with the parent `IPacketHandler`. When the plugin is disabled, registers no-op handlers for packet IDs 400, 401, 412, 409, 403, 406, 407, 413, 414, 417.

### Tool Argument Update (ID 400)

```java
public void handleBuilderToolArgUpdate(
    @Nonnull BuilderToolArgUpdate packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)
```

Delegates to `BuilderToolsPlugin.onToolArgUpdate()` to update a builder tool's argument value for the player.

### Entity Action (ID 401)

```java
public void handleBuilderToolEntityAction(
    @Nonnull BuilderToolEntityAction packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)
```

Handles Freeze, Clone, and Remove entity actions. Prevents targeting players. Freeze delegates to `npc freeze --toggle` command, Clone to `EntityCloneCommand.cloneEntity()`, and Remove to `EntityRemoveCommand.removeEntity()`.

### General Action (ID 412)

```java
public void handleBuilderToolGeneralAction(
    @Nonnull BuilderToolGeneralAction packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)
```

Dispatches general builder tool actions: `HistoryUndo`, `HistoryRedo`, `SelectionCopy`, `SelectionPosition1`, `SelectionPosition2`, `ActivateToolMode`, and `DeactivateToolMode`. Each action checks its own sub-permission before executing.

### Selection Update (ID 409)

```java
public void handleBuilderToolSelectionUpdate(
    @Nonnull BuilderToolSelectionUpdate packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)
```

Updates the player's selection bounds from the packet's min/max coordinates.

### Brush On-Use Interaction (ID 413)

```java
public void handleBuilderToolOnUseInteraction(
    @Nonnull BuilderToolOnUseInteraction packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)
```

Queues a brush edit operation on the player's builder state.

### Extrude Action (ID 403)

```java
public void handleBuilderToolExtrudeAction(
    @Nonnull BuilderToolExtrudeAction packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)
```

Handles the Extrude tool, reading `ExtrudeDepth`, `ExtrudeRadius`, and `ExtrudeMaterial` from the active builder tool's arguments.

### Line Action (ID 414)

```java
public void handleBuilderToolLineAction(
    @Nonnull BuilderToolLineAction packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)
```

Draws a line of blocks between start and end coordinates using the Line tool's parameters: width, height, shape, origin, wall thickness, spacing, density, and material.

### Clipboard Operations

- **Rotate Clipboard (ID 406):** Rotates the player's clipboard by the specified axis and angle.
- **Paste Clipboard (ID 407):** Pastes the clipboard at the given coordinates.
- **Ask for Clipboard (ID 410):** Sends clipboard block, fluid, and entity data back to the client for preview rendering.
- **Selection Transform (ID 405):** Applies a rotation and translation transform to the selection, with optional cut of the original. Handles large selections (over 20,000 blocks) with warning messages.
- **Stack Area (ID 404):** Stacks the selected area in a normal direction for a given number of repetitions.

### Entity Manipulation

- **Set Entity Transform (ID 402):** Updates entity position, look orientation, and body orientation.
- **Set Entity Scale (ID 420):** Sets the scale of a prop entity via `EntityScaleComponent`.
- **Set Entity Pickup Enabled (ID 421):** Toggles the pickup interaction on a prop entity by adding/removing `Interactable`, `Interactions`, and `PreventPickup` components.
- **Set Entity Light (ID 422):** Adds or removes `DynamicLight` and `PersistentDynamicLight` components on an entity.
- **Set NPC Debug (ID 423):** Toggles NPC debug display via the `npc debug` command.
- **Set Entity Collision (ID 425):** Sets or removes `HitboxCollision` component on prop/NPC entities.

### Hotbar Management

- **Load Hotbar (ID 106):** Loads a saved hotbar row.
- **Save Hotbar (ID 107):** Saves the current hotbar row.

### Prefab Unselect (ID 417)

```java
public void handlePrefabUnselectPrefab(
    @Nonnull PrefabUnselectPrefab packet,
    @Nonnull PlayerRef playerRef,
    @Nonnull Ref<EntityStore> ref,
    @Nonnull World world,
    @Nonnull Store<EntityStore> store
)
```

Clears the selected prefab in the player's active prefab editing session.

### Utility

```java
@Nonnull
public Vector3i fromBlockPosition(@Nonnull BlockPosition position)
```

Converts a protocol `BlockPosition` to a `Vector3i`.

## Related Types

- [BuilderToolsPlugin](BuilderToolsPlugin.md) -- registers this handler during setup
- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- per-player state that most handlers operate on
- [PrototypePlayerBuilderToolSettings](PrototypePlayerBuilderToolSettings.md) -- per-player settings for transformation mode and brush state
- [EditOperation](EditOperation.md) -- tracks block changes for brush operations
