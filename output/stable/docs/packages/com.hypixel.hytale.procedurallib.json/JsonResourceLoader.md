---
title: "JsonResourceLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.JsonResourceLoader"
api_surface: false
extends: ~
implements: 
  - "AssetLoader<T>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "procedural-generation"
  - "noise"
  - "json-loader"
---

**Package:** `com.hypixel.hytale.procedurallib.json`

```java
public class JsonResourceLoader<T extends JsonElement> implements AssetLoader<T>
```

An `AssetLoader` implementation that reads JSON from an `InputStream` using Gson's lenient parser. Validates the parsed element against a predicate and maps it to the target type.

## Type Parameters

- `T` -- the target JSON element type (e.g. `JsonElement`, `JsonArray`, `JsonObject`)

## Constructor

```java
public JsonResourceLoader(@Nonnull Class<T> type, @Nonnull Predicate<JsonElement> predicate, @Nonnull Function<JsonElement, T> mapper)
```

## Methods

| Method | Returns | Description |
|---|---|---|
| `type()` | `Class<T>` | The target element class. |
| `load(@Nonnull InputStream in)` | `T` | Parses JSON from the stream in lenient mode, validates, and maps. |

## Related Types

- [JsonLoader](JsonLoader.md) -- uses `JsonResourceLoader` instances as static constants
