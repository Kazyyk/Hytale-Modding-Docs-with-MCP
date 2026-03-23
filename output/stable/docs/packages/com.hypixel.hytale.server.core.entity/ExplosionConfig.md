---
title: "ExplosionConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.entity"
fqcn: "com.hypixel.hytale.server.core.entity.ExplosionConfig"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.entity`

```java
public class ExplosionConfig
```

JSON-configurable explosion parameters. Codec fields include `DamageEntities`, `DamageBlocks`, `BlockDamageRadius`, `BlockDamageFalloff`, `BlockDropChance`, `EntityDamageRadius`, `EntityDamageFalloff`, `EntityDamage`, `Knockback`, and `ItemTool` (for block damage type resolution). Used by `ExplodeInteraction` and `ExplosionUtils`.
