---
title: "UniqueItemUsagesComponent"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.data"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.data.UniqueItemUsagesComponent"
api_surface: false
extends: null
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "entities"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.data`

```java
public class UniqueItemUsagesComponent implements Component<EntityStore>
```

An `EntityStore` component storing UniqueItemUsagesComponent-related data on entities.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private final` | `Set<String>` | `usedUniqueItems` | `new HashSet<>()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, UniqueItemUsagesComponent>` | `getComponentType()` |
| `@Nullable @Override public` | `Component<EntityStore>` | `clone()` |
| `public` | `boolean` | `hasUsedUniqueItem(String itemId)` |
| `public` | `void` | `recordUniqueItemUsage(String itemId)` |
