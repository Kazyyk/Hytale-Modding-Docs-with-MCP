---
title: "IBlackboardView"
kind: "interface"
package: "com.hypixel.hytale.server.npc.blackboard.view"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.IBlackboardView"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
  - "blackboard"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view`

```java
public interface IBlackboardView<View extends IBlackboardView<View>>
```

Interface defining: `isOutdated()`, `getUpdatedView()`, `initialiseEntity()`, `cleanup()`....

## Methods

| Method | Return Type | Description |
|---|---|---|
| `isOutdated(@Nonnull Ref<EntityStore> var1, @Nonnull Store<EntityStore> var2)` | `boolean` | package-private method. |
| `getUpdatedView(@Nonnull Ref<EntityStore> var1, @Nonnull ComponentAccessor<EntityStore> var2)` | `View` | package-private method. |
| `initialiseEntity(@Nonnull Ref<EntityStore> var1, @Nonnull NPCEntity var2)` | `void` | package-private method. |
| `cleanup()` | `void` | package-private method. |
| `onWorldRemoved()` | `void` | package-private method. |
