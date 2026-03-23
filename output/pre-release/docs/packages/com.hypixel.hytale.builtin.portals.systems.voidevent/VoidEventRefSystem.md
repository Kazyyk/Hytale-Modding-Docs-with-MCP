---
title: "VoidEventRefSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.systems.voidevent"
fqcn: "com.hypixel.hytale.builtin.portals.systems.voidevent.VoidEventRefSystem"
api_surface: false
extends: "RefSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "systems"
  - "voidevent"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.systems.voidevent`

```java
public final class VoidEventRefSystem extends RefSystem<EntityStore>
```

Reference system reacting to `VoidEvent` entity add/remove. On add, forces music ambience. On remove, clears forced music and stops active void event stage.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `void` | `onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `Query<EntityStore>` | `getQuery()` |
