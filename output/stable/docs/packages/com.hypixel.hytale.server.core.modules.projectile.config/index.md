---
title: "com.hypixel.hytale.server.core.modules.projectile.config"
kind: "package"
package: "com.hypixel.hytale.server.core.modules.projectile.config"
fqcn: "com.hypixel.hytale.server.core.modules.projectile.config"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "modules"
  - "projectile"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.projectile.config`

Configuration types for the projectile system. Defines physics simulation parameters, ballistic data interfaces, impact/bounce callbacks, asset-backed projectile configs, and the standard physics provider component.

## Types

| Type | Kind | Description |
|---|---|---|
| [BallisticData](BallisticData.md) | interface | Ballistic trajectory parameter interface |
| [BallisticDataProvider](BallisticDataProvider.md) | interface | Provider of optional ballistic data |
| [BounceConsumer](BounceConsumer.md) | interface | Callback for projectile bounce events |
| [ImpactConsumer](ImpactConsumer.md) | interface | Callback for projectile impact events |
| [PhysicsConfig](PhysicsConfig.md) | interface | Polymorphic physics config interface |
| [ProjectileConfig](ProjectileConfig.md) | class | Asset-backed projectile configuration |
| [ProjectileConfigPacketGenerator](ProjectileConfigPacketGenerator.md) | class | Network packet generator for projectile configs |
| [StandardPhysicsConfig](StandardPhysicsConfig.md) | class | Standard physics parameters (gravity, bounce, drag) |
| [StandardPhysicsProvider](StandardPhysicsProvider.md) | class | Runtime physics simulation component |
| [StandardPhysicsProvider.STATE](StandardPhysicsProvider.STATE.md) | enum | Physics provider lifecycle state |
