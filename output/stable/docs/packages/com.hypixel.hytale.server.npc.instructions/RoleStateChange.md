---
title: "RoleStateChange"
kind: "interface"
package: "com.hypixel.hytale.server.npc.instructions"
fqcn: "com.hypixel.hytale.server.npc.instructions.RoleStateChange"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "npc"
  - "instructions"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.npc.instructions`

```java
public interface RoleStateChange
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `registerWithSupport(Role role)` |
| `` | `void` | `motionControllerChanged( @Nullable Ref<EntityStore> ref, @Nonnull NPCEntity npcComponent, MotionController motionController, @Nullable ComponentAccessor<EntityStore> componentAccessor )` |
| `` | `void` | `loaded(Role role)` |
| `` | `void` | `spawned(Role role)` |
| `` | `void` | `unloaded(Role role)` |
| `` | `void` | `removed(Role role)` |
| `` | `void` | `teleported(Role role, World from, World to)` |
