---
title: "CoopBlock.CoopResident"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.states"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.states.CoopBlock.CoopResident"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "component"
  - "coop"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.states`

```java
public static class CoopBlock.CoopResident
```

Represents a single resident record within a [CoopBlock](CoopBlock.md). Tracks the captured NPC metadata, a persistent reference to the spawned entity in the world, whether the entity is currently deployed, and the last time produce was harvested.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `CapturedNPCMetadata` | `metadata` |
| `@Nullable protected` | `PersistentRef` | `persistentRef` |
| `protected` | `boolean` | `deployedToWorld` |
| `protected` | `Instant` | `lastProduced` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CapturedNPCMetadata` | `getMetadata()` |
| `@Nullable public` | `PersistentRef` | `getPersistentRef()` |
| `public` | `void` | `setPersistentRef(@Nullable PersistentRef persistentRef)` |
| `public` | `boolean` | `getDeployedToWorld()` |
| `public` | `void` | `setDeployedToWorld(boolean deployedToWorld)` |
| `public` | `Instant` | `getLastProduced()` |
| `public` | `void` | `setLastProduced(Instant lastProduced)` |
