# HotbarManager

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player

public class HotbarManager

Manages saved hotbar presets for a player. Supports up to 10 hotbar slots (indices 0-9). Save and load operations are restricted to Creative game mode. Serialized via `BuilderCodec` with keys `"SavedHotbars"` and `"CurrentHotbar"`.

## Fields

- HOTBARS_MAX | int | Maximum number of hotbar slots (10).
- CODEC | BuilderCodec<HotbarManager> | Serialization codec for saved hotbars and current index.
- savedHotbars | ItemContainer[] | Array of saved hotbar item containers.
- currentHotbar | int | Index of the currently active hotbar.

## Methods

- saveHotbar(@Nonnull Ref<EntityStore> playerRef, short hotbarIndex, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | void | Saves the player's current hotbar to the specified slot. Requires Creative mode; sends error message otherwise.
- loadHotbar(@Nonnull Ref<EntityStore> playerRef, short hotbarIndex, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | void | Loads a saved hotbar into the player's active hotbar. Requires Creative mode.
- getCurrentHotbarIndex() | int | Returns the index of the currently active hotbar.
- getIsCurrentlyLoadingHotbar() | boolean | Returns true if a hotbar load is currently in progress.
