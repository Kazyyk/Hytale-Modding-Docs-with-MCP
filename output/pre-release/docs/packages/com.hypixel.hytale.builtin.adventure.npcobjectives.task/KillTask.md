---
title: "KillTask"
kind: "interface"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.task.KillTask"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "npcobjectives"
  - "task"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcobjectives.task`

```java
public interface KillTask
```

Defines the contract for KillTask operations. Implemented by objective tasks that track NPC kills for quest completion.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `void` | `checkKilledEntity(@Nonnull Store<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull Objective var3, @Nonnull NPCEntity var4, @Nonnull Damage var5)` |
