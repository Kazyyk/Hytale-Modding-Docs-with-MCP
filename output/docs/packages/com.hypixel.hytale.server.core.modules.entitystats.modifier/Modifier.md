---
title: "Modifier"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats.modifier"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.modifier.Modifier"
api_surface: true
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.Modifier>"]
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
public abstract class Modifier implements NetworkSerializable<com.hypixel.hytale.protocol.Modifier>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `CodecMapCodec<Modifier>` | `CODEC` |
| `protected static final` | `BuilderCodec<Modifier>` | `BASE_CODEC` |
| `protected` | `Modifier.ModifierTarget` | `target` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `Modifier()` |
| `public` | `Modifier(Modifier.ModifierTarget target)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `float` | `apply(float var1)` |
| `public` | `Modifier.ModifierTarget` | `getTarget()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.Modifier` | `toPacket()` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |

## Inner Types

- `Modifier.ModifierTarget`
