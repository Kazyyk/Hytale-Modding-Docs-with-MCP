---
title: "SpawnRejection"
kind: "enum"
package: "com.hypixel.hytale.server.spawning"
fqcn: "com.hypixel.hytale.server.spawning.SpawnRejection"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "spawning"
  - "enum"
---

**Package:** `com.hypixel.hytale.server.spawning`

```java
public enum SpawnRejection
```

Reasons why a spawn attempt was rejected during position validation.

## Enum Constants

| Constant | Description |
|---|---|
| `OUTSIDE_LIGHT_RANGE` | Block light level outside configured range |
| `INVALID_SPAWN_BLOCK` | Ground block not in the allowed spawn block set |
| `INVALID_POSITION` | Position failed collision validation |
| `NO_POSITION` | No valid spawn position found in the column |
| `NOT_BREATHABLE` | NPC cannot breathe at the spawn position |
| `OTHER` | Rejection for an unspecified reason |

## Static Fields

| Field | Type | Description |
|---|---|---|
| `VALUES` | `SpawnRejection[]` | Cached array of all enum constants |
