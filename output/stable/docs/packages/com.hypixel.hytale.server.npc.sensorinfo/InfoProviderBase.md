---
title: "InfoProviderBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.sensorinfo"
fqcn: "com.hypixel.hytale.server.npc.sensorinfo.InfoProviderBase"
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
public abstract class InfoProviderBase implements InfoProvider
```

Implementation of `InfoProvider`.

## Fields

| Field | Type | Description |
|---|---|---|
| `parameterProvider` | `ParameterProvider` | final ParameterProvider field. |
| `extraProviders` | `Map<Class<? extends ExtraInfoProvider>, ExtraInfoProvider>` | final Map<Class<? extends ExtraInfoProvider>, ExtraInfoProvider> field. |
| `passedExtraInfo` | `ExtraInfoProvider` | ExtraInfoProvider field. |

## Constructors

| Constructor | Description |
|---|---|
| `InfoProviderBase()` | Creates a new InfoProviderBase instance. |
| `InfoProviderBase(ParameterProvider parameterProvider)` | Creates a new InfoProviderBase instance. |
| `InfoProviderBase(ParameterProvider parameterProvider, @Nonnull ExtraInfoProvider... providers)` | Creates a new InfoProviderBase instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getParameterProvider(int parameter)` | `ParameterProvider` | public method. |
| `getExtraInfo(Class<E> clazz)` | `E` | public method. |
| `passExtraInfo(E provider)` | `void` | public method. |
| `getPassedExtraInfo(Class<E> clazz)` | `E` | public method. |
