---
title: "PrefabAnchor"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.PrefabAnchor"
api_surface: false
implements:
  - "Component"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "prefab-editor"
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor`

```java
public class PrefabAnchor implements Component<EntityStore>
```

Marker component attached to anchor entities within a prefab edit session. Uses a singleton pattern (`INSTANCE`). The component type is registered by `BuilderToolsPlugin`.

## Fields

| Field | Type | Description |
|---|---|---|
| `INSTANCE` | `PrefabAnchor` | Singleton instance. |
| `CODEC` | `BuilderCodec<PrefabAnchor>` | Codec that always deserializes to the singleton. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<EntityStore, PrefabAnchor>` | Returns the component type from `BuilderToolsPlugin`. |
| `clone()` | `Component<EntityStore>` | Returns the singleton instance. |
