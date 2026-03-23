---
title: "SingletonBlackboardViewManager"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.SingletonBlackboardViewManager"
api_surface: false
extends: "IBlackboardView<View>>"
implements: 
  - "IBlackboardViewManager<View>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "blackboard"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view`

```java
public class SingletonBlackboardViewManager<View extends IBlackboardView<View>> implements IBlackboardViewManager<View>
```

Implementation of `IBlackboardViewManager<View>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `view` | `View` | final View field. |

## Constructors

| Constructor | Description |
|---|---|
| `SingletonBlackboardViewManager(View view)` | Creates a new SingletonBlackboardViewManager instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get(Ref<EntityStore> ref, Blackboard blackboard, ComponentAccessor<EntityStore> componentAccessor)` | `View` | public method. |
| `get(Vector3d position, Blackboard blackboard)` | `View` | public method. |
| `get(int chunkX, int chunkZ, Blackboard blackboard)` | `View` | public method. |
| `get(long index, Blackboard blackboard)` | `View` | public method. |
| `getIfExists(long index)` | `View` | public method. |
| `cleanup()` | `void` | public method. |
| `onWorldRemoved()` | `void` | public method. |
| `forEachView(@Nonnull Consumer<View> consumer)` | `void` | public method. |
| `clear()` | `void` | public method. |
