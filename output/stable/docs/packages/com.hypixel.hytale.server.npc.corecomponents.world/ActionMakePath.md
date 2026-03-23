---
title: "ActionMakePath"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.world"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.world.ActionMakePath"
api_surface: false
extends: "ActionBase"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "action"
  - "world"
  - "pathfinding"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.world`

```java
public class ActionMakePath extends ActionBase
```

Builds a transient path from a `TransientPathDefinition` and assigns it to the NPC's `PathManager`. Executes once per activation. Each instance has a corresponding `BuilderActionMakePath` class for JSON deserialization.
