---
title: "WarpListPage"
kind: "class"
package: "com.hypixel.hytale.builtin.teleport"
fqcn: "com.hypixel.hytale.builtin.teleport.WarpListPage"
api_surface: false
extends: "InteractiveCustomUIPage<WarpListPage.WarpListPageEventData>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "teleport"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.teleport`

```java
public class WarpListPage extends InteractiveCustomUIPage<WarpListPage.WarpListPageEventData>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `String` | `PAGE_UI_FILE` |
| `private final` | `Consumer<String>` | `callback` |
| `private final` | `Map<String, Warp>` | `warps` |
| `private` | `String` | `searchQuery` |
| `` | `ObjectArrayList<String>` | `warps` |
| `` | `int` | `i` |
| `` | `String` | `selector` |
| `` | `String` | `warp` |
| `` | `Player` | `playerComponent` |
| `` | `UICommandBuilder` | `commandBuilder` |
| `` | `UIEventBuilder` | `eventBuilder` |
| `` | `static final String` | `KEY_WARP` |
| `` | `static final String` | `KEY_SEARCH_QUERY` |
| `` | `public static final BuilderCodec<WarpListPage.WarpListPageEventData>` | `CODEC` |
| `` | `private String` | `warp` |
| `` | `private String` | `searchQuery` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WarpListPage(@Nonnull PlayerRef playerRef, Map<String, Warp> warps, Consumer<String> callback)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `private void` | `buildWarpList(@Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder)` |
| `public` | `void` | `build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)` |
| `` | `public void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull WarpListPage.WarpListPageEventData eventData)` |
| `` | `public String` | `getWarp()` |
| `` | `public String` | `getSearchQuery()` |

## Inner Types

- `WarpListPage.WarpListPageEventData`

## Related Types

- [Warp](Warp.md)
