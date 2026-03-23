---
title: "DamageCalculatorSystems.Sequence"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageCalculatorSystems.Sequence"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "calculator"
  - "codec"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageCalculatorSystems.Sequence
```

A codec-serializable hit counter used in damage sequence tracking. Contains a single `hits` field serialized as `"Hits"` in JSON. Wrapped by [DamageCalculatorSystems.DamageSequence](DamageCalculatorSystems.DamageSequence.md).

## Static Fields

| Field | Type | Description |
|---|---|---|
| `CODEC` | `BuilderCodec<DamageCalculatorSystems.Sequence>` | Builder codec for JSON serialization with key `"Hits"`. |

## Constructors

```java
public Sequence()
```

Default constructor; hits defaults to 0.

```java
public Sequence(int hits)
```

Creates a sequence with the given hit count.

## Methods

```java
public int getHits()
```

Returns the current hit count.

```java
@Nonnull
@Override
public String toString()
```

Returns a string representation: `"Sequence{hits=N}"`.

## Related Types

- [DamageCalculatorSystems.DamageSequence](DamageCalculatorSystems.DamageSequence.md) -- wraps this sequence
- [DamageCalculatorSystems](DamageCalculatorSystems.md) -- parent class
