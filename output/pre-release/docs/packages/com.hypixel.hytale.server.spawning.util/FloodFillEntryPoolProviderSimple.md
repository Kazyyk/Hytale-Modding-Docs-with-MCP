---
title: "FloodFillEntryPoolProviderSimple"
kind: "class"
package: "com.hypixel.hytale.server.spawning.util"
fqcn: "com.hypixel.hytale.server.spawning.util.FloodFillEntryPoolProviderSimple"
api_surface: false
extends: null
implements: ["Resource<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "spawning"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.spawning.util`

```java
public class FloodFillEntryPoolProviderSimple implements Resource<EntityStore>
```

ECS resource that provides a `FloodFillEntryPoolSimple` for reuse during flood-fill spawn position calculation. Avoids repeated allocation of int arrays.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ResourceType<EntityStore, FloodFillEntryPoolProviderSimple>` | `getResourceType()` |
| `@Nonnull public` | `FloodFillEntryPoolSimple` | `getPool()` |
| `@Nonnull @Override public` | `Resource<EntityStore>` | `clone()` |
