---
title: "RegeneratingValue"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.RegeneratingValue"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "regeneration"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats`

```java
public class RegeneratingValue
```

Tracks the regeneration tick state for a single `EntityStatType.Regenerating` entry. Handles interval-based regeneration with conditional activation, additive/percentage-based amounts, and modifier application.

## Constructors

```java
public RegeneratingValue(@Nonnull EntityStatType.Regenerating regenerating)
```

## Methods

| Method | Return Type | Description |
|---|---|---|
| `shouldRegenerate(ComponentAccessor<EntityStore>, Ref<EntityStore>, Instant, float, Regenerating)` | `boolean` | Decrements the interval counter and returns `true` when a regen tick fires and all conditions are met. |
| `regenerate(ComponentAccessor<EntityStore>, Ref<EntityStore>, Instant, float, EntityStatValue, float)` | `float` | Computes the regeneration amount (additive or percentage), applies modifiers, clamps the result, and returns the amount to add. |
| `getRegenerating()` | `EntityStatType.Regenerating` | Returns the regenerating definition. |

## Related Types

- [EntityStatValue](EntityStatValue.md) -- the stat value being regenerated
- [EntityStatType.Regenerating](EntityStatType.Regenerating.md) -- the asset definition for regeneration parameters
