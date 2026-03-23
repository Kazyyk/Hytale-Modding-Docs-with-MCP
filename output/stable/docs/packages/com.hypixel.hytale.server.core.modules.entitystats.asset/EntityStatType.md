---
title: "EntityStatType"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats.asset"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset.EntityStatType"
api_surface: true
extends: null
implements:
  - "JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, EntityStatType>>"
  - "NetworkSerializable<com.hypixel.hytale.protocol.EntityStatType>"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "entitystats"
  - "asset"
  - "api-surface"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset`

```java
public class EntityStatType implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, EntityStatType>>, NetworkSerializable<com.hypixel.hytale.protocol.EntityStatType>
```

Asset definition for an entity stat type (e.g., Health, Oxygen, Stamina). Defines the stat's initial value, min/max bounds, regeneration rules, value effects at min/max, reset behavior, and display flags. Stats can be shared across entities and support conditional regeneration with modifiers.

Serialized via `AssetBuilderCodec` with inheritance support. Each stat type is registered in an `IndexedLookupTableAssetMap` for efficient network-indexed lookup.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String, EntityStatType>` | `CODEC` |
| `public static final` | `EntityStatType` | `UNKNOWN` |
| `public static final` | `int` | `UNKNOWN_ID` |
| `protected` | `String` | `id` |
| `protected` | `float` | `initialValue` |
| `protected` | `float` | `min` |
| `protected` | `float` | `max` |
| `protected` | `boolean` | `shared` |
| `protected` | `EntityStatType.Regenerating[]` | `regenerating` |
| `protected` | `boolean` | `ignoreInvulnerability` |
| `protected` | `boolean` | `hideFromTooltip` |
| `protected` | `EntityStatType.EntityStatEffects` | `minValueEffects` |
| `protected` | `EntityStatType.EntityStatEffects` | `maxValueEffects` |
| `protected` | `EntityStatResetBehavior` | `resetBehavior` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String, EntityStatType, IndexedLookupTableAssetMap<String, EntityStatType>>` | `getAssetStore()` |
| `public static` | `IndexedLookupTableAssetMap<String, EntityStatType>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `boolean` | `isUnknown()` |
| `public` | `float` | `getInitialValue()` |
| `public` | `float` | `getMin()` |
| `public` | `float` | `getMax()` |
| `public` | `boolean` | `getIgnoreInvulnerability()` |
| `public` | `boolean` | `isShared()` |
| `public` | `EntityStatType.EntityStatEffects` | `getMinValueEffects()` |
| `public` | `EntityStatType.EntityStatEffects` | `getMaxValueEffects()` |
| `@Nullable public` | `EntityStatType.Regenerating[]` | `getRegenerating()` |
| `public` | `EntityStatResetBehavior` | `getResetBehavior()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.EntityStatType` | `toPacket()` |
| `@Nonnull public static` | `EntityStatType` | `getUnknownFor(String unknownId)` |

## Inner Types

### EntityStatEffects

```java
public static class EntityStatEffects implements NetworkSerializable<com.hypixel.hytale.protocol.EntityStatEffects>
```

Effects triggered when a stat reaches its min or max value. Can include a sound event, model particles, and interactions. The `triggerAtZero` flag controls whether effects fire at zero rather than the stat's minimum. Has `getSoundEventId()`, `getSoundEventIndex()`, `getParticles()`, `getInteractions()`, `triggerAtZero()`.

### Regenerating

```java
public static class Regenerating
```

Defines a regeneration rule with interval, amount, regen type (ADDITIVE or PERCENTAGE), optional conditions, and modifiers. The `clampAtZero` flag prevents regeneration from taking the stat below zero. Has `getInterval()`, `getAmount()`, `clampAmount()`, `getRegenType()`, `getConditions()`, `getModifiers()`.

#### RegenType

```java
public static enum RegenType
```

| Constant | Description |
|---|---|
| `ADDITIVE` | Flat amount added per interval. |
| `PERCENTAGE` | Percentage-based regeneration per interval. |
