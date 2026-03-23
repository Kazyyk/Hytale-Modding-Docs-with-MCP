---
title: "AttitudeMemoryEntry"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.AttitudeMemoryEntry"
api_surface: false
extends: ~
implements: ["Tickable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class AttitudeMemoryEntry implements Tickable
```

A tickable entry representing a temporary attitude override for an NPC. Tracks an `Attitude` value with a decaying duration timer.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `tick(float dt)` |
| `public` | `double` | `getRemainingDuration()` |
| `public` | `double` | `getInitialDuration()` |
| `public` | `Attitude` | `getAttitudeOverride()` |
| `public` | `boolean` | `isExpired()` |
