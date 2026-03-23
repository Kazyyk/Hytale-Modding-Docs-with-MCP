---
title: "com.hypixel.hytale.builtin.deployables.config"
kind: "package"
package: "com.hypixel.hytale.builtin.deployables.config"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "deployables"
  - "config"
---

**Package:** `com.hypixel.hytale.builtin.deployables.config`

Configuration classes for the deployable system (turrets, traps, AoE effects). Provides the abstract `DeployableConfig` base with codec-driven JSON deserialization, plus specialized subclasses for area-of-effect damage, trap fuse/trigger mechanics, spawner hybrids, and turret targeting/projectile logic.

## Types

| Type | Kind | Description |
|---|---|---|
| [DeployableConfig](DeployableConfig.md) | class | Abstract base configuration for all deployable types. |
| [DeployableAoeConfig](DeployableAoeConfig.md) | class | Area-of-effect deployable configuration extending `DeployableConfig`. |
| [DeployableSpawner](DeployableSpawner.md) | class | Asset-mapped deployable spawner definition. |
| [DeployableTrapConfig](DeployableTrapConfig.md) | class | Trap deployable extending `DeployableAoeConfig`. |
| [DeployableTrapSpawnerConfig](DeployableTrapSpawnerConfig.md) | class | Trap-spawner hybrid extending `DeployableTrapConfig`. |
| [DeployableTurretConfig](DeployableTurretConfig.md) | class | Turret deployable extending `DeployableConfig`. |
