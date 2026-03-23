---
title: "LaunchProjectileInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.LaunchProjectileInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements:
  - "com.hypixel.hytale.server.core.modules.projectile.config.BallisticDataProvider"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "projectile"
  - "deprecated"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
@Deprecated(forRemoval = true)
public class LaunchProjectileInteraction extends SimpleInstantInteraction implements BallisticDataProvider
```

**Deprecated (for removal).** Launches a projectile from the interacting entity. Assembles a default projectile holder from the configured ID, shoots it in the entity's look direction, handles item durability loss, and applies broken-item penalties. Also implements `BallisticDataProvider` to supply ballistic data from the referenced `Projectile` asset.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `ProjectileId` | `String` | Yes (inherited) | -- | Asset ID of the projectile to launch. Validated against `Projectile.VALIDATOR_CACHE`. |

## Fields

| Type | Name | Description |
|---|---|---|
| `String` | `projectileId` | The configured projectile asset ID. |

## Methods

```java
public String getProjectileId()
```

Returns the configured projectile asset ID.

```java
@Nullable
@Override
public BallisticData getBallisticData()
```

Returns the `Projectile` asset looked up by `projectileId`, which implements `BallisticData`.

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Gets the entity's look transform, assembles and shoots a projectile, adds it to the world, reduces held item durability if applicable, and applies broken-weapon penalties.

```java
@Override
protected void simulateFirstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

No-op for simulation.

## See Also

- `Projectile` -- the projectile asset providing configuration and ballistic data
- `ProjectileComponent` -- assembles and shoots projectile entities
