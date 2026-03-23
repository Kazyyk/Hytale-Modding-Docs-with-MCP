---
title: "ValueWrappedInfoProvider"
kind: "class"
package: "com.hypixel.hytale.server.npc.sensorinfo"
fqcn: "com.hypixel.hytale.server.npc.sensorinfo.ValueWrappedInfoProvider"
api_surface: false
extends: ~
implements: 
  - "InfoProvider"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.sensorinfo`

```java
public class ValueWrappedInfoProvider implements InfoProvider
```

Implementation of `InfoProvider`.

## Fields

| Field | Type | Description |
|---|---|---|
| `wrappedProvider` | `InfoProvider` | final InfoProvider field. |
| `parameterProvider` | `ParameterProvider` | final ParameterProvider field. |

## Constructors

| Constructor | Description |
|---|---|
| `ValueWrappedInfoProvider(@Nullable InfoProvider wrappedProvider, @Nonnull ParameterProvider parameterProvider)` | Creates a new ValueWrappedInfoProvider instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getPositionProvider()` | `IPositionProvider` | public method. |
| `getParameterProvider(int parameter)` | `ParameterProvider` | public method. |
| `getExtraInfo(Class<E> clazz)` | `E` | public method. |
| `passExtraInfo(E provider)` | `void` | public method. |
| `getPassedExtraInfo(Class<E> clazz)` | `E` | public method. |
| `hasPosition()` | `boolean` | public method. |
