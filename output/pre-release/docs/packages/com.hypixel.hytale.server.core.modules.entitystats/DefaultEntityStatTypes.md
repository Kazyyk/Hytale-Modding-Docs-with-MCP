---
title: "DefaultEntityStatTypes"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.DefaultEntityStatTypes"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "assets"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset`

```java
public abstract class DefaultEntityStatTypes
```

Provides cached index lookups for the six built-in entity stat types. Indices are refreshed from the `EntityStatType` asset map on asset load events.

## Static Methods

| Method | Return Type | Description |
|---|---|---|
| `getHealth()` | `int` | Index of the "Health" stat. |
| `getOxygen()` | `int` | Index of the "Oxygen" stat. |
| `getStamina()` | `int` | Index of the "Stamina" stat. |
| `getMana()` | `int` | Index of the "Mana" stat. |
| `getSignatureEnergy()` | `int` | Index of the "SignatureEnergy" stat. |
| `getAmmo()` | `int` | Index of the "Ammo" stat. |
| `update()` | `void` | Re-resolves all indices from the asset map. Called on startup and asset reload. |
