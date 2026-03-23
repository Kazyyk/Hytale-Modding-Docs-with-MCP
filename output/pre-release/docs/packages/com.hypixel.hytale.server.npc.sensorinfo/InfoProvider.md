---
title: "InfoProvider"
kind: "interface"
package: "com.hypixel.hytale.server.npc.sensorinfo"
fqcn: "com.hypixel.hytale.server.npc.sensorinfo.InfoProvider"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.sensorinfo`

```java
public interface InfoProvider
```

Interface defining: `getPositionProvider()`, `getParameterProvider()`, `getExtraInfo()`, `passExtraInfo()`....

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getPositionProvider()` | `IPositionProvider` | package-private method. |
| `getParameterProvider(int var1)` | `ParameterProvider` | package-private method. |
| `getExtraInfo(Class<E> var1)` | `E` | package-private method. |
| `passExtraInfo(E var1)` | `void` | package-private method. |
| `getPassedExtraInfo(Class<E> var1)` | `E` | package-private method. |
| `hasPosition()` | `boolean` | package-private method. |
