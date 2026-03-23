---
title: "NPCMultiSelectCommandBase"
kind: "abstract class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCMultiSelectCommandBase"
api_surface: false
extends: "NPCWorldCommandBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public abstract class NPCMultiSelectCommandBase extends NPCWorldCommandBase
```

Abstract base class for NPC commands that can operate on multiple NPCs simultaneously. Extends [NPCWorldCommandBase](NPCWorldCommandBase.md) with spatial selection capabilities: cone-based selection from the player's view direction, sphere-based selection around the player, ray-based selection (single entity in crosshair), and role-based filtering.

If an explicit entity argument is provided, operates on that single NPC. Otherwise, uses the player's position and view direction to find NPCs within a configurable cone/sphere. Supports preset selection modes and a nearest-only flag.

## Constants

```java
protected static final float DEFAULT_CONE_ANGLE = 30.0F
```

```java
protected static final float DEFAULT_RANGE = 8.0F
```

```java
protected static final float RANGE_MIN = 0.0F
```

```java
protected static final float RANGE_MAX = 2048.0F
```

```java
protected static final float CONE_ANGLE_MIN = 0.0F
```

```java
protected static final float CONE_ANGLE_MAX = 180.0F
```

## Fields

```java
@Nonnull
protected final OptionalArg<Float> coneAngleArg
```

Optional cone half-angle in degrees (0--180). Default: 30.

```java
@Nonnull
protected final OptionalArg<Float> rangeArg
```

Optional selection range in blocks (0--2048). Default: 8.

## Selection Presets

| Flag | Cone Angle | Nearest Only | Description |
|---|---|---|---|
| `--cone` | 30 | yes | Nearest NPC in a 30-degree cone |
| `--coneAll` | 30 | no | All NPCs in a 30-degree cone |
| `--sphere` | 180 | no | All NPCs in a sphere |
| `--ray` | 0 (raycast) | yes | Single NPC in crosshair |

The `--roles` argument accepts a comma-separated list of role names to filter results. The `--nearest` flag restricts to the closest matching NPC.

## Constructors

```java
public NPCMultiSelectCommandBase(@Nonnull String name, @Nonnull String description)
```

```java
public NPCMultiSelectCommandBase(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
```

```java
public NPCMultiSelectCommandBase(@Nonnull String description)
```

## Methods

```java
@Override
protected void execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)
```

Performs spatial NPC selection and delegates to `execute` for each matched NPC, or to `processEntityList` for batch processing.

```java
protected void processEntityList(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store, @Nonnull List<Ref<EntityStore>> refs)
```

Iterates over the selected entity references and calls `execute` for each NPC. Subclasses may override for custom batch behavior.

## Known Subclasses

- [NPCDebugCommand.ShowCommand](NPCDebugCommand.ShowCommand.md)
- [NPCDebugCommand.SetCommand](NPCDebugCommand.SetCommand.md)
- [NPCDebugCommand.ToggleCommand](NPCDebugCommand.ToggleCommand.md)
- [NPCDebugCommand.DefaultsCommand](NPCDebugCommand.DefaultsCommand.md)
- [NPCDebugCommand.ClearCommand](NPCDebugCommand.ClearCommand.md)

## Related Types

- [NPCWorldCommandBase](NPCWorldCommandBase.md) -- parent base class for single-NPC commands
- [NPCDebugCommand](NPCDebugCommand.md) -- primary user of this base class
