---
title: "NPCSensorStatsCommand"
kind: "class"
package: "com.hypixel.hytale.server.npc.commands"
fqcn: "com.hypixel.hytale.server.npc.commands.NPCSensorStatsCommand"
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
public class NPCSensorStatsCommand extends AbstractPlayerCommand
```

Implements `/npc sensorstats`. Computes and logs sensor detection range statistics for every spawnable NPC role. For each role, temporarily builds the role object and extracts `RoleStats` to determine sorted/unsorted/avoidance detection ranges and priority buckets for both player and entity detection.

Results are formatted as a table logged to the NPC plugin logger, with rows labeled `PLY` (player detection) and `ENT` (entity detection), showing:
- `S=` -- sorted detection ranges
- `U=` -- unsorted detection ranges
- `A=` -- avoidance ranges
- `B=` -- priority bucket assignments

A temporary NPC is spawned and immediately removed to provide the build context.

## Constructor

```java
public NPCSensorStatsCommand()
```

Registers as sub-command `"sensorstats"` with translation key `"server.commands.npc.sensorstats.desc"`.

## Related Types

- [NPCBenchmarkCommand](NPCBenchmarkCommand.md) -- runtime performance benchmarking
- [NPCCommand](NPCCommand.md) -- parent command collection
