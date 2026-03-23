---
title: "RoleStats"
kind: "class"
package: "com.hypixel.hytale.server.npc.role.support"
fqcn: "com.hypixel.hytale.server.npc.role.support.RoleStats"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "diagnostics"
---

**Package:** `com.hypixel.hytale.server.npc.role.support`

```java
public class RoleStats
```

Diagnostic tracking of sensor distance ranges and bucket configurations per NPC role. Records which distance ranges are requested (sorted, unsorted, avoidance) for both players and NPCs, and stores the final bucket range arrays. Used for debugging and performance analysis of the [PositionCache](PositionCache.md) spatial query system.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `clear()` |
| `public` | `void` | `trackRange(boolean isPlayer, RangeType type, int value)` |
| `public` | `IntSet` | `getRanges(boolean isPlayer, RangeType type)` |
| `public` | `int[]` | `getRangesSorted(boolean isPlayer, RangeType type)` |
| `public` | `void` | `trackBuckets(boolean isPlayer, IntArrayList bucketRanges)` |
| `@Nullable public` | `IntArrayList` | `getBuckets(boolean isPlayer)` |

## Inner Types

### RangeType (enum)

```java
public static enum RangeType {
    SORTED,
    UNSORTED,
    AVOIDANCE;
}
```

Categorizes the three kinds of distance ranges tracked by the position cache.

## Related Types

- [PositionCache](PositionCache.md) -- uses this class for range diagnostics
