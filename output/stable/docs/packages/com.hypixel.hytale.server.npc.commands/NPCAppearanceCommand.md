---
title: "NPCAppearanceCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCAppearanceCommand"
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
public class NPCAppearanceCommand extends NPCWorldCommandBase
```

Implements `/npc appearance`. Changes the model/appearance of a target NPC at runtime by calling `NPCEntity.setAppearance()`.

## Arguments

| Argument | Type | Required | Description |
|---|---|---|---|
| `model` | `ModelAsset` | yes | The model asset to apply to the NPC |

## Constructor

```java
public NPCAppearanceCommand()
```

Registers as sub-command `"appearance"` with translation key `"server.commands.npc.appearance.desc"`.

## Methods

```java
@Override
protected void execute(@Nonnull CommandContext context, @Nonnull NPCEntity npc, @Nonnull World world, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref)
```

Retrieves the model argument and calls `npc.setAppearance(ref, model, store)`.

## Related Types

- [NPCWorldCommandBase](NPCWorldCommandBase.md) -- base class providing NPC target resolution
- [NPCCommand](NPCCommand.md) -- parent command collection
