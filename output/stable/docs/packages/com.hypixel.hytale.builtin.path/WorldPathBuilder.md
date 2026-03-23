---
title: "WorldPathBuilder"
kind: "class"
package: "com.hypixel.hytale.builtin.path"
fqcn: "com.hypixel.hytale.builtin.path.WorldPathBuilder"
api_surface: false
extends: null
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "path"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.path`

```java
public class WorldPathBuilder implements Component<EntityStore>
```

ECS component that holds a `WorldPath` being constructed or edited. Used during interactive path building operations.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, WorldPathBuilder>` | `getComponentType()` |
| `public` | `WorldPath` | `getPath()` |
| `public` | `void` | `setPath(WorldPath path)` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
