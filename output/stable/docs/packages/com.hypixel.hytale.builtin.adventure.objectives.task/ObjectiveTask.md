---
title: "ObjectiveTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.task"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.task.ObjectiveTask"
api_surface: false
extends: "null"
implements: ["NetworkSerializer<Objective, com.hypixel.hytale.protocol.ObjectiveTask>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "task"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.task`

```java
public abstract class ObjectiveTask implements NetworkSerializer<Objective, com.hypixel.hytale.protocol.ObjectiveTask>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `CodecMapCodec<ObjectiveTask>` | `CODEC` |
| `public static final` | `BuilderCodec<ObjectiveTask>` | `BASE_CODEC` |
| `protected` | `ObjectiveTaskAsset` | `asset` |
| `protected` | `boolean` | `complete` |
| `protected` | `EventRegistry` | `eventRegistry` |
| `protected` | `TransactionRecord[]` | `serializedTransactionRecords` |
| `protected` | `TransactionRecord[]` | `nonSerializedTransactionRecords` |
| `protected` | `int` | `taskIndex` |
| `protected` | `List<ObjectiveTaskMarker>` | `markers` |
| `protected` | `int` | `taskSetIndex` |
| `protected` | `ObjectiveTaskRef<? extends ObjectiveTask>` | `taskRef` |
| `` | `World` | `world` |
| `` | `String` | `transactionMessage` |
| `` | `Vector3i[]` | `mapMarkerPositions` |
| `` | `String` | `objectiveIdStr` |
| `` | `Transform` | `mapMarkerPosition` |
| `` | `String` | `markerId` |
| `` | `TransactionRecord[]` | `transactionRecords` |
| `` | `int` | `serializedCount` |
| `` | `int` | `serializedIndex` |
| `` | `int` | `nonSerializedIndex` |
| `` | `UpdateObjectiveTask` | `updateObjectiveTaskPacket` |
| `` | `Universe` | `universe` |
| `` | `PlayerRef` | `player` |
| `` | `TaskConditionAsset[]` | `taskConditions` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ObjectiveTask(@Nonnull ObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)` |
| `protected` | `ObjectiveTask()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ObjectiveTaskAsset` | `getAsset()` |
| `` | `public void` | `setAsset(@Nonnull ObjectiveTaskAsset asset)` |
| `` | `public boolean` | `isComplete()` |
| `public` | `TransactionRecord[]` | `getSerializedTransactionRecords()` |
| `public` | `TransactionRecord[]` | `getNonSerializedTransactionRecords()` |
| `public` | `List<ObjectiveTaskMarker>` | `getMarkers()` |
| `` | `public void` | `addMarker(@Nonnull ObjectiveTaskMarker marker)` |
| `` | `public void` | `removeMarker(String id)` |
| `` | `public abstract boolean` | `checkCompletion()` |
| `protected abstract` | `TransactionRecord[]` | `setup0(@Nonnull Objective var1, @Nonnull World var2, @Nonnull Store<EntityStore> var3)` |
| `public final` | `TransactionRecord[]` | `setup(@Nonnull Objective objective, @Nonnull Store<EntityStore> store)` |
| `` | `throw new` | `IllegalStateException("ObjectiveTask.eventRegistry is not null, setup()` |
| `` | `new` | `ObjectiveTaskMarker(markerId, mapMarkerPosition, "Home.png", Message.translation("server.assetTypes.ObjectiveAsset.title")` |
| `` | `public void` | `complete(@Nonnull Objective objective, @Nullable ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `private void` | `registerTaskRef()` |
| `` | `private void` | `unregisterTaskRef()` |
| `` | `public void` | `completeTransactionRecords()` |
| `` | `public void` | `revertTransactionRecords()` |
| `` | `public void` | `unloadTransactionRecords()` |
| `` | `private void` | `shutdownEventRegistry()` |
| `` | `public void` | `assetChanged(@Nonnull Objective objective)` |
| `` | `public void` | `sendUpdateObjectiveTaskPacket(@Nonnull Objective objective)` |
| `` | `public boolean` | `areTaskConditionsFulfilled(@Nullable ComponentAccessor<EntityStore> componentAccessor, @Nullable Ref<EntityStore> ref, @Nullable Set<UUID> objectivePlayers)` |
| `` | `public void` | `consumeTaskConditions(@Nullable ComponentAccessor<EntityStore> componentAccessor, @Nullable Ref<EntityStore> ref, @Nonnull Set<UUID> objectivePlayers)` |
| `public` | `String` | `toString()` |

## Related Types

- [ObjectiveTaskRef](ObjectiveTaskRef.md)
