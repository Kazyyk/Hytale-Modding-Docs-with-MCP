---
title: "ActionPlaceBlock"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.world"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.world.ActionPlaceBlock"
api_surface: false
extends: "ActionBase"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "action"
  - "world"
  - "blocks"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.world`

```java
public class ActionPlaceBlock extends ActionBase
```

Places a block at a sensor-provided position. Validates range, block type, and placement rules before setting the block in the chunk. Each instance has a corresponding `BuilderActionPlaceBlock` class for JSON deserialization.
