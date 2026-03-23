---
title: "SpawnTestResult"
kind: "enum"
package: "com.hypixel.hytale.server.spawning"
fqcn: "com.hypixel.hytale.server.spawning.SpawnTestResult"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "spawning"
  - "enum"
---

**Package:** `com.hypixel.hytale.server.spawning`

```java
public enum SpawnTestResult
```

Result codes returned by [SpawningContext](SpawningContext.md) spawn validation methods.

## Enum Constants

| Constant | Description |
|---|---|
| `TEST_OK` | Spawn position is valid |
| `FAIL_NO_POSITION` | No valid position found |
| `FAIL_INVALID_POSITION` | Position failed collision check |
| `FAIL_INTERSECT_ENTITY` | Position overlaps an existing entity |
| `FAIL_NO_MOTION_CONTROLLERS` | NPC has no motion controllers configured |
| `FAIL_NOT_SPAWNABLE` | Entity is not spawnable at the context |
| `FAIL_NOT_BREATHABLE` | NPC cannot breathe at the position |
