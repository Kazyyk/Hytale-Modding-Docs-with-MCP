---
title: "ReputationAttitudeSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcreputation"
fqcn: "com.hypixel.hytale.builtin.adventure.npcreputation.ReputationAttitudeSystem"
api_surface: false
extends: "StoreSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "npcreputation"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcreputation`

```java
public class ReputationAttitudeSystem extends StoreSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ResourceType<EntityStore,Blackboard>` | `blackboardResourceType` |
| `private final` | `ComponentType<EntityStore,Player>` | `playerComponentType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `onSystemAddedToStore(Store<EntityStore> store)` |
| `@Override public` | `void` | `onSystemRemovedFromStore(Store<EntityStore> store)` |
