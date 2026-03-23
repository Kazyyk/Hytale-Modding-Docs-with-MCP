---
title: "DefaultEntityStatTypes"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats.asset"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.DefaultEntityStatTypes"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "entitystats"
  - "defaults"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset`

```java
public abstract class DefaultEntityStatTypes
```

Provides cached asset map indices for the built-in entity stat types: Health, Oxygen, Stamina, Mana, SignatureEnergy, and Ammo. Indices are updated via `update()` after the `EntityStatType` asset map is loaded.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `int` | `getHealth()` |
| `public static` | `int` | `getOxygen()` |
| `public static` | `int` | `getStamina()` |
| `public static` | `int` | `getMana()` |
| `public static` | `int` | `getSignatureEnergy()` |
| `public static` | `int` | `getAmmo()` |
| `public static` | `void` | `update()` |
