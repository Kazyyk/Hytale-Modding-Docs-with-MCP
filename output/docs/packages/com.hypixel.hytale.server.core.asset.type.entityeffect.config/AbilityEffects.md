---
title: "AbilityEffects"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.entityeffect.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.entityeffect.config.AbilityEffects"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "entity"
---
**Package:** `com.hypixel.hytale.server.core.asset.type.entityeffect.config`

```java
public class AbilityEffects implements NetworkSerializable<com.hypixel.hytale.protocol.AbilityEffects>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `Set<InteractionType>` | `disabled` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `AbilityEffects(@Nonnull Set<InteractionType> disabled)` |
| `protected` | `` | `AbilityEffects()` |
| `public` | `com.hypixel.hytale.protocol.AbilityEffects` | `toPacket()` |
| `public` | `String` | `toString()` |
