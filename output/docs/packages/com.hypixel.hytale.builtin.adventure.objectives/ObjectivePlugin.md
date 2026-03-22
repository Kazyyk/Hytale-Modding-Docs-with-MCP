---
title: "ObjectivePlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.ObjectivePlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "adventure"
  - "objectives"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives`

```java
public class ObjectivePlugin extends JavaPlugin
```

The main plugin class for the adventure objectives system. Registers assets, components, systems, tasks, completions, events, and commands. Manages objective lifecycle including starting, completing, canceling, and reloading objectives and objective lines.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ObjectivePlugin` | `get()` |
| `public` | `ComponentType<EntityStore, ObjectiveHistoryComponent>` | `getObjectiveHistoryComponentType()` |
| `public` | `Model` | `getObjectiveLocationMarkerModel()` |
| `public` | `ObjectiveDataStore` | `getObjectiveDataStore()` |
| `public` | `ComponentType<EntityStore, ReachLocationMarker>` | `getReachLocationMarkerComponentType()` |
| `public` | `ComponentType<EntityStore, ObjectiveLocationMarker>` | `getObjectiveLocationMarkerComponentType()` |
| `public` | `<T extends ObjectiveTaskAsset, U extends ObjectiveTask> void` | `registerTask( String id, Class<T> assetClass, Codec<T> assetCodec, Class<U> implementationClass, Codec<U> implementationCodec, TriFunction<T, Integer, Integer, U> generator )` |
| `public` | `<T extends ObjectiveCompletionAsset, U extends ObjectiveCompletion> void` | `registerCompletion( String id, Class<T> assetClass, Codec<T> codec, Function<T, U> generator )` |
| `public` | `ObjectiveTask` | `createTask(ObjectiveTaskAsset task, int taskSetIndex, int taskIndex)` |
| `public` | `ObjectiveCompletion` | `createCompletion(ObjectiveCompletionAsset completionAsset)` |
| `public` | `Objective` | `startObjective( String objectiveId, Set<UUID> playerUUIDs, UUID worldUUID, UUID markerUUID, Store<EntityStore> store )` |
| `public` | `Objective` | `startObjective( String objectiveId, UUID objectiveUUID, Set<UUID> playerUUIDs, UUID worldUUID, UUID markerUUID, Store<EntityStore> store )` |
| `public` | `boolean` | `canPlayerDoObjective(Player player, String objectiveAssetId)` |
| `public` | `Objective` | `startObjectiveLine( Store<EntityStore> store, String objectiveLineId, Set<UUID> playerUUIDs, UUID worldUUID, UUID markerUUID )` |
| `public` | `boolean` | `canPlayerDoObjectiveLine(Player player, String objectiveLineId)` |
| `public` | `void` | `objectiveCompleted(Objective objective, Store<EntityStore> store)` |
| `public` | `void` | `storeObjectiveHistoryData(Objective objective)` |
| `public` | `void` | `storeObjectiveLineHistoryData(ObjectiveLineHistoryData objectiveLineHistoryData, Set<UUID> playerUUIDs)` |
| `public` | `void` | `cancelObjective(UUID objectiveUUID, Store<EntityStore> store)` |
| `public` | `void` | `untrackObjectiveForPlayer(Objective objective, UUID playerUUID)` |
