# BuilderToolsPlugin.PrefabPasteEventSystem

Type: class | Package: com.hypixel.hytale.builtin.buildertools | Extends: WorldEventSystem<EntityStore, PrefabPasteEvent>

public static class PrefabPasteEventSystem extends WorldEventSystem<EntityStore, PrefabPasteEvent>

An `EntityStore` world event system that handles `PrefabPasteEvent` to manage the plugin's prefab paste tracking maps. Registered during BuilderToolsPlugin setup.

## Constructor


protected PrefabPasteEventSystem(@Nonnull BuilderToolsPlugin plugin)

Creates the system with a reference to the plugin for accessing the paste tracking maps.

## Event Handling


public void handle(@Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull PrefabPasteEvent event)

On paste start (`event.isPasteStart()` returns `true`), creates new `ConcurrentHashMap` entries in the plugin's `pastedPrefabPathUUIDMap` and `pastedPrefabPathNameToUUIDMap` keyed by the prefab ID. On paste end, removes the entries. These maps track which entity UUIDs correspond to which prefab paths during active paste operations.

## Related Types

- BuilderToolsPlugin -- enclosing class; owns the paste tracking maps
- BuilderToolsPlugin.BuilderState -- paste operations originate from the builder state
