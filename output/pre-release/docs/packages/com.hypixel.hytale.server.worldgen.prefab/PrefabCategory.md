---
title: "PrefabCategory"
kind: "record"
package: "com.hypixel.hytale.server.worldgen.prefab"
fqcn: "com.hypixel.hytale.server.worldgen.prefab.PrefabCategory"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "prefab"
  - "record"
---

**Package:** `com.hypixel.hytale.server.worldgen.prefab`

```java
public record PrefabCategory(String name, int priority)
```

Represents a named prefab category with a priority value used to resolve placement conflicts during world generation. Higher priority categories take precedence.

## Fields

| Modifier | Type | Field | Description |
|---|---|---|---|
| `public static final` | `String` | `FILENAME` | Source filename ("PrefabCategories.json") |
| `public static final` | `int` | `MIN_PRIORITY` | Minimum priority value (Integer.MIN_VALUE) |
| `public static final` | `int` | `MAX_PRIORITY` | Maximum priority value (Integer.MAX_VALUE) |
| `public static final` | `PrefabCategory` | `NONE` | Default "None" category with minimum priority |
| `public static final` | `PrefabCategory` | `UNIQUE` | "Unique" category with maximum priority |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `parse(JsonElement json, BiConsumer<String, PrefabCategory> consumer)` |
