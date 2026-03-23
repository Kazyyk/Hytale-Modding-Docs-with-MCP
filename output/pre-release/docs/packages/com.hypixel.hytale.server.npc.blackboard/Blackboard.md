---
title: "Blackboard"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard"
fqcn: "com.hypixel.hytale.server.npc.blackboard.Blackboard"
api_surface: false
extends: null
implements: ["Resource"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "blackboard"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard`

```java
public class Blackboard implements Resource
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `HytaleLogger` | `LOGGER` |
| `private final` | `ConcurrentHashMap<Class<? extends IBlackboardView<?>>,IBlackboardViewManager<?>>` | `views` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ResourceType<EntityStore,Blackboard>` | `getResourceType()` |
| `public` | `void` | `init(World world)` |
| `public` | `void` | `onEntityDamageBlock(Ref<EntityStore> ref, DamageBlockEvent event)` |
| `public` | `void` | `onEntityBreakBlock(Ref<EntityStore> ref, BreakBlockEvent event)` |
| `private` | `void` | `registerViewType(Class<View> clazz, IBlackboardViewManager<View> holder)` |
| `public` | `void` | `cleanupViews()` |
| `public` | `void` | `clear()` |
| `public` | `void` | `onWorldRemoved()` |
| `public` | `void` | `forEachView(Class<View> viewTypeClass, Consumer<View> consumer)` |
| `public` | `View` | `getView(Class<View> viewTypeClass, Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `View` | `getView(Class<View> viewTypeClass, int chunkX, int chunkZ)` |
| `public` | `View` | `getView(Class<View> viewTypeClass, long index)` |
| `public` | `View` | `getIfExists(Class<View> viewTypeClass, long index)` |
| `@Nonnull private` | `IBlackboardViewManager<View>` | `getViewManager(Class<View> viewTypeClass)` |
| `@Nonnull @Override public` | `Resource<EntityStore>` | `clone()` |
