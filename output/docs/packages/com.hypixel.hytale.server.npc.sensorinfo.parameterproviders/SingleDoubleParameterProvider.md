---
title: "SingleDoubleParameterProvider"
kind: "class"
package: "com.hypixel.hytale.server.npc.sensorinfo.parameterproviders"
fqcn: "com.hypixel.hytale.server.npc.sensorinfo.parameterproviders.SingleDoubleParameterProvider"
api_surface: false
extends: "SingleParameterProvider"
implements: ["DoubleParameterProvider"]
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
public class SingleDoubleParameterProvider extends SingleParameterProvider implements DoubleParameterProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `double` | `value` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `double` | `getDoubleParameter()` |
| `@Override public` | `void` | `clear()` |
| `public` | `void` | `overrideDouble(double value)` |
