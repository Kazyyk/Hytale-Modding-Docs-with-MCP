---
title: "VoidEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.components.voidevent"
fqcn: "com.hypixel.hytale.builtin.portals.components.voidevent.VoidEvent"
api_surface: false
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "components"
  - "voidevent"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.components.voidevent`

```java
public class VoidEvent implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `double` | `MIN_BLOCKS_BETWEEN_SPAWNERS` |
| `private` | `SpatialHashGrid<Ref<EntityStore>>` | `voidSpawners` |
| `private` | `VoidEventStage` | `activeStage` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore,VoidEvent>` | `getComponentType()` |
| `@Nullable public static` | `VoidEventConfig` | `getConfig(World world)` |
| `@Nonnull public` | `SpatialHashGrid<Ref<EntityStore>>` | `getVoidSpawners()` |
| `@Nullable public` | `VoidEventStage` | `getActiveStage()` |
| `public` | `void` | `setActiveStage(VoidEventStage activeStage)` |
| `@Nullable @Override public` | `Component<EntityStore>` | `clone()` |
