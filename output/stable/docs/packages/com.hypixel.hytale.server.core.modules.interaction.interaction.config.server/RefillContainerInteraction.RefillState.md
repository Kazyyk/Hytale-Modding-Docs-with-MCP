---
title: "RefillContainerInteraction.RefillState"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.RefillContainerInteraction.RefillState"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "item"
  - "fluid"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
protected static class RefillContainerInteraction.RefillState
```

Configuration for a single refill state within a [RefillContainerInteraction](RefillContainerInteraction.md). Defines which fluids can trigger this state, the resulting durability value, and an optional fluid to place at the source location after refilling.

## Codec Properties

| Key | Type | Required | Description |
|---|---|---|---|
| `AllowedFluids` | `String[]` | Yes | Array of fluid asset IDs that trigger this refill state. |
| `TransformFluid` | `String` | No | Fluid asset ID to place at the source block after refilling. If not set, the source fluid is unchanged. |
| `Durability` | `double` | No (default: `-1.0`) | Durability value for the refilled item. If `-1.0`, durability is not explicitly set. |

## Fields

| Type | Name | Default | Description |
|---|---|---|---|
| `String[]` | `allowedFluids` | -- | Fluid asset IDs that trigger this state. |
| `String` | `transformFluid` | `null` | Fluid to place at the source after refill. |
| `double` | `durability` | `-1.0` | Durability value for the result item. |

## Methods

```java
public String[] getAllowedFluids()
```

```java
public String getTransformFluid()
```

```java
public double getDurability()
```

```java
@Nonnull
@Override
public String toString()
```

## See Also

- [RefillContainerInteraction](RefillContainerInteraction.md)
