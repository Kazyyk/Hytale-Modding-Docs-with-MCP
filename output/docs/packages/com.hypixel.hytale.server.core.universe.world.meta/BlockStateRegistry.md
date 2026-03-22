---
title: "BlockStateRegistry"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.meta"
fqcn: "com.hypixel.hytale.server.core.universe.world.meta.BlockStateRegistry"
api_surface: true
extends: "Registry<BlockStateRegistration>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "block"
  - "state"
  - "registry"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.meta`

```java
public class BlockStateRegistry extends Registry<BlockStateRegistration>
```

A registry facade for plugins to register block state types. Delegates to [BlockStateModule](BlockStateModule.md) for the actual ECS component registration, wrapping results in [BlockStateRegistration](BlockStateRegistration.md) handles with precondition checking.

## Constructors

```java
public BlockStateRegistry(@Nonnull List<BooleanConsumer> registrations, BooleanSupplier precondition, String preconditionMessage)
```

## Instance Methods

```java
@Nullable
public <T extends BlockState> BlockStateRegistration registerBlockState(@Nonnull Class<T> clazz, @Nonnull String key, Codec<T> codec)
```

Registers a block state class with a codec key. Checks preconditions before delegating to `BlockStateModule`.

```java
@Nullable
public <T extends BlockState, D extends StateData> BlockStateRegistration registerBlockState(@Nonnull Class<T> clazz, @Nonnull String key, Codec<T> codec, Class<D> dataClass, Codec<D> dataCodec)
```

Registers a block state class along with its `StateData` class and codec.
