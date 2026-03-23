---
title: "PrefabLoadingCache"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.prefab"
fqcn: "com.hypixel.hytale.server.worldgen.prefab.PrefabLoadingCache"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "prefab"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.prefab`

```java
public class PrefabLoadingCache
```

Thread-safe cache for loaded prefab buffers. Maps `WorldGenPrefabSupplier` instances to `PrefabBuffer` objects, loading them on demand from the prefab path.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `IPrefabBuffer` | `getPrefabAccessor(WorldGenPrefabSupplier prefabSupplier)` |
| `public` | `void` | `clear()` |
