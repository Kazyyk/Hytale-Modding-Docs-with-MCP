---
title: "JsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.JsonLoader"
api_surface: false
extends: "Loader"
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
public abstract class JsonLoader<K extends SeedResource> extends Loader<K, T>
```

Abstract base for all JSON-based resource loaders. Extends `Loader` with JSON element access, file reference resolution, and typed accessor methods (`mustGetString`, `mustGetNumber`, `mustGetBool`, `mustGetObject`, `mustGetArray`). Constructor auto-loads external JSON when the root element contains a `"File"` key.

## Static Constants

| Constant | Type | Description |
|---|---|---|
| `JSON_LOADER` | `JsonResourceLoader<JsonElement>` | Generic JSON element loader (non-null check). |
| `JSON_ARR_LOADER` | `JsonResourceLoader<JsonArray>` | JSON array loader with array type check. |
| `JSON_OBJ_LOADER` | `JsonResourceLoader<JsonObject>` | JSON object loader with object type check. |

## Key Methods

- `has(String name)`
- `getOrLoad(@Nonnull JsonElement element)`
- `get(String name)`
- `getRaw(String name)`
- `loadFile(@Nonnull String filePath)`
- `mustGetObject`
- `mustGetArray`
- `mustGetString`
- `mustGetBool`
- `mustGetNumber`

## Related Types

- JsonLoader.Constants -- inner interface defining `JSON_FILEPATH_SEPARATOR` and `KEY_FILE`

