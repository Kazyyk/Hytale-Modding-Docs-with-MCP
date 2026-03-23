---
title: "HideEntitySystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.system"
fqcn: "com.hypixel.hytale.server.core.modules.entity.system.HideEntitySystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "ecs"
  - "entity"
  - "visibility"
  - "adventure"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.system`

```java
public class HideEntitySystems
```

Container class for ECS systems that control entity visibility filtering. Currently contains one system that hides entities marked with `HiddenFromAdventurePlayers` from players in Adventure mode or with entity markers disabled.

## Inner Classes

### AdventurePlayerSystem

```java
public static class AdventurePlayerSystem extends EntityTickingSystem<EntityStore>
```

Per-tick system that filters visible entities for players in Adventure mode or players who have disabled entity markers in their settings. Runs in the `EntityTrackerSystems.FIND_VISIBLE_ENTITIES_GROUP` system group, with a dependency to run `AFTER` `EntityTrackerSystems.CollectVisible`.

Supports parallel execution via `EntityTickingSystem.maybeUseParallel()`.

Queries for entities matching `EntityTrackerSystems.EntityViewer`, `Player`, and `PlayerSettings` component types.

On each tick:
1. Reads the player's `GameMode` and `PlayerSettings`.
2. If the player is in `GameMode.Adventure` or `playerSettingsComponent.showEntityMarkers()` returns false:
   - Iterates through the `EntityViewer.visible` set.
   - For each visible entity whose archetype contains `HiddenFromAdventurePlayers`, removes it from the visible set and increments `hiddenCount`.

This ensures that entities used as editor markers or invisible gameplay triggers are not rendered for adventure players.

## Related Types

- [EntitySystems](EntitySystems.md) -- general entity systems including spawn tracking
- [RespondToHitSystems](RespondToHitSystems.md) -- contains `OnPlayerSettingsChange` which also reacts to player settings
- `HiddenFromAdventurePlayers` -- marker component that flags entities for hiding
- `PlayerSettings` -- player settings component with `showEntityMarkers()` accessor
- `EntityTrackerSystems.EntityViewer` -- per-player visibility tracking component
- `EntityTrackerSystems.CollectVisible` -- system that populates the visible set before this system filters it
