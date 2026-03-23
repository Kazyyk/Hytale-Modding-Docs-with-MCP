---
title: "SingleIntParameterProvider"
kind: "class"
package: "com.hypixel.hytale.server.npc.sensorinfo.parameterproviders"
fqcn: "com.hypixel.hytale.server.npc.sensorinfo.parameterproviders.SingleIntParameterProvider"
api_surface: false
extends: "SingleParameterProvider"
implements: ["IntParameterProvider"]
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
public class SingleIntParameterProvider extends SingleParameterProvider implements IntParameterProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `value` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `getIntParameter()` |
| `@Override public` | `void` | `clear()` |
| `public` | `void` | `overrideInt(int value)` |
