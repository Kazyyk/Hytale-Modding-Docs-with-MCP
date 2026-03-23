---
title: "MultipleParameterProvider"
kind: "class"
package: "com.hypixel.hytale.server.npc.sensorinfo.parameterproviders"
fqcn: "com.hypixel.hytale.server.npc.sensorinfo.parameterproviders.MultipleParameterProvider"
api_surface: false
extends: null
implements: ["ParameterProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "sensorinfo"
  - "parameterproviders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.sensorinfo.parameterproviders`

```java
public class MultipleParameterProvider implements ParameterProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Int2ObjectMap<ParameterProvider>` | `providers` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `ParameterProvider` | `getParameterProvider(int parameter)` |
| `@Override public` | `void` | `clear()` |
| `public` | `void` | `addParameterProvider(int parameter, ParameterProvider provider)` |
