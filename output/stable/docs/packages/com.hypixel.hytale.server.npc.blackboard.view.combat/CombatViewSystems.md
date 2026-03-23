---
title: "CombatViewSystems"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view.combat"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.combat.CombatViewSystems"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "blackboard"
  - "combat"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view.combat`

```java
public class CombatViewSystems
```

Container for ECS systems that manage per-entity combat data interpretation. Provides `getCombatData()` which lazily interprets active interaction chains into `InterpretedCombatData` entries, categorizing attacks as melee, ranged, or block based on interaction tags. Contains inner classes: `CombatData` (component), `CombatDataPool` (resource), `Ensure`, `EntityRemoved`, and `Ticking` (systems).
