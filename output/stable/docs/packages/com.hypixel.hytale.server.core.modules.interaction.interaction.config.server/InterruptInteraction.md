---
title: "InterruptInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.InterruptInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "cancel"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class InterruptInteraction extends SimpleInstantInteraction
```

Interrupts (cancels) active interaction chains on the target entity. Can optionally filter by interaction type, require a specific tag on the root interaction, or exclude chains with a specific tag.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `Entity` | `InteractionTarget` | Yes (inherited) | `USER` | The entity to target for this interaction. |
| `InterruptTypes` | `Set<InteractionType>` | No (inherited) | `null` | A set of interaction types to cancel. If `null`, all types are interrupted. |
| `RequiredTag` | `String` | No (inherited) | `null` | Tag that the root interaction must have to be interrupted. If not set, no tag is required. |
| `ExcludedTag` | `String` | No (inherited) | `null` | Tag that prevents an interaction chain from being interrupted. |

## Fields

| Type | Name | Default | Description |
|---|---|---|---|
| `InteractionTarget` | `entityTarget` | `InteractionTarget.USER` | Target entity. |
| `Set<InteractionType>` | `interruptTypes` | `null` | Optional type filter. |
| `String` | `requiredTag` | `null` | Required tag name. |
| `int` | `requiredTagIndex` | `Integer.MIN_VALUE` | Resolved tag index. |
| `String` | `excludedTag` | `null` | Excluded tag name. |
| `int` | `excludedTagIndex` | `Integer.MIN_VALUE` | Resolved excluded tag index. |

## Methods

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Retrieves the `InteractionManager` from the target entity, iterates all active chains, filters by type and tags, and calls `cancelChains` on matching chains.

## See Also

- `InteractionManager` -- manages active interaction chains on entities
- `InteractionChain` -- represents an active chain of interactions
