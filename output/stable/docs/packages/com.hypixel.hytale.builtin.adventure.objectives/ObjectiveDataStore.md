---
title: "ObjectiveDataStore"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.ObjectiveDataStore"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "adventure"
  - "objectives"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives`

```java
public class ObjectiveDataStore
```

Manages persistent storage and runtime tracking of all active objectives. Handles objective lifecycle (load, save, remove), per-player entity task mappings, and typed task reference sets.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Objective` | `getObjective(UUID objectiveUUID)` |
| `public` | `Map<String, Set<UUID>>` | `getEntityTasksForPlayer(UUID playerUUID)` |
| `public` | `Collection<Objective>` | `getObjectiveCollection()` |
| `public` | `<T extends ObjectiveTask> Set<ObjectiveTaskRef<T>>` | `getTaskRefsForType(Class<T> taskClass)` |
| `public` | `<T extends ObjectiveTask> void` | `addTaskRef(ObjectiveTaskRef<T> taskRef)` |
| `public` | `<T extends ObjectiveTask> void` | `removeTaskRef(ObjectiveTaskRef<T> taskRef)` |
| `public` | `<T extends ObjectiveTask> void` | `registerTaskRef(Class<T> taskClass)` |
| `public` | `void` | `saveToDisk(String objectiveId, Objective objective)` |
| `public` | `void` | `saveToDiskAllObjectives()` |
| `public` | `boolean` | `removeFromDisk(String objectiveId)` |
| `public` | `boolean` | `addObjective(UUID objectiveUUID, Objective objective)` |
| `public` | `void` | `removeObjective(UUID objectiveUUID)` |
| `public` | `void` | `addEntityTaskForPlayer(UUID playerUUID, String taskId, UUID objectiveUUID)` |
| `public` | `void` | `removeEntityTask(UUID objectiveUUID, String taskId)` |
| `public` | `void` | `removeEntityTaskForPlayer(UUID objectiveUUID, String taskId, UUID playerUUID)` |
| `public` | `Objective` | `loadObjective(UUID objectiveUUID, Store<EntityStore> store)` |
| `public` | `void` | `unloadObjective(UUID objectiveUUID)` |
