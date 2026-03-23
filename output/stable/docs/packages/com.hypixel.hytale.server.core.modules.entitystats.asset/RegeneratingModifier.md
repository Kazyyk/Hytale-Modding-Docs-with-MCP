---
title: "RegeneratingModifier"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats.asset.modifier"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.modifier.RegeneratingModifier"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "entitystats"
  - "modifier"
  - "regeneration"
  - "api-surface"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset.modifier`

```java
public class RegeneratingModifier
```

Modifies the regeneration amount of an entity stat based on conditions. When all conditions are met, returns the configured `amount` as a multiplier; otherwise returns `1.0` (no modification).

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<RegeneratingModifier>` | `CODEC` |
| `protected` | `Condition[]` | `conditions` |
| `protected` | `float` | `amount` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `float` | `getModifier(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, Instant currentTime)` |
