---
title: "ReturnToHubButtonSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.creativehub.systems"
fqcn: "com.hypixel.hytale.builtin.creativehub.systems.ReturnToHubButtonSystem"
api_surface: false
extends: "RefSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "creativehub"
  - "systems"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.creativehub.systems`

```java
public class ReturnToHubButtonSystem extends RefSystem
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `onEntityAdded(Ref<EntityStore> ref, AddReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `@Override public` | `void` | `onEntityRemove(Ref<EntityStore> ref, RemoveReason reason, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `@Override public` | `Query<EntityStore>` | `getQuery()` |
| `private` | `Optional<Boolean>` | `getCreativeHubWorldStatus(Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer, Ref<EntityStore> ref)` |
