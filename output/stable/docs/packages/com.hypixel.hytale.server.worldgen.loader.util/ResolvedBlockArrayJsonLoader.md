---
title: "ResolvedBlockArrayJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.util"
fqcn: "com.hypixel.hytale.server.worldgen.loader.util.ResolvedBlockArrayJsonLoader"
api_surface: false
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "loader"
  - "util"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.util`

```java
public class ResolvedBlockArrayJsonLoader extends JsonLoader<SeedStringResource, ResolvedBlockArray>
```

JSON loader that deserializes configuration data from JSON files.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public ResolvedBlockArray` | `load()` |
| `` | `throw new` | `IllegalArgumentException("Unknown key! " + key)` |
| `` | `throw new` | `IllegalArgumentException("BlockLayer " + blockName + " does not exist in BlockTypes", var13)` |
| `` | `return new` | `ResolvedBlockArray(blocks)` |
| `@Nonnull public` | `ResolvedBlockArray` | `loadSingleBlock(@Nonnull String blockName)` |
| `` | `throw new` | `IllegalArgumentException("BlockLayer does not exist in BlockTypes", var8)` |
| `@Nonnull public static` | `ResolvedBlockArray` | `loadSingleBlock(@Nonnull JsonObject obj)` |
| `` | `throw new` | `IllegalArgumentException("BlockLayer does not exist in BlockTypes", var9)` |
