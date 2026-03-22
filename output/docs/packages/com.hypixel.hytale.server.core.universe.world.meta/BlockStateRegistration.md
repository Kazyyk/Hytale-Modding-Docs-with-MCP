---
title: "BlockStateRegistration"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.meta"
fqcn: "com.hypixel.hytale.server.core.universe.world.meta.BlockStateRegistration"
api_surface: true
extends: "Registration"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "block"
  - "state"
  - "registration"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.meta`

```java
public class BlockStateRegistration extends Registration
```

A registration handle for a block state class, extending the generic `Registration` base with a reference to the registered `BlockState` subclass. Provides lifecycle control (enabled check, unregister callback) for block state registrations managed by [BlockStateModule](BlockStateModule.md).

## Constructors

```java
public BlockStateRegistration(Class<? extends BlockState> blockStateClass, BooleanSupplier isEnabled, Runnable unregister)
```

Creates a new registration for the given block state class.

```java
public BlockStateRegistration(@Nonnull BlockStateRegistration registration, BooleanSupplier isEnabled, Runnable unregister)
```

Copy constructor that wraps an existing registration with new lifecycle callbacks.

## Instance Methods

```java
public Class<? extends BlockState> getBlockStateClass()
```

Returns the `BlockState` subclass this registration represents.
