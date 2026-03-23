---
title: "FileContext"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.loader.context"
fqcn: "com.hypixel.hytale.server.worldgen.loader.context.FileContext"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "context"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.context`

```java
public class FileContext<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `id` |
| `private final` | `String` | `name` |
| `private final` | `Path` | `filepath` |
| `private final` | `T` | `parentContext` |
| `private final` | `String` | `registryName` |
| `private final Object2ObjectMap<String,` | `T>` | `backing` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getId()` |
| `public` | `String` | `getName()` |
| `public` | `Path` | `getPath()` |
| `public` | `T` | `getParentContext()` |
| `public` | `int` | `size()` |
| `public` | `boolean` | `contains(String name)` |
| `@Nonnull public` | `T` | `get(String name)` |
| `public` | `void` | `register(String name, T biome)` |
| `public` | `` | `FileContext(int id, String name, Path filepath, T parentContext)` |

## Inner Types

- `FileContext.Constants`
- `FileContext.Registry`
