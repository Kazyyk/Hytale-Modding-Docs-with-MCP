---
title: "EnvironmentColumn"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.environment"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.environment.EnvironmentColumn"
api_surface: true
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "environment"
---
**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.environment`

```java
public class EnvironmentColumn
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `int` | `MIN` | `Integer.MIN_VALUE` |
| `public static final` | `int` | `MAX` | `Integer.MAX_VALUE` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `MIN` |
| `public static final` | `int` | `MAX` |
| `private` | `IntArrayList` | `maxYs` |
| `private` | `IntArrayList` | `values` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `EnvironmentColumn(@Nonnull int[] maxYs, @Nonnull int[] values)` |
| `public` | `` | `EnvironmentColumn(@Nonnull IntArrayList maxYs, @Nonnull IntArrayList values)` |
| `public` | `` | `EnvironmentColumn(int initialId)` |
| `public` | `int` | `size()` |
| `public` | `int` | `getValue(int index)` |
| `public` | `int` | `getValueMin(int index)` |
| `public` | `int` | `getValueMax(int index)` |
| `public` | `int` | `indexOf(int y)` |
| `public` | `void` | `set(int value)` |
| `public` | `int` | `get(int y)` |
| `public` | `void` | `set(int y, int value)` |
| `public` | `int` | `getMin(int y)` |
| `public` | `int` | `getMax(int y)` |
| `public` | `void` | `set(int fromY, int toY, int value)` |
| `public` | `void` | `resetTo(@Nonnull int[] maxYs, @Nonnull int[] values)` |
| `public` | `void` | `serialize(@Nonnull ByteBuf buf, @Nonnull IntObjectConsumer<ByteBuf> valueSerializer)` |
| `public` | `void` | `serializeProtocol(@Nonnull ByteBuf buf)` |
| `public` | `void` | `deserialize(@Nonnull ByteBuf buf, @Nonnull ToIntFunction<ByteBuf> valueDeserializer)` |
| `public` | `void` | `copyFrom(@Nonnull EnvironmentColumn other)` |
| `public` | `void` | `trim()` |
| `public` | `boolean` | `equals(@Nullable Object o)` |
| `public` | `int` | `hashCode()` |
| `public` | `String` | `toString()` |
