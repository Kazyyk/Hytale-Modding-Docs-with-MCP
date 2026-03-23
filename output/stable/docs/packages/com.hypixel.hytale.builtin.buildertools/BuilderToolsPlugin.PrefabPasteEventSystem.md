---
title: "BuilderToolsPlugin.PrefabPasteEventSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.BuilderToolsPlugin.PrefabPasteEventSystem"
api_surface: false
extends: "WorldEventSystem<EntityStore, PrefabPasteEvent>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "ecs"
  - "system"
  - "prefab"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public static class PrefabPasteEventSystem extends WorldEventSystem<EntityStore, PrefabPasteEvent>
```

An `EntityStore` world event system that handles `PrefabPasteEvent` to manage the plugin's prefab paste tracking maps. Registered during [BuilderToolsPlugin](BuilderToolsPlugin.md) setup.

## Constructor

```java
protected PrefabPasteEventSystem(@Nonnull BuilderToolsPlugin plugin)
```

Creates the system with a reference to the plugin for accessing the paste tracking maps.

## Event Handling

```java
public void handle(@Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull PrefabPasteEvent event)
```

On paste start (`event.isPasteStart()` returns `true`), creates new `ConcurrentHashMap` entries in the plugin's `pastedPrefabPathUUIDMap` and `pastedPrefabPathNameToUUIDMap` keyed by the prefab ID. On paste end, removes the entries. These maps track which entity UUIDs correspond to which prefab paths during active paste operations.

## Related Types

- [BuilderToolsPlugin](BuilderToolsPlugin.md) -- enclosing class; owns the paste tracking maps
- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- paste operations originate from the builder state
