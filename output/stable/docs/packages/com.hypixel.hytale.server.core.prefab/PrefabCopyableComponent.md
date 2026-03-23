---
title: "PrefabCopyableComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab"
fqcn: "com.hypixel.hytale.server.core.prefab.PrefabCopyableComponent"
api_surface: false
extends: null
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "prefab"
  - "component"
  - "entity"
---

**Package:** `com.hypixel.hytale.server.core.prefab`

```java
public class PrefabCopyableComponent implements Component<EntityStore>
```

Singleton marker component indicating that an entity can be copied as part of a prefab operation. Uses a single shared `INSTANCE` -- cloning returns the same instance. Registered on `EntityModule`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `PrefabCopyableComponent` | `INSTANCE` |
| `public static final` | `BuilderCodec<PrefabCopyableComponent>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, PrefabCopyableComponent>` | `getComponentType()` |
| `public static` | `PrefabCopyableComponent` | `get()` |
| `public` | `Component<EntityStore>` | `clone()` |
