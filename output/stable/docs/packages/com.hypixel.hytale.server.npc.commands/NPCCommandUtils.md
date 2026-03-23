---
title: "NPCCommandUtils"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCCommandUtils"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public class NPCCommandUtils
```

Shared utility class for resolving a target NPC entity from command context. Used by commands that need to resolve an NPC either from an explicit entity argument or by raycasting from the player's view direction.

## Methods

```java
@Nullable
public static Pair<Ref<EntityStore>, NPCEntity> getTargetNpc(@Nonnull CommandContext context, @Nonnull EntityWrappedArg arg, @Nonnull Store<EntityStore> store)
```

Resolves a target NPC entity. If the entity argument is provided, uses it directly. Otherwise, requires the sender to be a player and uses `TargetUtil.getTargetEntity()` to find the entity the player is looking at. Returns `null` with an error message if:
- The sender is not a player and no entity argument was provided.
- No entity is in the player's view.
- The resolved entity does not have an `NPCEntity` component (not an NPC).

Returns a `Pair` of the entity reference and its `NPCEntity` component on success.

## Related Types

- [NPCWorldCommandBase](NPCWorldCommandBase.md) -- provides similar NPC resolution logic as a base class
- [NPCFreezeCommand](NPCFreezeCommand.md) -- uses this utility for single-target freezing
- [NPCThawCommand](NPCThawCommand.md) -- uses this utility for single-target thawing
- [NPCMessageCommand](NPCMessageCommand.md) -- uses this utility for message targeting
