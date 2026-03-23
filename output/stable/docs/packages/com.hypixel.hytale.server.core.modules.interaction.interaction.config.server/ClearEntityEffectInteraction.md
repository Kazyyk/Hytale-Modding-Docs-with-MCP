---
title: "ClearEntityEffectInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.ClearEntityEffectInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "entity-effect"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class ClearEntityEffectInteraction extends SimpleInstantInteraction
```

Removes a specified entity effect from the target entity. Resolves the effect by asset ID, then calls `EffectControllerComponent.removeEffect` on the target.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `EntityEffectId` | `String` | Yes | -- | The asset ID of the entity effect to remove. Validated against `EntityEffect.VALIDATOR_CACHE`. |
| `Entity` | `InteractionTarget` | Yes | `USER` | The entity to target for this interaction. Inherited from parent. |

## Fields

| Type | Name | Default | Description |
|---|---|---|---|
| `String` | `entityEffectId` | -- | The entity effect asset ID to clear. |
| `InteractionTarget` | `entityTarget` | `InteractionTarget.USER` | Which entity to remove the effect from. |

## Methods

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Resolves the target entity via `InteractionTarget.getEntity`, looks up the `EntityEffect` asset, and removes it from the target's `EffectControllerComponent`.

```java
@Nonnull
@Override
protected Interaction generatePacket()
```

Returns a new `com.hypixel.hytale.protocol.ClearEntityEffectInteraction` packet.

```java
@Override
protected void configurePacket(Interaction packet)
```

Sets the `effectId` (resolved index) and `entityTarget` on the protocol packet.

```java
@Nonnull
@Override
public String toString()
```

## See Also

- `EntityEffect` -- the effect asset being cleared
- `EffectControllerComponent` -- manages active effects on entities
