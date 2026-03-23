---
title: "UIRebuildCaches"
kind: "class"
package: "com.hypixel.hytale.codec.schema.metadata.ui"
fqcn: "com.hypixel.hytale.codec.schema.metadata.ui.UIRebuildCaches"
api_surface: true
extends: null
implements:
  - "Metadata"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "schema"
  - "metadata"
  - "ui"
  - "cache"
  - "api-surface"
---

**Package:** `com.hypixel.hytale.codec.schema.metadata.ui`

```java
public class UIRebuildCaches implements Metadata
```

Schema metadata that declares which client-side caches should be rebuilt when a property is edited. Sets both `uiRebuildCaches` and `uiRebuildCachesForChildProperties` on the schema.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `UIRebuildCaches.ClientCache[]` | `caches` |
| `private final` | `boolean` | `appliesToChildProperties` |

## Constructors

```java
public UIRebuildCaches(UIRebuildCaches.ClientCache... caches)
```

```java
public UIRebuildCaches(boolean appliesToChildProperties, UIRebuildCaches.ClientCache... caches)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `modify(@Nonnull Schema schema)` |

## Inner Types

### ClientCache

```java
public static enum ClientCache
```

| Constant | Description |
|---|---|
| `BLOCK_TEXTURES` | Rebuild block texture cache. |
| `MODELS` | Rebuild model cache. |
| `MODEL_TEXTURES` | Rebuild model texture cache. |
| `MAP_GEOMETRY` | Rebuild map geometry cache. |
| `ITEM_ICONS` | Rebuild item icon cache. |
