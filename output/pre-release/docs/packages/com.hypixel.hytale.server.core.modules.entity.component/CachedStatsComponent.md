---
title: "CachedStatsComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.component"
fqcn: "com.hypixel.hytale.server.core.modules.entity.component.CachedStatsComponent"
api_surface: false
extends: null
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:22:03Z"
tags:
  - "entity"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.component`

```java
public class CachedStatsComponent implements Component<EntityStore>
```

Component caching computed entity stat values to avoid repeated lookups. Currently caches whether the entity can breathe.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, CachedStatsComponent>` | `getComponentType()` |
| `public` | `boolean` | `isCanBreathe()` |
| `public` | `void` | `setCanBreathe(boolean canBreathe)` |
| `public` | `Component<EntityStore>` | `clone()` |

## Relationships

- Implements `Component<EntityStore>`
- Registered by [EntityModule](../com.hypixel.hytale.server.core.modules.entity/EntityModule.md)
