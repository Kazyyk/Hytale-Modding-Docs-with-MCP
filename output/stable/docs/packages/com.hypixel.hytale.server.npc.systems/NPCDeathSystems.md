---
title: "NPCDeathSystems"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.NPCDeathSystems"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "death"
  - "combat"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class NPCDeathSystems
```

Container class for two ECS systems that process NPC death events.

## Inner Systems

### NPCDeathSystems.EntityViewSystem

```java
public static class EntityViewSystem extends DeathSystems.OnDeathSystem
```

Posts death events to the blackboard's `EntityEventView` when an NPC or player dies from an entity source. Enables nearby NPCs with entity event sensors to detect deaths. Skips creative-mode players unless `allowNPCDetection` is enabled.

**Query:** `(NPCEntity OR Player) AND TransformComponent`

### NPCDeathSystems.NPCKillsEntitySystem

```java
public static class NPCKillsEntitySystem extends DeathSystems.OnDeathSystem
```

Notifies the killing NPC's `DamageData` when it kills any living entity. Records the kill position for potential use by sensors.

**Query:** `AllLegacyLivingEntityTypesQuery AND TransformComponent`

## Related Types

- [NPCDamageSystems](NPCDamageSystems.md) -- damage event handling
- [BlackboardSystems](BlackboardSystems.md) -- event view updated by death events
