---
title: "PlayerSettings"
kind: "record"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSettings"
api_surface: true
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "component"
  - "settings"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public record PlayerSettings(
    boolean showEntityMarkers,
    @Nonnull PickupLocation armorItemsPreferredPickupLocation,
    @Nonnull PickupLocation weaponAndToolItemsPreferredPickupLocation,
    @Nonnull PickupLocation usableItemsItemsPreferredPickupLocation,
    @Nonnull PickupLocation solidBlockItemsPreferredPickupLocation,
    @Nonnull PickupLocation miscItemsPreferredPickupLocation,
    PlayerCreativeSettings creativeSettings,
    boolean hideHelmet,
    boolean hideCuirass,
    boolean hideGauntlets,
    boolean hidePants
) implements Component<EntityStore>
```

An ECS component record holding player-configurable settings. Persisted per player and used by systems to control item pickup behavior, armor visibility, entity markers, and creative mode options.

## Record Components

| Component | Type | Description |
|---|---|---|
| `showEntityMarkers` | `boolean` | Whether entity markers are visible to this player. |
| `armorItemsPreferredPickupLocation` | `PickupLocation` | Preferred destination for picked-up armor items. |
| `weaponAndToolItemsPreferredPickupLocation` | `PickupLocation` | Preferred destination for picked-up weapons/tools. |
| `usableItemsItemsPreferredPickupLocation` | `PickupLocation` | Preferred destination for picked-up usable items. |
| `solidBlockItemsPreferredPickupLocation` | `PickupLocation` | Preferred destination for picked-up solid block items. |
| `miscItemsPreferredPickupLocation` | `PickupLocation` | Preferred destination for picked-up miscellaneous items. |
| `creativeSettings` | [PlayerCreativeSettings](PlayerCreativeSettings.md) | Creative mode settings. |
| `hideHelmet` | `boolean` | Whether to hide the player's helmet visually. |
| `hideCuirass` | `boolean` | Whether to hide the player's cuirass visually. |
| `hideGauntlets` | `boolean` | Whether to hide the player's gauntlets visually. |
| `hidePants` | `boolean` | Whether to hide the player's pants visually. |

## Static Methods

```java
@Nonnull
public static ComponentType<EntityStore, PlayerSettings> getComponentType()
```

Returns the component type from `EntityModule.get().getPlayerSettingsComponentType()`.

```java
@Nonnull
public static PlayerSettings defaults()
```

Returns the default settings instance: all pickup locations set to `Hotbar`, all visibility flags `false`, entity markers `false`.

## Methods

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Returns a copy of this settings record with a cloned `PlayerCreativeSettings`.

## Related Types

- [PlayerCreativeSettings](PlayerCreativeSettings.md) -- nested creative mode settings
- [PlayerSystems.PlayerSpawnedSystem](PlayerSystems.PlayerSpawnedSystem.md) -- uses settings for armor visibility
