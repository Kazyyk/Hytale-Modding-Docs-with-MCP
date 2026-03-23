---
title: "InitialBeaconDelay"
kind: "class"
package: "com.hypixel.hytale.server.spawning.beacons"
fqcn: "com.hypixel.hytale.server.spawning.beacons.InitialBeaconDelay"
api_surface: false
extends: null
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "spawning"
  - "beacons"
  - "component"
---

**Package:** `com.hypixel.hytale.server.spawning.beacons`

```java
public class InitialBeaconDelay implements Component<EntityStore>
```

An `EntityStore` component that imposes a delay before a spawn beacon begins spawning after being loaded. Added to legacy spawn beacons on `AddReason.LOAD` with a default delay of 15 seconds. The [SpawnBeaconSystems.LoadTimeDelay](SpawnBeaconSystems.LoadTimeDelay.md) system ticks the delay down and removes the component when it expires.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, InitialBeaconDelay>` | `getComponentType()` |
| `public` | `void` | `setLoadTimeSpawnDelay(double loadTimeSpawnDelay)` |
| `public` | `boolean` | `tickLoadTimeSpawnDelay(float dt)` |
| `public` | `void` | `setupInitialSpawnDelay(@Nonnull double[] initialSpawnDelay)` |
| `@Nonnull public` | `Component<EntityStore>` | `clone()` |
