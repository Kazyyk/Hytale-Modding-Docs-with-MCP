---
title: "IBlackboardViewManager"
kind: "interface"
package: "com.hypixel.hytale.server.npc.blackboard.view"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.IBlackboardViewManager"
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
public interface IBlackboardViewManager<View extends IBlackboardView<View>>
```

Interface defining: `get()`, `get()`, `get()`, `get()`....

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get(Ref<EntityStore> var1, Blackboard var2, ComponentAccessor<EntityStore> var3)` | `View` | package-private method. |
| `get(Vector3d var1, Blackboard var2)` | `View` | package-private method. |
| `get(int var1, int var2, Blackboard var3)` | `View` | package-private method. |
| `get(long var1, Blackboard var3)` | `View` | package-private method. |
| `getIfExists(long var1)` | `View` | package-private method. |
| `cleanup()` | `void` | package-private method. |
| `onWorldRemoved()` | `void` | package-private method. |
| `forEachView(Consumer<View> var1)` | `void` | package-private method. |
| `clear()` | `void` | package-private method. |
