---
title: "Loader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.Loader"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "procedural-generation"
  - "noise"
  - "json-loader"
---

**Package:** `com.hypixel.hytale.procedurallib.json`

```java
public abstract class Loader<K extends SeedResource, T>
```

Abstract base class for all resource loaders in the procedural generation system. Provides seed-based resource loading with a data folder path for resolving file references.

## Type Parameters

- `K` -- the seed resource type, must extend `SeedResource`
- `T` -- the type of resource produced by this loader

## Constructor

```java
public Loader(SeedString<K> seed, Path dataFolder)
```

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getSeed()` | `SeedString<K>` | The seed string used for deterministic generation. |
| `getDataFolder()` | `Path` | The root data folder for resolving file references. |

## Abstract Methods

```java
@Nullable
public abstract T load()
```

Loads and returns the resource, or `null` if loading fails.

## Related Types

- [SeedString](SeedString.md) -- wraps seed values for deterministic generation
- [SeedResource](SeedResource.md) -- interface providing thread-local result buffers
- [JsonLoader](JsonLoader.md) -- JSON-specific subclass
