---
title: "NPCTestCommand.ProbeTestCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCTestCommand.ProbeTestCommand"
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
public static class NPCTestCommand.ProbeTestCommand extends AbstractPlayerCommand
```

Inner class of [NPCTestCommand](NPCTestCommand.md). Tests NPC spawn position validity at the player's current location. Runs three probes and a collision validation:

1. **Air probe** (`PositionProbeAir`): checks if the position is valid for air-based NPCs.
2. **Water probe** (`PositionProbeWater`): checks if the position is valid for aquatic NPCs, using the player model's eye height.
3. **Collision validation** (`CollisionModule.validatePosition()`): checks for block collisions at the position with material type 4.

Displays results to the player and logs them to the NPC plugin logger, including the Y position, bounding box, and chunk height at the player's location.

## Constructor

```java
public ProbeTestCommand()
```

Registers as sub-command `"probe"` with translation key `"server.commands.npc.test.probe.desc"`.

## Related Types

- [NPCTestCommand](NPCTestCommand.md) -- parent command collection
