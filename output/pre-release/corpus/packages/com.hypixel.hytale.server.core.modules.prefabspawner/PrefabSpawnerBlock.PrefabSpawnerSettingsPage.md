# PrefabSpawnerBlock.PrefabSpawnerSettingsPage

Type: class | Package: com.hypixel.hytale.server.core.modules.prefabspawner | Extends: InteractiveCustomUIPage<PrefabSpawnerSettingsPageEventData>

public static class PrefabSpawnerBlock.PrefabSpawnerSettingsPage extends InteractiveCustomUIPage<PrefabSpawnerBlock.PrefabSpawnerSettingsPageEventData>

Custom UI page for editing prefab spawner block settings in-game. Displays text fields for prefab path, checkboxes for fit-heightmap/inherit-seed/inherit-height-condition, and weight configuration. On save, writes changes back to the `PrefabSpawnerBlock` component and marks the block state for saving.

## Methods

- void build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)
- void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull PrefabSpawnerSettingsPageEventData data)

## See Also

- PrefabSpawnerBlock
