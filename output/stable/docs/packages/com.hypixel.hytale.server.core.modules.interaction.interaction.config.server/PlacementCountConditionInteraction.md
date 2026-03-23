---
title: "PlacementCountConditionInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.PlacementCountConditionInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "block"
  - "condition"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class PlacementCountConditionInteraction extends SimpleInstantInteraction
```

Condition interaction that checks the placement count of a specific block type. Queries the `BlockCounter` resource to get how many of the configured block type have been placed, then compares against the threshold value. The interaction succeeds if the condition is met, fails otherwise. Waits for server data.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `Block` | `String` | Yes (inherited) | -- | The block type ID to check placement count for. |
| `Value` | `int` | No (inherited) | `0` | The threshold value for comparison. |
| `LessThan` | `boolean` | No (inherited) | `true` | If `true`, succeeds when count < value. If `false`, succeeds when count > value. |

## Fields

| Type | Name | Default | Description |
|---|---|---|---|
| `String` | `blockType` | -- | Block type ID to query. |
| `int` | `value` | `0` | Comparison threshold. |
| `boolean` | `lessThan` | `true` | Comparison direction. |

## Methods

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Retrieves the `BlockCounter` resource, gets the placement count for the configured block type, and sets state to `Finished` or `Failed` based on the comparison.

```java
@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()
```

Returns `WaitForDataFrom.Server`.

## See Also

- `BlockCounter` -- resource that tracks block placement counts
