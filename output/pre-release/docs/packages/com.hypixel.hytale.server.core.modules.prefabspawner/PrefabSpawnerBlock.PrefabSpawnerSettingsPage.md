---
title: "PrefabSpawnerBlock.PrefabSpawnerSettingsPage"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.prefabspawner"
fqcn: "com.hypixel.hytale.server.core.modules.prefabspawner.PrefabSpawnerBlock.PrefabSpawnerSettingsPage"
api_surface: false
extends: "InteractiveCustomUIPage<PrefabSpawnerSettingsPageEventData>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "prefab"
  - "spawner"
  - "ui"
  - "settings"
---

**Package:** `com.hypixel.hytale.server.core.modules.prefabspawner`

```java
public static class PrefabSpawnerBlock.PrefabSpawnerSettingsPage extends InteractiveCustomUIPage<PrefabSpawnerBlock.PrefabSpawnerSettingsPageEventData>
```

Custom UI page for editing prefab spawner block settings in-game. Displays text fields for prefab path, checkboxes for fit-heightmap/inherit-seed/inherit-height-condition, and weight configuration. On save, writes changes back to the `PrefabSpawnerBlock` component and marks the block state for saving.

## Methods

| Method | Signature |
|---|---|
| `build` | `void build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)` |
| `handleDataEvent` | `void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull PrefabSpawnerSettingsPageEventData data)` |

## See Also

- [PrefabSpawnerBlock](PrefabSpawnerBlock.md)