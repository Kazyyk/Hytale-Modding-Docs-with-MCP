---
title: "WeightedPrefabMapJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.prefab"
fqcn: "com.hypixel.hytale.server.worldgen.loader.prefab.WeightedPrefabMapJsonLoader"
api_surface: false
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "loader"
  - "prefab"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.prefab`

```java
public class WeightedPrefabMapJsonLoader extends JsonLoader<SeedStringResource, IWeightedMap<WorldGenPrefabSupplier>>
```

JSON loader that deserializes configuration data from JSON files.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public IWeightedMap<WorldGenPrefabSupplier>` | `load()` |
| `` | `throw new` | `IllegalArgumentException(this.prefabsKey)` |
| `` | `throw new` | `IllegalArgumentException("Weight array size is different from prefab name array.")` |
| `` | `throw new` | `IllegalArgumentException("Prefabs are defined but could not find a valid entry!")` |
