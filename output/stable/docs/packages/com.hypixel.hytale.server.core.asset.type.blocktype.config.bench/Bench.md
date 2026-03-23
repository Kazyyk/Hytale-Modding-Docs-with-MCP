---
title: "Bench"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench.Bench"
api_surface: true
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.Bench>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blocktype"
  - "config"
  - "bench"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config.bench`

```java
public abstract class Bench implements NetworkSerializable<com.hypixel.hytale.protocol.Bench>
```

Abstract base class for crafting bench configurations with tier levels, sound events, and interaction references.

## Constants

| Type | Name |
|---|---|
| `ObjectCodecMapCodec<BenchType, Bench>` | `CODEC` |
| `BuilderCodec<Bench>` | `BASE_CODEC` |
| `BuilderCodec<Bench.BenchSlot>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `BenchType` | `getType()` |
| `public` | `String` | `getId()` |
| `public` | `String` | `getDescriptiveLabel()` |
| `public` | `BenchTierLevel` | `getTierLevel(int tierLevel)` |
| `public` | `BenchUpgradeRequirement` | `getUpgradeRequirement(int tierLevel)` |
| `public` | `String` | `getLocalOpenSoundEventId()` |
| `public` | `int` | `getLocalOpenSoundEventIndex()` |
| `public` | `String` | `getLocalCloseSoundEventId()` |
| `public` | `int` | `getLocalCloseSoundEventIndex()` |
| `public` | `String` | `getCompletedSoundEventId()` |
| `public` | `int` | `getCompletedSoundEventIndex()` |
| `public` | `String` | `getFailedSoundEventId()` |
| `public` | `int` | `getFailedSoundEventIndex()` |
| `public` | `String` | `getBenchUpgradeSoundEventId()` |
| `public` | `int` | `getBenchUpgradeSoundEventIndex()` |
| `public` | `String` | `getBenchUpgradeCompletedSoundEventId()` |
| `public` | `int` | `getBenchUpgradeCompletedSoundEventIndex()` |
| `public` | `RootInteraction` | `getRootInteraction()` |
| `public` | `com.hypixel.hytale.protocol.Bench` | `toPacket()` |
| `public` | `boolean` | `equals(Object o)` |
| `public` | `int` | `hashCode()` |
| `public` | `String` | `toString()` |
| `public static` | `void` | `registerRootInteraction(BenchType benchType, RootInteraction interaction)` |
| `public` | `String` | `getIcon()` |
| `public` | `boolean` | `equals(@Nullable Object o)` |
