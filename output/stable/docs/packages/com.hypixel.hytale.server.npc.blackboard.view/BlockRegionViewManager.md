---
title: "BlockRegionViewManager"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.BlockRegionViewManager"
api_surface: false
extends: "BlockRegionView<Type>>"
implements: 
  - "IBlackboardViewManager<Type>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "blackboard"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view`

```java
public abstract class BlockRegionViewManager<Type extends BlockRegionView<Type>> implements IBlackboardViewManager<Type>
```

Implementation of `IBlackboardViewManager<Type>`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get(@Nonnull Ref<EntityStore> ref, Blackboard blackboard, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` | `Type` | public method. |
| `get(@Nonnull Vector3d position, Blackboard blackboard)` | `Type` | public method. |
| `get(int chunkX, int chunkZ, Blackboard blackboard)` | `Type` | public method. |
| `get(long index, Blackboard blackboard)` | `Type` | public method. |
| `createView(long var1, Blackboard var3)` | `Type` | protected method. |
| `getIfExists(long index)` | `Type` | public method. |
| `cleanup()` | `void` | public method. |
| `shouldCleanup(Type var1)` | `boolean` | protected method. |
| `onWorldRemoved()` | `void` | public method. |
| `forEachView(@Nonnull Consumer<Type> consumer)` | `void` | public method. |
| `clear()` | `void` | public method. |
