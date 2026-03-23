---
title: "NPCMessageCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCMessageCommand"
api_surface: false
extends: "AbstractPlayerCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "commands"
---

**Package:** `com.hypixel.hytale.server.npc.commands`

```java
public class NPCMessageCommand extends AbstractPlayerCommand
```

Implements `/npc message`. Sends a beacon message to one or all NPCs. Beacon messages are processed by the NPC's `BeaconSupport` component and can trigger beacon-type sensors in the behavior tree.

## Arguments

| Argument | Type | Required | Default | Description |
|---|---|---|---|---|
| `message` | `String` | yes | -- | The message string to send |
| `expiration` | `Double` | no | `1.0` | Message expiration time in seconds |
| `--all` | flag | no | -- | Send to all NPCs with `BeaconSupport` |
| `entity` | entity ID | no | -- | Target NPC (defaults to player's look-target) |

## Behavior

- **`--all` mode:** Iterates all entities with `NPCEntity` in parallel, posting the message to each entity's `BeaconSupport` component (if present) with the player as the sender.
- **Single target mode:** Uses [NPCCommandUtils](NPCCommandUtils.md) to resolve the target NPC and posts the message to its `BeaconSupport`.

## Constructor

```java
public NPCMessageCommand()
```

Registers as sub-command `"message"` with translation key `"server.commands.npc.message.desc"`.

## Related Types

- [NPCCommandUtils](NPCCommandUtils.md) -- used for target resolution
- [NPCCommand](NPCCommand.md) -- parent command collection
