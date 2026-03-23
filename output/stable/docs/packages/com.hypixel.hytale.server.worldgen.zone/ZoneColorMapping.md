---
title: "ZoneColorMapping"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.zone"
fqcn: "com.hypixel.hytale.server.worldgen.zone.ZoneColorMapping"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "worldgen"
  - "zone"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.zone`

```java
public class ZoneColorMapping
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull protected final` | `Int2ObjectMap<Zone[]>` | `mapping` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `add(int rgb, Zone zone)` |
| `public` | `void` | `add(int rgb, Zone[] zones)` |
| `public` | `Zone[]` | `get(int rgb)` |
| `@Nonnull @Override public` | `String` | `toString()` |
