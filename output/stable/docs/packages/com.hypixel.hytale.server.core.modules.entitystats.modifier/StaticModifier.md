---
title: "StaticModifier"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats.modifier"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.modifier.StaticModifier"
api_surface: true
extends: "Modifier"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "entitystats"
  - "modifier"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.modifier`

```java
public class StaticModifier extends Modifier
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<StaticModifier>` | `CODEC` |
| `public static final` | `BuilderCodec<StaticModifier>` | `ENTITY_CODEC` |
| `protected` | `StaticModifier.CalculationType` | `calculationType` |
| `protected` | `float` | `amount` |

## Constructors

| Modifier | Signature |
|---|---|
| `protected` | `StaticModifier()` |
| `public` | `StaticModifier(Modifier.ModifierTarget target, StaticModifier.CalculationType calculationType, float amount)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `StaticModifier.CalculationType` | `getCalculationType()` |
| `public` | `float` | `getAmount()` |
| `@Override public` | `float` | `apply(float statValue)` |
| `@Nonnull @Override public` | `com.hypixel.hytale.protocol.Modifier` | `toPacket()` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |

## Inner Types

- `StaticModifier.CalculationType`
