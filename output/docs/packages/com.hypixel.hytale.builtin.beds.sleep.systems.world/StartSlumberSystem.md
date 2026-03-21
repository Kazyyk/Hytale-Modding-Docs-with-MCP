---
title: "StartSlumberSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.sleep.systems.world"
fqcn: "com.hypixel.hytale.builtin.beds.sleep.systems.world.StartSlumberSystem"
api_surface: false
extends: "DelayedSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "beds"
  - "sleep"
  - "systems"
---

**Package:** `com.hypixel.hytale.builtin.beds.sleep.systems.world`

```java
public class StartSlumberSystem extends DelayedSystem<EntityStore>
```

ECS system handling StartSlumber tick processing.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull private static final` | `Duration` | `NODDING_OFF_DURATION` | `Duration.ofMillis(3200L)` |
| `@Nonnull private static final` | `Duration` | `WAKE_UP_AUTOSLEEP_DELAY` | `Duration.ofHours(1L)` |
| `private static final` | `float` | `SYSTEM_INTERVAL_S` | `0.3F` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `ComponentType<EntityStore, PlayerSomnolence>` | `playerSomnolenceComponentType` |
| `@Nonnull private final` | `ResourceType<EntityStore, WorldSomnolence>` | `worldSomnolenceResourceType` |
| `@Nonnull private final` | `ResourceType<EntityStore, WorldTimeResource>` | `worldTimeResourceType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `StartSlumberSystem(@Nonnull ComponentType<EntityStore, PlayerSomnolence> playerSomnolenceComponentType,
        @Nonnull ResourceType<EntityStore, WorldSomnolence> worldSomnolenceResourceType,
        @Nonnull ResourceType<EntityStore, WorldTimeResource> worldTimeResourceType)` |
| `@Override public` | `void` | `delayedTick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)` |
| `private` | `void` | `checkIfEveryoneIsReadyToSleep(@Nonnull Store<EntityStore> store)` |
| `private` | `Instant` | `computeWakeupInstant(@Nonnull Instant now, float wakeUpHour)` |
| `private static` | `float` | `computeIrlSeconds(@Nonnull Instant startInstant, @Nonnull Instant targetInstant)` |
| `private` | `boolean` | `isEveryoneReadyToSleep(@Nonnull ComponentAccessor<EntityStore> store)` |
| `public static` | `boolean` | `isReadyToSleep(@Nonnull ComponentAccessor<EntityStore> store, @Nullable Ref<EntityStore> ref)` |
| `public static` | `boolean` | `canNotifyOthersAboutTryingToSleep(@Nonnull ComponentAccessor<EntityStore> store, @Nullable Ref<EntityStore> ref)` |
